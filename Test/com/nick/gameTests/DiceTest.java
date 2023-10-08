package com.nick.gameTests;

import com.nick.game.modules.Engine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {
    @Test
    public void testRollInRange(){

        for (int i = 0; i < 1000; i++) {
            int sum = new Engine().diceRoller(1,"Nick" );
            assertTrue(sum >= 1 && sum <= 6, "Dice roll result out of range: " + sum);
        }
    }
    @Test
    public void scannerTest(){



    }




}
