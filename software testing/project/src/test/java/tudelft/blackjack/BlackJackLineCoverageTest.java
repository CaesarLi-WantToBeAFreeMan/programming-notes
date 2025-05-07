package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest{
    @Test
    public void bothPlayersGoTooHigh(){
        Assertions.assertEquals(0, new BlackJack().play(30, 30));
    }

    @Test
    public void leftPlayerWins(){
        Assertions.assertEquals(10, new BlackJack().play(10, 9));
    }
}