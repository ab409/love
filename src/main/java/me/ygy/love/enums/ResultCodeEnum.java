package me.ygy.love.enums;

/**
 * @author yuguangyuan
 */
public enum ResultCodeEnum {
  SUCCESS(0, "SUCCESS"),
  FAIL(1, "FAIL");

  private int code;
  private String data;

  ResultCodeEnum(int index, String data) {
    this.code = index;
    this.data = data;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
