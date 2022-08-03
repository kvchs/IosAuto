package demo;


import org.apache.commons.codec.binary.Base64;

public class EncodePassword {

    public static void main(String[] args) {
        byte[] bytes = Base64.encodeBase64("test".getBytes());
        System.out.println(new String(bytes));

        byte[] bytes1 = Base64.decodeBase64(bytes);
        System.out.println(new String(bytes1));

    }
}
