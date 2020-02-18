import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    Game game;

    @Before
    public void setUp(){
        game = new Game();
    }

    @Test
    public void canScoreGutterGame(){
        game.roll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void canScoreGameOfOnes(){
        game.roll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void canScoreSpareFollowedByThree(){
        game.roll(5, 5, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertEquals(16, game.score());
    }

    @Test
    public void canScoreStrikeFollowedByThreeThenThree(){
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertEquals(22, game.score());
    }

    @Test
    public void canScorePerfectGame(){
        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertEquals(300, game.score());
    }
}