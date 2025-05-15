package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest{
    @ParameterizedTest(name = "expectedResult = {0}, input = {1}")
    @CsvSource({"ac, acghca", "abc, abchiopcba", "a, ahia"})
    public void evenDigitNotWholeStringMirror(String expectedResult, String input){
        Assertions.assertEquals(expectedResult, new Mirror().mirrorEnds(input));
    }

    @ParameterizedTest(name = "expectedResult = {0}, input = {1}")
    @CsvSource({"ac, acgalca", "abc, abchiocba", "a, aiona"})
    public void oddDigitNotWholeStringMirror(String expectedResult, String input){
        Assertions.assertEquals(expectedResult, new Mirror().mirrorEnds(input));
    }

    @ParameterizedTest(name = "expectedResult = {0}, input = {1}")
    @CsvSource({"ac, acca", "abc, abccba", "a, aa"})
    public void evenDigitWholeStringMirror(String expectedResult, String input){
        Assertions.assertEquals(expectedResult, new Mirror().mirrorEnds(input));
    }

    @ParameterizedTest(name = "expectedResult = {0}, input = {1}")
    @CsvSource({"aca, aca", "abcacba, abcacba", "aboba, aboba"})
    public void oddDigitWholeStringMirror(String expectedResult, String input){
        Assertions.assertEquals(expectedResult, new Mirror().mirrorEnds(input));
    }

    @ParameterizedTest(name = "expectedResult = {0}, input = {1}")
    @CsvSource({"'', abc", "'', abcdef", "'', air"})
    public void notMirror(String expectedResult, String input){
        Assertions.assertEquals(expectedResult, new Mirror().mirrorEnds(input));
    }

    @ParameterizedTest(name = "expectedResult = {0}, input = {1}")
    @CsvSource({"a, a", "b, b", "c, c"})
    public void singleCharacter(String expectedResult, String input){
        Assertions.assertEquals(expectedResult, new Mirror().mirrorEnds(input));
    }

    @ParameterizedTest(name = "expectedResult = {0}, input = {1}")
    @CsvSource({"'', ''"})
    public void emptyString(String expectedResult, String input){
        Assertions.assertEquals(expectedResult, new Mirror().mirrorEnds(input));
    }
}