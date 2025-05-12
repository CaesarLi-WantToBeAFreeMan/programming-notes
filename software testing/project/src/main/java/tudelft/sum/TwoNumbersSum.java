package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum{
    public ArrayList <Integer> addTwoNumbers(ArrayList <Integer> first, ArrayList <Integer> second){
        Collections.reverse(first);
        Collections.reverse(second);
        ArrayList <Integer> result = new ArrayList<>();
        int carry = 0, maxLength = Math.max(first.size(), second.size());
        for(int i = 0, firstValue, secondValue, sum; i < maxLength; i++){
            firstValue = i < first.size() ? first.get(i) : 0;
            secondValue = i < second.size() ? second.get(i) : 0;
            sum = firstValue + secondValue + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }
        if(carry > 0)
            result.add(carry);
        Collections.reverse(result);
        return result;
    }
}