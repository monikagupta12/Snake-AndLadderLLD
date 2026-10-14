import java.util.Queue;

public class Game {
    Queue<Player> players;
    Board board;
    Dice dice;

    public Game(Board board, Queue<Player> players) {
        this.board = board;
        this.players = players;
        this.dice = new Dice();
    }

    public Game(Board board) {
        this.board = board;
        this.dice = new Dice();
    }

    public void addNewPlayer(String name){
        Player player=new Player(name);
        players.add(player);
    }

    public void StartGame(){
        while (true){
            Player player=players.remove();
            int num=dice.rollDice();
            int currentPosition=player.getPostion();
            int nextPosition=num+currentPosition;
            players.add(player);
            if(nextPosition>100){
                continue;
            }
            if(board.containSnakeAtPosition(nextPosition)){
                System.out.println("uff sanke bite you goes down at"+
                        board.getEndPointOfSnake(currentPosition));
                nextPosition= board.getEndPointOfSnake(currentPosition);
            }
            if (board.containLadderAtPosition(nextPosition)){
                System.out.println("woo ladder take you wuo ward"+
                        board.getEndPointOfLadder(currentPosition));
            }
            player.setPostion(nextPosition);
            if(nextPosition==100){
                System.out.println("congrts "+player.getName()+" win this game");
                break;
            }
        }
    }
}
