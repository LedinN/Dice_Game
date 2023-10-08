package com.nick.gameTests;

import com.nick.game.modules.Methods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsTest {
        private Methods methods;

        @BeforeEach
        void setUp() {
            methods = new Methods("Player1");

            Methods.playerNames = new String[]{"Player1", "Player2", "Player3"};
            Methods.playerScores = new int[]{5, 3, 5};
        }

        @Test
        void testHighestScore() {
            methods.highestScore();

            assertEquals(5, Methods.highestScore);
            assertEquals("Player1", Methods.highestScorePlayer);
        }
}