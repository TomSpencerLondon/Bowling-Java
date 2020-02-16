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
        for (int i = 0; i < 20; i++){
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void canScoreGameOfOnes(){
        for (int i = 0; i < 20; i++){
            game.roll(1);
        }
        assertEquals(20, game.score());
    }
}