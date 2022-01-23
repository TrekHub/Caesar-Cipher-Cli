import java.util.Scanner;

public class CaesarCipher {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cipher cipher = new Cipher();
        EncodingCipher encode = new EncodingCipher();

        //Getting the Input String from the user
        System.out.println("Enter The Text To Be Encoded");
        cipher.setInputString(scanner.nextLine());

        //Getting the cipher Key from the User
        System.out.println("Enter The Cipher or Shif Key");
        cipher.setCipherKey(Integer.parseInt(scanner.nextLine()));


        //Checking if the User Inputs the correct data
        if (cipher.getInputString() != " ") {
            if (cipher.getCipherKey() > 0 && cipher.getCipherKey() < 26) {

                String encodedCipher = encode.encode(cipher.getInputString(), cipher.getCipherKey());
                System.out.println(encodedCipher);

            } else {
                System.out.println("Enter the Correct details");
            }

        } else {
            System.out.println("Enter the Correct details");

        }


    }
}
