import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingCipherTest {

    @Test
    public void checkCipherKeyIsAboveOrEqualOne() {
        EncodingCipher encode = new EncodingCipher();
        assertTrue(encode.checkCipherKey(1) >= 1 &&  encode.checkCipherKey(1) <= 25);
    }


}