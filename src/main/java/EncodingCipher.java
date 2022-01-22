public class EncodingCipher {

    String normalCipher;
    int cipherKey;


    public String encode(String normalCipher, int cipherKey) {

        String encodedCipher = "";

        //Checking if the cipher key is between 0 and 26
        if (cipherKey > 26) {
            this.cipherKey = (cipherKey % 26);
        } else if (cipherKey < 0) {
            this.cipherKey = (cipherKey % 26) + 26;
        }


        return encodedCipher;


    }
}
