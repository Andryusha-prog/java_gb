import obstacles.Obstacles;
import obstacles.RunRoad;
import obstacles.Wall;
import participants.*;


public class Main {
    public static void main(String[] args) {

        Participants[] participants = {
                new Cat(10, 15),
                new Human(10, 3000),
                new Robot(300, 10000)
        };

        Obstacles[] obstacles = {
                new Wall(),
                new RunRoad()
        };


        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                {
                    if(!obstacles[j].doIt(participants[i]))
                        break;
                }
            }
        }

    }
}