public abstract class Animal {
    private static int sumAnimal;

    public Animal() {
        sumAnimal++;
    }

    public abstract void run(int a);

    public abstract void swim(int a);
}
