import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingCipherTest {

    @Test
    public  void checkDecodedCipher(){
        DecodingCipher decode = new DecodingCipher();
        assertEquals("ted", decode.decode("vgf", 2));
    };

}