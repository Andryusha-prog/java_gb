package obstacles;
import participants.Participants;

public class RunRoad implements Obstacles{
    private final int length = 5000;

    public boolean doIt(Participants participant)
    {
        return participant.run(length);
    }
}
