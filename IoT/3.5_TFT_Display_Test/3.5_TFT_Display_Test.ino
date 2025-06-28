//Display Check
/*#include <MCUFRIEND_kbv.h>
#include <Adafruit_GFX.h>

MCUFRIEND_kbv tft;

void setup() {
  Serial.begin(9600);
  uint16_t ID = tft.readID();
  Serial.print("TFT ID = 0x");
  Serial.println(ID, HEX);
  if (ID == 0xD3D3) ID = 0x9486; // fallback for common shields
  tft.begin(ID);
  tft.setRotation(1);
  tft.fillScreen(TFT_RED);
  tft.setTextColor(TFT_WHITE);
  tft.setTextSize(3);
  tft.setCursor(40, 100);
  tft.println("Display OK");
}

void loop() {}
*/

//3.5 TFT LCD Shield's Builtin SD card holder check with SD card.
/*
#include <SPI.h>
#include <SD.h>
#define SD_CS 10

void setup() {
  Serial.begin(9600);
  if (!SD.begin(SD_CS)) {
    Serial.println("SD Card failed!");
  } else {
    Serial.println("SD Card OK.");
    File root = SD.open("/");
    while (true) {
      File entry = root.openNextFile();
      if (!entry) break;
      Serial.println(entry.name());
      entry.close();
    }
  }
}
void loop() {}
*/

//Check display size
/*
#include <MCUFRIEND_kbv.h>
#include <Adafruit_GFX.h>

MCUFRIEND_kbv tft;

void setup() {
  Serial.begin(9600);
  uint16_t ID = tft.readID();
  if (ID == 0xD3D3) ID = 0x9486;  // common fallback
  tft.begin(ID);
  tft.setRotation(1);
  tft.fillScreen(TFT_BLACK);

  Serial.print("TFT ID = 0x"); Serial.println(ID, HEX);
  Serial.print("Width: "); Serial.println(tft.width());
  Serial.print("Height: "); Serial.println(tft.height());

  tft.setTextColor(TFT_WHITE);
  tft.setTextSize(3);
  tft.setCursor(0, 0);
  tft.print(String(tft.width()) + " x " + String(tft.height()));
}

void loop() {}
*/


//Display image (image must be 24bit.)

#include <MCUFRIEND_kbv.h>
#include <Adafruit_GFX.h>
#include <SD.h>
#include <SPI.h>

MCUFRIEND_kbv tft;
#define SD_CS 10

void setup() {
  Serial.begin(9600);
  uint16_t ID = tft.readID();
  Serial.print("TFT ID: 0x"); Serial.println(ID, HEX);
  if (ID == 0xD3D3) ID = 0x9486;
  tft.begin(ID);
  tft.setRotation(1);
  tft.fillScreen(TFT_BLACK);
  tft.setTextColor(TFT_WHITE);
  tft.setTextSize(2);
  tft.setCursor(10, 10);
  tft.println("Starting...");

  if (!SD.begin(SD_CS)) {
    tft.setCursor(10, 40);
    tft.println("SD init FAIL");
    return;
  }
  tft.setCursor(10, 40);
  tft.println("SD init OK");

  showBMP("test.bmp", 0, 0);
}

void loop() {}

void showBMP(const char *filename, int x, int y) {
  File bmpFile = SD.open(filename);
  if (!bmpFile) {
    tft.setCursor(10, 70);
    tft.println("File open FAIL");
    return;
  }

  if (read16(bmpFile) != 0x4D42) {
    tft.setCursor(10, 100);
    tft.println("Not BMP");
    return;
  }

  read32(bmpFile); read32(bmpFile);
  uint32_t imageOffset = read32(bmpFile);
  read32(bmpFile); // DIB header
  int bmpWidth = read32(bmpFile);
  int bmpHeight = read32(bmpFile);
  if (read16(bmpFile) != 1 || read16(bmpFile) != 24) {
    tft.setCursor(10, 130);
    tft.println("BMP not 24bit");
    return;
  }
  read32(bmpFile); // skip compression

  uint32_t rowSize = (bmpWidth * 3 + 3) & ~3;
  bmpFile.seek(imageOffset);

  uint8_t r, g, b;
  for (int row = 0; row < bmpHeight; row++) {
    bmpFile.seek(imageOffset + (bmpHeight - 1 - row) * rowSize);
    for (int col = 0; col < bmpWidth; col++) {
      b = bmpFile.read();
      g = bmpFile.read();
      r = bmpFile.read();
      uint16_t color = tft.color565(r, g, b);
      tft.drawPixel(x + col, y + row, color);
    }
  }

  bmpFile.close();
}

uint16_t read16(File &f) {
  uint16_t result;
  ((uint8_t *)&result)[0] = f.read();
  ((uint8_t *)&result)[1] = f.read();
  return result;
}

uint32_t read32(File &f) {
  uint32_t result;
  ((uint8_t *)&result)[0] = f.read();
  ((uint8_t *)&result)[1] = f.read();
  ((uint8_t *)&result)[2] = f.read();
  ((uint8_t *)&result)[3] = f.read();
  return result;
}


