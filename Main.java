public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.run(150);
        cat.swim(10);

        cat.run(150);
        dog.swim(10);
    }
}
