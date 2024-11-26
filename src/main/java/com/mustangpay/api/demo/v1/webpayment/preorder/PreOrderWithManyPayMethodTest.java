package com.mustangpay.api.demo.v1.webpayment.preorder;

import com.mustangpay.api.constants.MustangpayApiConstantsV1;
import com.mustangpay.api.enums.OperationEnum;
import com.mustangpay.api.enums.PayMethodEnum;
import com.mustangpay.api.pojo.*;
import com.mustangpay.api.enums.CurrencyEnum;
import com.mustangpay.api.utils.mustangpay.MustangpayApiUtilsV1;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: hyssop
 * @Date: 08/28/2024
 */
@Slf4j
public class PreOrderWithManyPayMethodTest extends BaseTest {
    public static void main(String[] args) {
        // Assuming the Amount and Product classes are defined elsewhere with constructors as needed
        PreOrderWithManyPayMethodTest test = new PreOrderWithManyPayMethodTest();
        CreateCashierReq createCashierReq = test.fillPreOrderReq();
        MustangpayApiUtilsV1<CashierCreateResp> v1 = new MustangpayApiUtilsV1();
        ResponseResult<CashierCreateResp> result =  v1.callTest("PreOrderWithManyPayMethodTest", createCashierReq, OperationEnum.PRECREATE.getCode());
        //example: {result={"code":"000000","data":{"cashierUrl":"http://110.238.76.97:90/pre-cashier?orderNo=qDsST5U5zPzdKre7N9ueEXLV7ECYTNw0HVM9v0a4Owc=","merchantId":"4449999220","orderNo":"2408281010032775693","orderStatus":"Initial","reference":"993eb0b4-cae7-49b6-a34c-6369317f08cb"},"msg":"ok","sign":"PJfGlnoNNWLUt9gHFptGIvpHm0uEEbHcHMdoc57vWYhp2VfmMUrbub3APsMqTEZ-UfggQPi7-GNWkWjgccjy486zTPiQgCdqmNNSZp_wiwA3x28ubx0HUuKs8q8uytLzWNVmrtn8DDK0xWMyJGoFMA2kcFAvONmoLwS56w-mt1sEb1MNBsFcq88V6V_168vIPWWXO3cO8Nk5hqbPaUs5Pgh6sSnbbJ4buQy-Tdr_utzLY4WWO3BQ7Amrm2teHSC8zkn5u00_9MwMUY4kwRwUMMGR8P0XCvYrAYVuJbDNKshgEHwi-uEmXH0gzu4AEcDdoL7SqTZo9qDmMKLDsoMKUw"}, code=S}
        log.info("PreOrderWithManyPayMethodTest result ->{}", result);
    }
    @Override
    List<String> fillPayMethodInfo() {
        List<String> payMethods = new ArrayList<>();
        payMethods.add(PayMethodEnum.CARD_PAYMENT.getCode());
        payMethods.add(PayMethodEnum.INSTANT_EFT.getCode());
        return payMethods;
    }
}
