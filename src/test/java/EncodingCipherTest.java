import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingCipherTest {

    @Test
    public  void checkCipherText(){
        EncodingCipher encode = new EncodingCipher();
        assertEquals("vgf", encode.encode("ted", 2));
    }






}