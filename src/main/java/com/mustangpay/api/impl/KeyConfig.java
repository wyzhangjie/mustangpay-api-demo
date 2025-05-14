package com.mustangpay.api.impl;
/**
 * @Author: hyssop
 * @Date: 08/27/2024
 */
public interface KeyConfig {

    String getMerchantPublicKeyPath(String merchantName);

    String getMerchantPrivateKeyPath(String merchantName);

    String getMustangPayPublicKeyPath();
    String getMustangPayApiUrl(String name);

    String getVersion();
    String geTestMustangPayApiUrl(String name);


    String getProMerchantPublicKeyPath(String merchantName);

    String getProMerchantPrivateKeyPath(String name);

    String getProMustangPayPublicKeyPath();

    String geSandboxMustangPayApiUrl(String name);

}
