public class Game {
    private int score = 0;

    public void roll(int hits){
        score += hits;
    }

    public int score(){
        return score;
    }
}
