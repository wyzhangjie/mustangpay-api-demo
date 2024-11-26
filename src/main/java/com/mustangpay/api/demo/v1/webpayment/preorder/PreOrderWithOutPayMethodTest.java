package com.mustangpay.api.demo.v1.webpayment.preorder;

import com.mustangpay.api.constants.MustangpayApiConstantsV1;
import com.mustangpay.api.enums.CurrencyEnum;
import com.mustangpay.api.enums.OperationEnum;
import com.mustangpay.api.enums.PayMethodEnum;
import com.mustangpay.api.pojo.*;
import com.mustangpay.api.utils.mustangpay.MustangpayApiUtilsV1;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: hyssop
 * @Date: 08/27/2024
 */
@Slf4j
public class PreOrderWithOutPayMethodTest extends BaseTest {
    public static void main(String[] args) {
        // Assuming the Amount and Product classes are defined elsewhere with constructors as needed
        PreOrderWithManyPayMethodTest test = new PreOrderWithManyPayMethodTest();
        CreateCashierReq createCashierReq = test.fillPreOrderReq();
        MustangpayApiUtilsV1<CashierCreateResp> v1 = new MustangpayApiUtilsV1();
        ResponseResult<CashierCreateResp> result =  v1.callTest("PreOrderWithOutPayMethodTest", createCashierReq, OperationEnum.PRECREATE.getCode());
        log.info("PreOrderWithOutPayMethodTest result ->{}", result);

    }


    @Override
    List<String> fillPayMethodInfo() {
        List<String> payMethods = new ArrayList<>();
        payMethods.add(PayMethodEnum.CARD_PAYMENT.getCode());
        payMethods.add(PayMethodEnum.INSTANT_EFT.getCode());
        return payMethods;
    }
}
