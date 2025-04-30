package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest{
    @Test
    public void leapYearsThatAreNonCenturialYears(){
        Assertions.assertTrue(new LeapYear().isLeapYear(2016));//assert result is true
    }

    @Test
    public void leapCenturialYears(){
        Assertions.assertTrue(new LeapYear().isLeapYear(2000));
    }

    @Test
    public void nonLeapCenturialYears(){
        Assertions.assertFalse(new LeapYear().isLeapYear(1500));//assert result is false
    }

    @Test
    public void nonLeapYears(){
        Assertions.assertFalse(new LeapYear().isLeapYear(2017));
    }
}
