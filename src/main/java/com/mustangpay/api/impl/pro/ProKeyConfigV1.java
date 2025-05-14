package com.mustangpay.api.impl.pro;

import com.mustangpay.api.utils.mustangpay.RSAUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: hyssop
 * @Date: 09/18/2024
 */
public class ProKeyConfigV1 implements ProKeyConfig{
    @Override
    public String getMustangPayPublicKey() {
       /* try{
            return  RSAUtils.getKeyPem(getClass().getClassLoader().getResource("").getPath()+"mustangpay/pro/mustangpay.pro.pub.key");
        }catch (Exception e){
            return null;
        }*/
        String keyFilePath = "mustangpay/pro/mustangpay.pro.pub.key";
        try (InputStream keyStream = getClass().getClassLoader().getResourceAsStream(keyFilePath)) {
            if (keyStream == null) {
                throw new FileNotFoundException("Public key file not found: " + keyFilePath);
            }
            return RSAUtils.getKeyPem(keyStream);
        } catch (IOException e) {
        }
        return null;
    }

    @Override
    public String getMustangPayPrivateKey() {
       /* try{
            return  RSAUtils.getKeyPem(getClass().getClassLoader().getResource("").getPath()+"mustangpay/pro/mustangpay.pro.pri.key");
        }catch (Exception e){
            return null;
        }*/
        String keyFilePath = "mustangpay/pro/mustangpay.pro.pri.key";
        try (InputStream keyStream = getClass().getClassLoader().getResourceAsStream(keyFilePath)) {
            if (keyStream == null) {
                throw new FileNotFoundException("Public key file not found: " + keyFilePath);
            }
            return RSAUtils.getKeyPem(keyStream);
        } catch (IOException e) {
        }
        return null;
    }

    @Override
    public String getMerchantPublicKey() {
        String keyFilePath = "mustangpay/pro/merchant.pro.pub.key";
        try (InputStream keyStream = getClass().getClassLoader().getResourceAsStream(keyFilePath)) {
            if (keyStream == null) {
                throw new FileNotFoundException("Public key file not found: " + keyFilePath);
            }
            return RSAUtils.getKeyPem(keyStream);
        } catch (IOException e) {
        }
        return null;
    }


    @Override
    public String getMerchantPrivateKey() {
    /*    try{
       //     return  RSAUtils.getKeyPem(getClass().getClassLoader().getResource("").getPath()+"mustangpay/pro/merchant.pro.pri.key");

            return  RSAUtils.getKeyPem(getClass().getClassLoader().getResource("").getPath()+"mustangpay/order.pro/4449999220.pri.key");
        }catch (Exception e){
            return null;
        }*/

        String keyFilePath = "mustangpay/pro/merchant.pro.pri.key";
        try (InputStream keyStream = getClass().getClassLoader().getResourceAsStream(keyFilePath)) {
            if (keyStream == null) {
                throw new FileNotFoundException("Public key file not found: " + keyFilePath);
            }
            return RSAUtils.getKeyPem(keyStream);
        } catch (IOException e) {
        }
        return null;
    }
}
