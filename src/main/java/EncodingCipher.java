public class EncodingCipher {

    String normalCipher;
    int cipherKey;



    //Checking if the cipher key is between 0 and 26
    public int checkCipherKey(int cipherKey) {

        if (cipherKey >= 25) {
            this.cipherKey = (cipherKey % 25);
        } else if (cipherKey <= 1) {
            this.cipherKey = (cipherKey % 25) + 25;
        }

        return cipherKey;
    }




    public String encode(String normalCipher, int cipherKey) {

        String encodedCipher = "";
        //Converting the string to an array of characters
        for (int i = 0; i < normalCipher.length(); i++) {
            char ch = normalCipher.charAt(i);

            if (Character.isLetter(ch)) {


                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + cipherKey);
                    if (c > 'z') {
                        encodedCipher += (char) (ch - (26 - cipherKey));
                    } else {
                        encodedCipher += c;
                    }

                } else if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + cipherKey);
                    if (c > 'Z') {
                        encodedCipher += (char) (ch - (26 - cipherKey));
                    } else {
                        encodedCipher += c;
                    }

                }

            } else {
                encodedCipher += ch;
            }
        }


        return encodedCipher;


    }
}
