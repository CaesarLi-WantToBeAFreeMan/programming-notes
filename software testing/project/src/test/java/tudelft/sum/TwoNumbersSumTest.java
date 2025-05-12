package tudelft.sum;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest{
    @Test
    public void sameDigitAndNoCarry(){
        Assertions.assertEquals(new ArrayList <>(Arrays.asList(5, 7, 9)), new TwoNumbersSum().addTwoNumbers(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(4, 5, 6))));
    }

    @Test
    public void sameDigitAndCarry(){
        Assertions.assertEquals(new ArrayList <>(Arrays.asList(1, 1, 1, 0)), new TwoNumbersSum().addTwoNumbers(new ArrayList<>(Arrays.asList(9, 9, 9)), new ArrayList<>(Arrays.asList(1, 1, 1))));
    }
    @Test
    public void differentDigitAndNoCarry(){
        Assertions.assertEquals(new ArrayList <>(Arrays.asList(2, 5, 0)), new TwoNumbersSum().addTwoNumbers(new ArrayList<>(Arrays.asList(1, 6, 0)), new ArrayList<>(Arrays.asList(9, 0))));
    }

    @Test
    public void differentDigitAndCarry(){
        Assertions.assertEquals(new ArrayList <>(Arrays.asList(1, 0, 0, 0)), new TwoNumbersSum().addTwoNumbers(new ArrayList<>(Arrays.asList(9, 6, 4)), new ArrayList<>(Arrays.asList(3, 6))));
    }
}