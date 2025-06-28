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





