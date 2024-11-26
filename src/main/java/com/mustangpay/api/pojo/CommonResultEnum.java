package com.mustangpay.api.pojo;

/**
 * @author zhangzhiwei
 * basic response enume
 */
public enum CommonResultEnum implements BaseResultEnum{

    SUCCESS("000000","success"),
    FAIL("999999","fail"),
    ERROR("999998","error"),
    UNKNOWN("999997","unknown");

    private String code;
    private String message;

    CommonResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
