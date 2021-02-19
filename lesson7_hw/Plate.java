package lesson7_hw;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) //задачи 2,4
    {
        if(n <= food)
        {
            food -= n;
            return true;
        }
        else return false;
    }

    public void info()
    {
        System.out.println("plate:" + food);
    }

    public void addFood(int n)//задача 6
    {
        food += n;
    }
}
