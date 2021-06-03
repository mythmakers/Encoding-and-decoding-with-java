

import java.io.UnsupportedEncodingException;
import java.util.Base64;


public class EncoderClass {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String password = "test123";
        String enPass = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(enPass);
        byte[] dePass = Base64.getDecoder().decode(enPass);
        String dePassword = new String(dePass);
        System.out.println(dePassword);
    }
}
