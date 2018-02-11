package me.ygy.love.enums;

/**
 * @author yuguangyuan
 */
public enum  NameTestResultEnum {

  FIRST_FAIL(0),
  SECOND_FAIL(1),
  MAN_YGY(3),
  WOMEN_YJY(4),
  SUCCESS(5);

  private NameTestResultEnum(int code) {
    this.code = code;
  }

  private int code;

  public int getCode() {
    return code;
  }
}
