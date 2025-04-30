package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsTest {
    @ParameterizedTest//declare a parametrized test method that runs multiple times with different arguments
    //output the default name (value) for each parameter
    @CsvSource({"1, 1, 5, 0", "1, 1, 6, 1"})//supply values for "small, big, total, expectedResult" as comma-separated input
    //a test method with four parameters
    public void totalIsTooBig(int small, int big, int total, int expectedResult){
        Assertions.assertEquals(expectedResult, new ChocolateBags().calculate(small, big, total));
    }

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, expectedValue = {3}")
    //same as above, but define a custom test name for better readability in the test output
    //name of the first parameter is "small", second is "big", etc
    @CsvSource({"4,0,10,-1", "4,1,10,-1", "5,2,10,0", "5,3,10,0"})
    public void onlyBigBars(int small, int big, int total, int expectedResult){
        Assertions.assertEquals(expectedResult, new ChocolateBags().calculate(small, big, total));
    }

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, expectedValue = {3}")
    @CsvSource({
        "0,3,17,-1", "1,3,17,-1", "2,3,17,2", "3,3,17,2",
        "0,3,12,-1", "1,3,12,-1", "2,3,12,2", "3,3,12,2"})
    public void bigAndSmallBars(int small, int big, int total, int expectedResult){
        Assertions.assertEquals(expectedResult, new ChocolateBags().calculate(small, big, total));
    }

    @ParameterizedTest(name = "small = {0}, big = {1}, total = {2}, expectedValue = {3}")
    @CsvSource({"4,2,3,3", "3,2,3,3", "2,2,3,-1", "1,2,3,-1"})
    public void onlySmallBars(int small, int big, int total, int expectedResult){
        Assertions.assertEquals(expectedResult, new ChocolateBags().calculate(small, big, total));
    }
}
