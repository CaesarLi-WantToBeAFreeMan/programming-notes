package tudelft.leapyear;

public class LeapYear{
    public boolean isLeapYear(int year){
        /*
        //simply way
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        */

        //partition way
        if(year % 400 == 0)
            return true;
        if(year % 100 == 0)
            return false;
        return year % 4 == 0;
    }
}
