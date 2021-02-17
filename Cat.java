public class Cat extends Animal {
    private static int sumCat;
    private int granRun = 200;


    public Cat() {
        sumCat++;
    }

    @Override
    public void run(int a) {
        if (a <= granRun)
            System.out.printf("Кот пробежал %d метров. %n", a);
        else System.out.printf("Кот пробежал только %d метров", granRun);
    }

    @Override
    public void swim(int a) {
        System.out.println("Кот не умеет плавать!");
    }
}
