package com.mustangpay.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: hyssop
 * @Date: 08/28/2024
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum OperationEnum {
    PRECREATE("preCreate", "商户预下单"),
    CHECKORDER("checkOrder", "商户查询订单状态"),
    H2H_PRECREATE("h2hPreCreate", "商户h2h预下单"),
    ;

    private  String code;
    private  String desc;
    public void OperationEnum(String code, String desc){
        this.code = code;
        this.desc = desc;
    }

}
