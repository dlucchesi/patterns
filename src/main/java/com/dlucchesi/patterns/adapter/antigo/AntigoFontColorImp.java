package com.dlucchesi.patterns.adapter.antigo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AntigoFontColorImp implements AntigoFontColor {

  private String fontColor;

  public AntigoFontColorImp() {
    this.fontColor = null;
  }


}
