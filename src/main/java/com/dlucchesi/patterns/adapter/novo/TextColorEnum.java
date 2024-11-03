package com.dlucchesi.patterns.adapter.novo;

public enum TextColorEnum {

  Normal("000000", "FFFFFF"),
  Ok("8ED973", "E6E6E6"),
  Warning("FFC000", "FFEB9C"),
  Error("9C0006", "FFC7CE"),
  ;

  private final String fontColor;
  private final String backColor;

  TextColorEnum(String fontColor, String backColor) {
    this.fontColor = fontColor;
    this.backColor = backColor;
  }

  public String getFontColor() {
    return fontColor;
  }

  public String getBackColor() {
    return backColor;
  }
}
