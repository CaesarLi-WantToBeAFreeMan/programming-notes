package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest{
    @Test
    public void multipleMatchingWords(){
        Assertions.assertEquals(2, new CountLetters().count("cats|dogs"));
    }

    @Test
    public void lastWordDoesNotMatch(){
        Assertions.assertEquals(1, new CountLetters().count("cats|dog"));
    }
}