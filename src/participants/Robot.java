package participants;

public class Robot implements Participants {
    private final int maxRun;
    private final int maxJump;

    public Robot(int jump, int run) {
        maxRun = run;
        maxJump = jump;
    }

    public boolean run(int length){
        if(maxRun >= length)
        {
            System.out.println("Робот успешно пробежал!");
            return true;
        }
        else
        {
            System.out.println("Робот не смог пробежать!");
            return false;
        }
    }

    public boolean jump(int height){
        if(maxJump >= height)
        {
            System.out.println("Робот успешно перепрыгнул!");
            return true;
        }
        else
        {
            System.out.println("Робот не смог перепрыгнуть!");
            return false;
        }
    }
}
