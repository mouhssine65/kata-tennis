import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TennisScoreTest {

    private TennisScore tennisScore;

    @BeforeEach
    void setUp() {
        tennisScore = new TennisScore();
    }

    @Test
    void testPlayerAScores() {
        tennisScore.playerAScores();
        assertEquals("15", tennisScore.formatScore(tennisScore.getScoreA()));
    }

    @Test
    void testPlayerBScores() {
        tennisScore.playerBScores();
        assertEquals("15", tennisScore.formatScore(tennisScore.getScoreB()));
    }

    @Test
    void testDeuce() {
        tennisScore.setScoreA(4);
        tennisScore.setScoreB(4);
        assertTrue(tennisScore.isDeuce());
    }

    @Test
    void testAdvantage() {
        tennisScore.setScoreA(4);
        tennisScore.setScoreB(3);
        assertEquals("Advantage", tennisScore.formatScore(tennisScore.getScoreA()));
    }

    @Test
    void testGameOver() {
        tennisScore.setScoreA(5);
        tennisScore.setScoreB(3);
        assertTrue(tennisScore.isGameOver());
    }
}
