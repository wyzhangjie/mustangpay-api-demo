package com.mustangpay.api.impl;

import com.mustangpay.api.constants.MustangpayApiConstantsV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @Author: hyssop
 * @Date: 08/27/2024
 */
public class MerConfigV1 implements KeyConfig {

    @Override
    public String getRsaPrivateKeyPath() {
        try{
            return getClass().getClassLoader().getResource("").getPath()+"mustangpay/4449999220.pri.key";
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
    public String getRsaPublicKeyPath() {
        try{
            return getClass().getClassLoader().getResource("").getPath()+"mustangpay/4449999220.pub.key";
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
        return null;
    }
}
