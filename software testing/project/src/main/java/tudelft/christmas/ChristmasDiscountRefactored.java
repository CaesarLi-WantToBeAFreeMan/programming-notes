package tudelft.christmas;

import java.util.Calendar;

public class ChristmasDiscountRefactored{
    private Clock clock;
    public ChristmasDiscountRefactored(Clock clock){
        this.clock = clock;
    }
    public double applyDiscount(double rawAmount){
        Calendar today = clock.now();
        if(today.get(Calendar.DAY_OF_MONTH) == 25 && today.get(Calendar.MONTH) == Calendar.DECEMBER)
            rawAmount *= 1.0 - 0.15;
        return rawAmount;
    }
}