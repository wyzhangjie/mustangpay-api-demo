package com.mustangpay.api.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: hyssop
 * @Date: 07/29/2024
 */
@Data
@ToString
public class OrderStatusResp implements Serializable {

    private String merchantId;

    private String merchantOrderNo;

    private String orderNo;

    private String orderStatus;

    private String merchantName;

    private String vatNumber;

    private String errorCode;

    private String errorMessage;

    private Amount vat;
    private String productName;
    private String productShortName;
    private String productDesc;
    /**
     * amount
     */
    private Amount amount;
    private String returnUrl;
    private Long completeTime;
    private Long createTime;
    private Long updateTime;

    private String payMethod;
}
