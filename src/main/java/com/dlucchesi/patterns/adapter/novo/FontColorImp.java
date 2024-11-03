package com.dlucchesi.patterns.adapter.novo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FontColorImp implements FontColor {

  private TextColorEnum textColor;

  public FontColorImp(TextColorEnum textColor) {
    this.textColor = textColor;
  }

}
