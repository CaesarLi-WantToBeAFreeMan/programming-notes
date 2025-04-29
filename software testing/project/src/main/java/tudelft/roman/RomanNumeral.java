package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral{
    private static final Map <Character, Integer> romanNumbers = new HashMap<>();

    static{
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
    }

    private boolean isValid(String numberString){
        //empty string
        if(numberString.isEmpty())
            return false;

        //other invalid letters
        if(!numberString.matches("[IVXLCDM]+"))
            return false;

        //invalid repeats
        if(numberString.matches(".*(IIII|XXXX|CCCC|MMMM).*") ||
                numberString.matches(".*(VV|LL|DD).*"))
            return false;

        //invalid subtractive
        if(numberString.matches(".*IL|IC|ID|IM|VX|XC|VD|VM|XD|XM.*"))
            return false;
        if(numberString.matches(".*I{2,}[VX].*") ||
                numberString.matches(".*X{2,}[LC].*") ||
                numberString.matches(".*C{2,}[DM].*"))
            return false;

        return true;
    }

    public int convert(String numberString){
        if(!isValid(numberString))
            return 0;
        //roman numerals must be positive
        int result = 0, current, next;
        for(int i = 0; i < numberString.length(); i++){
            current = romanNumbers.get(numberString.charAt(i));
            next = i + 1 < numberString.length() ? romanNumbers.get(numberString.charAt(i + 1)) : 0;
            result += current >= next ? current : -current;
        }
        return result;
    }
}