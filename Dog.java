public class Dog extends Animal {
    private static int sumDog;
    private int granRun = 500;
    private int granSwim = 10;


    public Dog() {
        sumDog++;
    }

    @Override
    public void run(int a) {
        if (a <= granRun)
            System.out.printf("Собака пробежала %d метров. %n", a);
        else System.out.printf("Собака пробежала только %d метров. %n", granRun);
    }

    @Override
    public void swim(int a) {
        if (a <= granSwim)
            System.out.printf("Собака проплыла %d метров. %n", a);
        else System.out.printf("Собака пробежала только %d метров. %n", granRun);
    }
}
