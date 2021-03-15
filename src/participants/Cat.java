package participants;

public class Cat implements Participants {

    private final int canRun;
    private final int canJump;

    public Cat(int jump, int run) {
        canRun = run;
        canJump = jump;
    }

    public boolean run(int length){
        if(canRun >= length)
        {
            System.out.println("Кот успешно пробежал!");
            return true;
        }
        else
        {
            System.out.println("Кот не смог пробежать!");
            return false;
        }
    }

    public boolean jump(int height){
        if(canJump >= height)
        {
            System.out.println("Кот успешно перепрыгнул!");
            return true;
        }
        else
        {
            System.out.println("Кот не смог перепрыгнуть!");
            return false;
        }
    }
}
