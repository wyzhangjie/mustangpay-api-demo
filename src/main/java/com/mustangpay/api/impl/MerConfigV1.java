package com.mustangpay.api.impl;

import com.mustangpay.api.constants.MustangpayApiConstantsV1;
import com.mustangpay.api.constants.VooCommenceV1;

/**
 * @Author: hyssop
 * @Date: 08/27/2024
 */
public class MerConfigV1 implements KeyConfig {



    @Override
    public String getMerchantPrivateKeyPath(String merchantName) {
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order/test/"+merchantName+"-test.pri.key";
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String getMustangPayPublicKeyPath() {
        try{
            return getClass().getClassLoader().getResource("").getPath()+"mustangpay/mustangpay.pub.key";

        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String getMerchantPublicKeyPath(String merchantName) {
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order/test/"+merchantName+"-test.pub.key";
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String getMustangPayApiUrl(String name) {
        if(name.equals("preCreate")){
            return MustangpayApiConstantsV1.preCreateUrl;
        }
        if(name.equals("checkOrder")){
            return MustangpayApiConstantsV1.checkOrderUrl;
        }
        if(name.equals("h2hPreCreate")){
            return MustangpayApiConstantsV1.h2hPreCreateUrl;
        }
     return null;

    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String geTestMustangPayApiUrl(String name) {
        if(name.equals("preCreate")){
            return MustangpayApiConstantsV1.testPreCreateUrl;
        }
        if(name.equals("checkOrder")){
            return MustangpayApiConstantsV1.testCheckOrderUrl;
        }
        if(name.equals("h2hPreCreate")){
            return MustangpayApiConstantsV1.testH2hPreCreateUrl;
        }
        if(name.equals("refundCreate")){
            return MustangpayApiConstantsV1.testRefundCreateUrl;
        }
        if(name.equals("refundQuery")){
            return MustangpayApiConstantsV1.testRefundQueryUrl;
        }
        return null;
    }

    @Override
    public String getProMerchantPublicKeyPath(String merchantName) {
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order.pro/"+merchantName+".pub.key";
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String getProMerchantPrivateKeyPath(String merchantName) {
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order.pro/"+merchantName+".pri.key";
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String getProMustangPayPublicKeyPath() {
        try{
            return getClass().getClassLoader().getResource("").getPath()+ "mustangpay/order.pro/mustangpay.pub.key";
        }catch (Exception e){
            return null;
        }
    }

    @Override
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
}
