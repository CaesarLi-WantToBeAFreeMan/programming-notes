package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChocolateBagsBeforeBoundaryTest {
    @Test
    public void totalIsBiggerThanAmountOfBars() {
        Assertions.assertEquals(-1, new ChocolateBags().calculate(1, 1, 10));
    }

    @Test
    public void onlyBigBars() {
        Assertions.assertEquals(0, new ChocolateBags().calculate(5, 3, 10));
    }

    @Test
    public void bigAndSmallBars() {
        Assertions.assertEquals(2, new ChocolateBags().calculate(5, 3, 17));
    }

    @Test
    public void onlySmallBars() {
        Assertions.assertEquals(3, new ChocolateBags().calculate(4, 2, 3));
    }
}
