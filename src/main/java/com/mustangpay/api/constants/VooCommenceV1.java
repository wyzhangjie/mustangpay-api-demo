package com.mustangpay.api.constants;
/**
 * @Author: hyssop
 * @Date: 08/31/2024
 */
public interface VooCommenceV1 {

  //  String baseUrl = "https://openapi-dev.mstpay-inc.com";
  String baseUrl="https://openapi.mustangpay.co.za";
  String sandboxUrl="https://openapi-sandbox.mstpay-inc.com";
  //String sandboxUrl="https://openapi-sandbox.mstpay-inc.com";
  //  String merchantId = "21251005000215512";
 // String merchantId = "21251005000358664";
  //250508
  String merchantId="21251018000033416";
  String merchantReturnUrl = baseUrl + "/interface/ykMerApi/merchantReturnUrl";
    String preCreateUrl = baseUrl + "/openApi/merchant_direct/cashier/preorder";
    String checkOrderUrl = baseUrl + "/openApi/merchant_direct/cashier/getOrderStatusByMerchantOrderNo";
    String h2hPreCreateUrl = baseUrl + "/openApi/merchant_h2h/preorder";
  String sandboxPreCreateUrl = sandboxUrl + "/openApi/merchant_direct/cashier/preorder";
  String sandboxCheckOrderUrl = sandboxUrl + "/openApi/merchant_direct/cashier/getOrderStatusByMerchantOrderNo";
  String sandboxH2hPreCreateUrl = sandboxUrl + "/openApi/merchant_h2h/preorder";
  String sandboxRefundCreateUrl = sandboxUrl + "/openApi/refund/createRefund";
  String sandboxRefundQueryUrl = sandboxUrl + "/openApi/refund/refundStatus";

}
