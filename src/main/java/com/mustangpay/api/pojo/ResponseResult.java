package com.mustangpay.api.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {

    private String code;

    private String msg;

    private T data;


    public ResponseResult(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public ResponseResult(CommonResultEnum commonResultEnum){
        this.code = commonResultEnum.getCode();
        this.msg = commonResultEnum.getMessage();
    }
    public ResponseResult(CommonResultEnum commonResultEnum, T data){
        this.code = commonResultEnum.getCode();
        this.msg = commonResultEnum.getMessage();
        this.data = data;
    }

    public static <T> ResponseResult<T> success() {
        return new ResponseResult<T>(CommonResultEnum.SUCCESS);
    }

    public static <T> ResponseResult<T> success(T body) {
        return new ResponseResult<T>(CommonResultEnum.SUCCESS, body);
    }

    public static <T> ResponseResult<T> error(String code, String msg) {
        return new ResponseResult<T>(code, msg);
    }

    public static <T> ResponseResult<T> error(BaseResultEnum baseResultEnum, T data) {
        return new ResponseResult<>(baseResultEnum.getCode(),baseResultEnum.getMessage(), data);
    }

    public static <T> ResponseResult<T> error(BaseResultEnum baseResultEnum) {
        return new ResponseResult<T>(baseResultEnum.getCode(),baseResultEnum.getMessage());
    }

    public static <T> ResponseResult<T> error(String  errorMsg) {
        return new ResponseResult<>(CommonResultEnum.ERROR.getCode(),errorMsg);
    }


}
