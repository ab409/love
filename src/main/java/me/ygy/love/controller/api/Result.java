package me.ygy.love.controller.api;

import com.alibaba.fastjson.JSONObject;

import lombok.Data;
import me.ygy.love.enums.ResultCodeEnum;

/**
 * @author yuguangyuan
 */
@Data
public class Result<T>{

  public static Result SUCCESS = new Result(ResultCodeEnum.SUCCESS.getCode(), "success");
  public static Result FAIL = new Result(ResultCodeEnum.FAIL.getCode(), "failed");

  public Result(int code, String msg) {
   this(code, msg, null);
  }

  public Result(int code, String msg, T data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

  private final int code;
  private final String msg;
  private T data;

  public static <T> String success(T data) {
    return new Result(ResultCodeEnum.SUCCESS.getCode(), "success", data).toJson();
  }

  public static <T> String fail() {
    return new Result(ResultCodeEnum.SUCCESS.getCode(), "success", null).toJson();
  }

  public String toJson() {
    return JSONObject.toJSONString(this);
  }
}
