package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest{
    @Test
    public void twog(){
        Assertions.assertTrue(new GHappy().gHappy("xxggxx"));
    }

    @Test
    public void oneg(){
        Assertions.assertFalse(new GHappy().gHappy("xxgxx"));
    }

    @Test
    public void threeg(){
        Assertions.assertFalse(new GHappy().gHappy("xxggyygxx"));
    }
}
