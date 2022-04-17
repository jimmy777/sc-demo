package com.app.core.common.base;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Y.Z.Y
 * @Descriptions: 结果返回集工具类
 * @Date: Created in 2022/4/17
 */
@Data
public class ApiResult implements Serializable {
    private static final long serialVersionUID = 4788192271992283041L;

    public static final int SUCCESS_CODE = 200;
    public static final int ERROR_CODE = 500;
    public static final int ILLEGAL_CODE = 100;

    public static final String SUCCESS_MESSAGE = "操作成功";
    public static final String ERROR_MESSAGE = "服务器异常";
    public static final String ILLEGAL_MESSAGE = "参数非法";

    private int code;
    private String message;
    private Map<String, Object> result = new HashMap<>();

    private ApiResult() {}

    /**
     * 操作成功
     */
    public static ApiResult success() {
        ApiResult res = new ApiResult();
        res.code = SUCCESS_CODE;
        res.message = SUCCESS_MESSAGE;
        return res;
    }

    /**
     * 服务器错误
     */
    public static ApiResult error() {
        ApiResult res = new ApiResult();
        res.code = ERROR_CODE;
        res.message = ERROR_MESSAGE;
        return res;
    }

    /**
     * 参数非法
     */
    public static ApiResult illegal() {
        ApiResult res = new ApiResult();
        res.code = ILLEGAL_CODE;
        res.message = ILLEGAL_MESSAGE;
        return res;
    }

    /**
     * 返回数据
     */
    public ApiResult put(String key, Object value) {
        this.result.put(key, value);
        return this;
    }

    /**
     * 修改消息内容
     */
    public ApiResult setMessage(String message) {
        this.message = message;
        return this;
    }
}
