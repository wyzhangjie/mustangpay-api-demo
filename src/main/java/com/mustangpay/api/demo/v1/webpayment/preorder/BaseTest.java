package com.mustangpay.api.demo.v1.webpayment.preorder;

import com.mustangpay.api.constants.MustangpayApiConstantsV1;
import com.mustangpay.api.enums.CurrencyEnum;
import com.mustangpay.api.pojo.Amount;
import com.mustangpay.api.pojo.CreateCashierReq;
import com.mustangpay.api.pojo.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author: hyssop
 * @Date: 09/11/2024
 */
public abstract class BaseTest {
    public  CreateCashierReq fillPreOrderReq() {
        CreateCashierReq createCashierReq = wrapperCreateCashierReq();
        createCashierReq.setPayMethods(fillPayMethodInfo());
        return createCashierReq;
    }
    public static CreateCashierReq wrapperCreateCashierReq(){
        Amount amount = new Amount(100L, CurrencyEnum.ZAR.getCode()); // Assuming constructor accepts amount and currency code
        Product product = new Product("productname", "short", "productDesc_b74f45d43c9c");

        String uniqueReference = UUID.randomUUID().toString();

        // Create CreateCashierReq object
        CreateCashierReq createCashierReq = new CreateCashierReq();

        createCashierReq.setCountry("ZAF");
        createCashierReq.setCurrency("ZAR");
        /*
         * merchant order no
         */
        createCashierReq.setReference(uniqueReference);
        /*
         * order amount
         */
        createCashierReq.setAmount(amount);
        //可以不传
        createCashierReq.setBusinessType("MerchantAcquiring");
        //可以不传
        createCashierReq.setRemark("remark_83c200fa64ff");
        //merchant 回调地址
        createCashierReq.setCallbackUrl("callbackUrl_08941d02454c");
        //merchant 返回商户页面地址
        createCashierReq.setReturnUrl("returnUrl_86a75a09e6b8");
        //cancel url
        createCashierReq.setCancelUrl("");
        //用户请求
        createCashierReq.setIp("ip_2841df759b91");
        //商品信息
        createCashierReq.setProduct(product);
        //商品列表
        createCashierReq.setProductList(new ArrayList<>());
        //订单超时时间
        createCashierReq.setExpireAt(30);
        //收税金额，只做了展示不做业务逻辑。
        createCashierReq.setVat(new Amount(10L, CurrencyEnum.ZAR.getCode()));
        //税收号码
        createCashierReq.setVatNumber("vatNumber_d98853c8c10c");
        //商户号
        createCashierReq.setMerchantId(MustangpayApiConstantsV1.merchantId);
        return createCashierReq;
    }
     abstract   List<String> fillPayMethodInfo();
}
