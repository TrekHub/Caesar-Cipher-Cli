public class DecodingCipher {


    public String decode(String inputString, int cipherKey) {

        String decodedCipher = "";
        //Converting the string to an array of characters
        for (int i = 0; i < inputString.length(); i++) {
            char singleChar = inputString.charAt(i);
            //Check if the Character is a symbol or a letter
            if (Character.isLetter(singleChar)) {

                // LowerCase
                if (Character.isLowerCase(singleChar)) {
                    char c = (char) (singleChar - cipherKey);
                    if (c < 'a') {
                        decodedCipher += (char) (singleChar +  (26 - cipherKey));
                    } else {
                        decodedCipher += c;
                    }



                    //UpperCase
                } else if (Character.isUpperCase(singleChar)) {
                    char c = (char) (singleChar - cipherKey);
                    if (c < 'A') {
                        decodedCipher += (char) (singleChar + (26 - cipherKey));
                    } else {
                        decodedCipher += c;
                    }

                }

            } else {
                decodedCipher += singleChar;
            }
        }


        return decodedCipher;


    }
}
