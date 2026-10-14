import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Board board=new Board(new HashMap<>(),new HashMap<>());

        Game game=new Game(board);
        game.addNewPlayer("ritu");
        game.addNewPlayer("meetu");
        game.addNewPlayer("sita");

        game.StartGame();

    }
}