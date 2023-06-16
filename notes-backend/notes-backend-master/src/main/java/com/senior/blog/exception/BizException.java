package com.senior.blog.exception;

import static com.senior.blog.enums.StatusCodeEnum.FAIL;

import com.senior.blog.enums.StatusCodeEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 业务异常
 *
 * @author senior
 *
 */
@Getter
@AllArgsConstructor
public class BizException extends RuntimeException {

    /**
     * 错误信息
     */
    private final String message;
    /**
     * 错误码
     */
    private Integer code = FAIL.getCode();

    public BizException(String message) {
        this.message = message;
    }

    public BizException(StatusCodeEnum statusCodeEnum) {
        this.code = statusCodeEnum.getCode();
        this.message = statusCodeEnum.getDesc();
    }

}
