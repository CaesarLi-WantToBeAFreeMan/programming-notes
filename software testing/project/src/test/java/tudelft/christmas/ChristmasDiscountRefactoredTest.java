package tudelft.christmas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ChristmasDiscountRefactoredTest{
    //test ChristmasDiscount
    //for May 8, 2025, the result is perfect
    @Test
    public void today(){
        Assertions.assertEquals(100.0, new ChristmasDiscount().applyDiscount(100.0), 0.000_1);
    }

    @Test
    public void christmas() {
        Clock clock = Mockito.mock(Clock.class);
        Mockito.when(clock.now()).thenReturn(new GregorianCalendar(2025, Calendar.DECEMBER, 25));
        Assertions.assertEquals(85.0, new ChristmasDiscountRefactored(clock).applyDiscount(100.0), 0.0001);
    }

    @Test
    public void notChristmas() {
        Clock clock = Mockito.mock(Clock.class);
        Mockito.when(clock.now()).thenReturn(new GregorianCalendar(2025, Calendar.FEBRUARY, 25));
        Assertions.assertEquals(100.0, new ChristmasDiscountRefactored(clock).applyDiscount(100.0), 0.0001);
    }
}
