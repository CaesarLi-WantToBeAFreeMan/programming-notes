package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest{
    //test single digit
    @Test
    public void singleDigit1(){
        RomanNumeral romanNumeral = new RomanNumeral();//create an instance of the RomanNumeral class
        int result = romanNumeral.convert("I");//convert the Roman numeral "I" to an integer
        Assertions.assertEquals(1, result);//check if the result equals 1
    }

    @Test
    public void singleDigit2(){
        int result = new RomanNumeral().convert("V");//convert the Roman numeral "V" to an integer directly using a new object
        Assertions.assertEquals(5, result);//check
    }

    @Test
    public void singleDigit3(){
        Assertions.assertEquals(10, new RomanNumeral().convert("X"));//assert directly if the conversion of "X" gives 10
    }

    @Test
    public void singleDigit4(){
        Assertions.assertEquals(50, new RomanNumeral().convert("L"));
    }

    @Test
    public void singleDigit5(){
        Assertions.assertEquals(100, new RomanNumeral().convert("C"));
    }

    @Test
    public void singleDigit6(){
        Assertions.assertEquals(500, new RomanNumeral().convert("D"));
    }

    @Test
    public void singleDigit7(){
        Assertions.assertEquals(1000, new RomanNumeral().convert("M"));
    }

    //test multiple digits
    @Test
    public void multipleDigits1(){
        Assertions.assertEquals(2, new RomanNumeral().convert("II"));
    }

    @Test
    public void multipleDigits2(){
        Assertions.assertEquals(3, new RomanNumeral().convert("III"));
    }

    @Test
    public void multipleDigits3(){
        Assertions.assertEquals(8, new RomanNumeral().convert("VIII"));
    }

    @Test
    public void multipleDigits4(){
        Assertions.assertEquals(17, new RomanNumeral().convert("XVII"));
    }

    //test subtractive notation
    @Test
    public void subtractiveNotation1(){
        Assertions.assertEquals(4, new RomanNumeral().convert("IV"));
    }

    @Test
    public void subtractiveNotation2(){
        Assertions.assertEquals(9, new RomanNumeral().convert("IX"));
    }

    @Test
    public void subtractiveNotation3(){
        Assertions.assertEquals(14, new RomanNumeral().convert("XIV"));
    }

    @Test
    public void subtractiveNotation4(){
        Assertions.assertEquals(44, new RomanNumeral().convert("XLIV"));
    }

    @Test
    public void subtractiveNotation5(){
        Assertions.assertEquals(94, new RomanNumeral().convert("XCIV"));
    }

    @Test
    public void subtractiveNotation6(){
        Assertions.assertEquals(444, new RomanNumeral().convert("CDXLIV"));
    }

    //test invalid notation
    @Test
    public void invalid1(){
        Assertions.assertEquals(0, new RomanNumeral().convert("IIII"));
    }

    @Test
    public void invalid2(){
        Assertions.assertEquals(0, new RomanNumeral().convert("VIIII"));
    }

    @Test
    public void invalid3(){
        Assertions.assertEquals(0, new RomanNumeral().convert("IIIV"));
    }

    @Test
    public void invalid4(){
        Assertions.assertEquals(0, new RomanNumeral().convert("A"));
    }
}