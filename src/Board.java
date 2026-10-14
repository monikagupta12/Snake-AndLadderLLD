import java.util.Map;

public class Board {
    public static final int endOfGame=100;
    private Map<Integer,Integer> snakes;
    private Map<Integer,Integer> ladder;

    public Board() {
    }

    public Board(Map<Integer, Integer> snakes, Map<Integer, Integer> ladder) {
        this.snakes = snakes;
        this.ladder = ladder;
    }

    public void addNewSnake(int startPostion, int endPostion){
        if(snakes.containsKey(startPostion)){
            throw new RuntimeException("already snake at this postion");
        }
        snakes.put(startPostion,endPostion);
    }
    public void addNeLaddder(int startPostion, int endPostion){
        if(ladder.containsKey(startPostion)){
            throw new RuntimeException("already ladder at this postion");
        }
        ladder.put(startPostion,endPostion);
    }
    public int getEndPointOfSnake(int startPoint){
        return snakes.getOrDefault(startPoint,0);
    }

    public int getEndPointOfLadder(int startPoint){
        return ladder.getOrDefault(startPoint,0);
    }

    public boolean containSnakeAtPosition(int nextPosition) {
        return snakes.containsKey(nextPosition);
    }

    public boolean containLadderAtPosition(int nextPosition) {
        return ladder.containsKey(nextPosition);
    }
}
