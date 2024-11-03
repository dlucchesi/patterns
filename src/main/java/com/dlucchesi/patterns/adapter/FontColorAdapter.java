package com.dlucchesi.patterns.adapter;

import com.dlucchesi.patterns.adapter.antigo.AntigoFontColor;
import com.dlucchesi.patterns.adapter.novo.FontColor;
import com.dlucchesi.patterns.adapter.novo.TextColorEnum;
import lombok.Getter;


@Getter
public class FontColorAdapter implements AntigoFontColor {

  private final FontColor fontColor;

  public FontColorAdapter(FontColor fontColor) {
    this.fontColor = fontColor;
  }

  @Override
  public String getFontColor() {
    if (TextColorEnum.Normal.equals(fontColor.getTextColor())) {
      return "000000";
    } else if (TextColorEnum.Ok.equals(fontColor.getTextColor())) {
      return "006100";
    } else if (TextColorEnum.Warning.equals(fontColor.getTextColor())) {
      return "9C5700";
    } else if (TextColorEnum.Error.equals(fontColor.getTextColor())) {
      return "9C0006";
    } else {
      new IllegalArgumentException("Invalid color");
    }
    return null;
  }

  @Override
  public void setFontColor(String fontColor) {
    throw new UnsupportedOperationException("Operation not supported");
  }
}
