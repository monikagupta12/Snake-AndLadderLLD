import java.util.UUID;

public class Player {
    private String id;
    private String name;
    private int postion;

    public Player(String name) {
        this.id = UUID.randomUUID().toString().substring(0,8);
        this.name = name;
        postion=0;
    }

    public int getPostion() {
        return postion;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostion(int postion) {
        this.postion = postion;
    }
}
