package com.mustangpay.api.demo.v2;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PublicKeyValidator {

    public static void main(String[] args) {
        String publicKeyFilePath = "/Users/edy/Desktop/huaweinew/mustangpay-api-demo1/target/classes/mustangpay/publicKey/public.pem";

        try {
            PublicKey publicKey = loadPublicKeyFromPem(publicKeyFilePath);
            if (is2048BitRsaPublicKey(publicKey)) {
                System.out.println("该公钥是有效的 2048 位 RSA 公钥。");
            } else {
                System.out.println("该公钥不是 2048 位 RSA 公钥。");
            }
        } catch (Exception e) {
            System.out.println("验证公钥时出错: " + e.getMessage());
        }
    }

    public static PublicKey loadPublicKeyFromPem(String filePath) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] bytes = new byte[fis.available()];
            fis.read(bytes);
            String pemContent = new String(bytes);
            // 提取 PEM 格式公钥中的 Base64 编码部分
            String publicKeyPem = extractPublicKeyPem(pemContent);
            byte[] decoded = Base64.getDecoder().decode(publicKeyPem);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(decoded);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(keySpec);
        }
    }

    public static String extractPublicKeyPem(String pemContent) {
        Pattern pattern = Pattern.compile("-----BEGIN PUBLIC KEY-----(.*)-----END PUBLIC KEY-----", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(pemContent);
        if (matcher.find()) {
            return matcher.group(1).replaceAll("\\s", "");
        }
        return null;
    }

    public static boolean is2048BitRsaPublicKey(PublicKey publicKey) {
        return "RSA".equals(publicKey.getAlgorithm()) && publicKey.getEncoded().length == 294;
    }
}