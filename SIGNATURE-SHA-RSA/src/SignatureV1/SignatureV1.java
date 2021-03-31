/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignatureV1;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import sun.misc.BASE64Encoder;

/**
 *
 * @author User
 */
public class SignatureV1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        SignatureV1 sha = new SignatureV1();
        sha.getSignature();
    }
    
    public void getSignature() throws Exception {
        // certificate location
        String privateKeyFile = "G:\\BNI Source\\svn\\BNI-SOA-v9_dev\\promotions\\source\\CR23215_PENGEMBANGAN_FITUR_INQUIRY_HOLD_AMOUNT\\Src_DataPower\\cryptocert\\bni_public_kecy.p12";
        // certificate password G:\BNI Master Project\CR23215_PENGEMBANGAN_FITUR_INQUIRY_HOLD_AMOUNT
        String password = "ilcs123";
        // concatenated string
        String data = "PELINDO2"+""+"0115476208"; //HOLD Release Signanute
//        String data = "PELINDO2"+"0115476151"+"0115476208"+"2018-08-09"+"2018-08-10"; //HOLD Release Signanute

        KeyStore keystore = KeyStore.getInstance("PKCS12");
        keystore.load(new FileInputStream(privateKeyFile), password.toCharArray());
        // PrivateKey key = (PrivateKey) keystore.getKey(alias, password.toCharArray());
        // cek value alias lewat cmd
        // command = keytool -v -list -keystore (nama file cert/pkcs12)
        PrivateKey key = (PrivateKey) keystore.getKey("1", password.toCharArray());
        Signature instance = Signature.getInstance("SHA1withRSA");
        instance.initSign(key);
        instance.update((data.trim()).getBytes());
        byte[] signature = instance.sign();
        String signatureStr = new BASE64Encoder().encode(signature);
        System.out.println(signatureStr.replace("\n", "").replace("\r", ""));
    }

}
