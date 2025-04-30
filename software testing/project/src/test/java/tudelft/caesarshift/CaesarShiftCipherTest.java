package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest{
    @ParameterizedTest(name = "encode = {0}, shift = {1}, decode = {2}")
    @CsvSource({"abc, 3, def", "xyz, 3, abc", "abcdefg, 16, qrstuvw"})
    public void validTest(String encode, int shift, String decode){
        Assertions.assertEquals(decode, new CaesarShiftCipher().CaesarShiftCipher(encode, shift));
    }

    @ParameterizedTest(name = "encode = {0}, shift = {1}, decode = {2}")
    @CsvSource({"abc123abc, 3, invalid", "'', 3, invalid"})
    public void invalidTest(String encode, int shift, String decode){
        Assertions.assertEquals(decode, new CaesarShiftCipher().CaesarShiftCipher(encode, shift));
    }
}