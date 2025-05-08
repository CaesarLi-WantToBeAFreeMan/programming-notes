package tudelft.christmas;

import java.util.Calendar;

public class ChristmasDiscount{
    public double applyDiscount(double rawAmount){
        Calendar today = Calendar.getInstance();
        if(today.get(Calendar.MONTH) == Calendar.DECEMBER && today.get(Calendar.DAY_OF_MONTH) == 25)
            rawAmount *= 1.0 - 0.15;
        return rawAmount;
    }
}