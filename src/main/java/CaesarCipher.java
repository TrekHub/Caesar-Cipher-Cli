public class CaesarCipher {



    public  static  void main(String[] args){

        String cipherText = "ted";

        EncodingCipher encode = new EncodingCipher();
        String encodedCipher = encode.encode(cipherText, 2);
        System.out.println(encodedCipher);

    }
}
