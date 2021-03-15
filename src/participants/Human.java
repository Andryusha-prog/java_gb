package participants;

public class Human implements Participants {
    private final int maxRun;
    private final int maxJump;

    public Human(int jump, int run) {
        maxRun = run;
        maxJump = jump;
    }

    public boolean run(int length){
        if(maxRun >= length)
        {
            System.out.println("Человек успешно пробежал!");
            return true;
        }
        else
        {
            System.out.println("Человек не смог пробежать!");
            return false;
        }
    }

    public boolean jump(int height){
        if(maxJump >= height)
        {
            System.out.println("Человек успешно перепрыгнул!");
            return true;
        }
        else
        {
            System.out.println("Человек не смог перепрыгнуть!");
            return false;
        }
    }
}
