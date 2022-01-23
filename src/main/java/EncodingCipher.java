public class EncodingCipher {


    public String encode(String inputString, int cipherKey) {

        String encodedCipher = "";
        //Converting the string to an array of characters
        for (int i = 0; i < inputString.length(); i++) {
            char singleChar = inputString.charAt(i);
            //Check if the Character is a symbol or a letter
            if (Character.isLetter(singleChar)) {

                // LowerCase
                if (Character.isLowerCase(singleChar)) {
                    char c = (char) (singleChar + cipherKey);
                    encodedCipher += c;

                    //UpperCase
                } else if (Character.isUpperCase(singleChar)) {
                    char c = (char) (singleChar + cipherKey);
                    encodedCipher += c;

                }

            } else {
                encodedCipher += singleChar;
            }
        }


        return encodedCipher;


    }


}
