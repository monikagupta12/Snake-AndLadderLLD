import java.util.Random;

public class Dice {
    private int diceCount;
    private Random random;

    public Dice() {
        this.diceCount = 1;
        this.random =new Random();
    }

    public void setDiceCount(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int sum=0;
        for (int i=0; i<diceCount; i++){
            sum=random.nextInt(6)+sum;
        }
        return sum;
    }

}
