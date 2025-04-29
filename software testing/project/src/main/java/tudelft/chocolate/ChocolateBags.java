package tudelft.chocolate;

public class ChocolateBags {

    public int calculate(int small, int big, int total){
        int maxBigBoxes = total / 5;
        total -= maxBigBoxes < big ? 5 * maxBigBoxes : 5 * big;
        return small < total ? -1 : total;
    }
}
