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
 * @Date: 08/28/2024
 */
@Slf4j
public class PreOrderWithPayMethodCardTest extends BaseTest {
    //该方法是商户要唤起收银台的时候指定支付方式来唤起收银台，如果给到一个payMethod，说明该商户只想用payMethod来下单支付，
    //收银台会跳到二级页面，做卡支付（目前只支持卡支付），
    public static void main(String[] args) throws Exception{
        PreOrderWithPayMethodCardTest test = new PreOrderWithPayMethodCardTest();
        // Assuming the Amount and Product classes are defined elsewhere with constructors as needed
        CreateCashierReq createCashierReq = test.fillPreOrderReq();
        createCashierReq.setPayMethods(Collections.singletonList(PayMethodEnum.CARD_PAYMENT.getCode()));
        MustangpayApiUtilsV1<CashierCreateResp> v1 = new MustangpayApiUtilsV1();
        ResponseResult<CashierCreateResp> result =  v1.callTest("PreOrderWithPayMethodCardTest", createCashierReq, OperationEnum.PRECREATE.getCode());
        //{result={"code":"000000","data":{"cashierUrl":"http://110.238.76.97:90/pre-cashier?orderNo=F6RQPjco8t0VhyHlwIf5j3lAggrZlbniCl1ve33jDtI=","merchantId":"4449999220","orderNo":"2408281010032767517","orderStatus":"Initial","reference":"9d02a217-e5b4-4404-b2c9-df1ae8273ad5"},"msg":"ok","sign":"SpIWTc4ECRhi-Eab_yDQIi_MQQP6wn1GS7iXUahyWe5sgL8Gx0X6Kgny4gNdS4EZKugxXZcrDvWQGXau2JumKaseJ_r5UfOo1PWsG-3ceeJ1mN1s7Eau7QUYvfeScc9eIuioADmxZMtAdHwwcvdoLyZ3nENrHbs1jZ7XgWOy4OKhWmasIurjnZpGclkif4Hm1iIr_NFQVQy32bqBoTCz2MEBae5Cyeo6_a-3ZwwhyzAiFxWAEvRpDhsMRhf_HcSOgE7lDYUdcPfFUtJP9_CCojmMfLInaF0ZBEsumMybbFVaNOlayCocztjPPpsadGgegoE20jQMX4vdMNSTWOZH9A"}, code=S}
        log.info("PreOrderWithPayMethodCardTest result ->{}", result);

    }

    @Override
    List<String> fillPayMethodInfo() {
        List<String> payMethods = new ArrayList<>();
        payMethods.add(PayMethodEnum.CARD_PAYMENT.getCode());
        return payMethods;
    }

}
