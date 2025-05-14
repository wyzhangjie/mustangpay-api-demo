package com.mustangpay.api.impl;

import com.mustangpay.api.constants.VooCommenceV1;

/**
 * @author hyssop.zhang
 * @date 2025 year 04month16day16:03
 */
public class SandboxV1 {
  public  String getMerchantPrivateKeyPath(String merchantId){
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order.sandbox/"+merchantId+".pri.key";
        }catch (Exception e){
            return null;
        }
    }

  public  String getMerchantPayPublicKeyPath(String merchantId){
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order.sandbox/"+merchantId+".pub.key";
        }catch (Exception e){
            return null;
        }
    }
    public String geSandboxMustangPayApiUrl(String name) {
        if(name.equals("preCreate")){
            return VooCommenceV1.sandboxPreCreateUrl;
        }
        if(name.equals("checkOrder")){
            return VooCommenceV1.sandboxCheckOrderUrl;
        }
        if(name.equals("h2hPreCreate")){
            return VooCommenceV1.sandboxH2hPreCreateUrl;
        }
        if(name.equals("refundCreate")){
            return VooCommenceV1.sandboxRefundCreateUrl;
        }
        if(name.equals("refundQuery")){
            return VooCommenceV1.sandboxRefundQueryUrl;
        }
        return null;

    }
    public  String getMustangPublicKeyPath(){
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order.sandbox/mustangpay.pub.key";
        }catch (Exception e){
            return null;
        }
    }
    public String geMustangPayApiUrl(String name) {
        if(name.equals("preCreate")){
            return VooCommenceV1.sandboxPreCreateUrl;
        }
        if(name.equals("checkOrder")){
            return VooCommenceV1.sandboxCheckOrderUrl;
        }
        if(name.equals("h2hPreCreate")){
            return VooCommenceV1.sandboxH2hPreCreateUrl;
        }
        if(name.equals("refundCreate")){
            return VooCommenceV1.sandboxRefundCreateUrl;
        }
        if(name.equals("refundQuery")){
            return VooCommenceV1.sandboxRefundQueryUrl;
        }
        return null;

    }


}
     