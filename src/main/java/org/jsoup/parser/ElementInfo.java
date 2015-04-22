package org.jsoup.parser;

import java.util.Set;

class ElementInfo {
  public final int endElementType;
  public final boolean childElementOk;
  public final Set<String> stopTags;
  public final boolean noScriptElement;
  public final boolean decodeEntities;
  public static final int END_ELEMENT_FORBIDDEN = 0;
  public static final int END_ELEMENT_OPTIONAL = 1;
  public static final int END_ELEMENT_REQUIRED = 2;
  
  /**
   * @param ok
   * @param type
   */
  public ElementInfo(final boolean ok, final int type) {
    this.childElementOk = ok;
    this.endElementType = type;
    this.stopTags = null;
    this.noScriptElement = false;
    this.decodeEntities = true;
  }
  
  /**
   * @param ok
   * @param type
   */
  public ElementInfo(final boolean ok, final int type, final Set<String> stopTags) {
    this.childElementOk = ok;
    this.endElementType = type;
    this.stopTags = stopTags;
    this.noScriptElement = false;
    this.decodeEntities = true;
  }

  public ElementInfo(final boolean ok, final int type, final Set<String> stopTags, final boolean noScriptElement) {
    this.childElementOk = ok;
    this.endElementType = type;
    this.stopTags = stopTags;
    this.noScriptElement = noScriptElement;
    this.decodeEntities = true;
  }

  public ElementInfo(final boolean ok, final int type, final boolean decodeEntities) {
    this.childElementOk = ok;
    this.endElementType = type;
    this.stopTags = null;
    this.noScriptElement = false;
    this.decodeEntities = decodeEntities;
  }
}
