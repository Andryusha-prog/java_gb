package obstacles;

import participants.Participants;

public class Wall implements Obstacles{
    private final int height = 100;

    public boolean doIt(Participants participant){
        return participant.jump(height);
    }

}
