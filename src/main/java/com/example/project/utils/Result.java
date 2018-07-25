package com.example.project.utils;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModelProperty;

/**
 * 统一API响应结果封装
 */
public class Result {
    @ApiModelProperty(value = "响应码", example = "200:成功 400:失败 401:无权限 404:接口不存在 500:服务器内部错误")
    private int code;
    private String message;
    private Object data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
