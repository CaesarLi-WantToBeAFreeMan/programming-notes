package tudelft.blackjack;

public class BlackJack {
    public int play(int left, int right){
        return Math.max(left > 21 ? 0 : left, right > 21 ? 0 : right);
    }
}