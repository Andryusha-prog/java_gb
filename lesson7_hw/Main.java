package lesson7_hw;

public class Main {
    public static void main(String[] args) {

        startDinner();
    }

    public static void startDinner()
    {
        Cat[] cats = new Cat[5];

        for(int i = 0; i < cats.length; i++)
            cats[i] = new Cat("cat" + i, (i + 1) * 5);

        Plate plate = new Plate(49);

        catsEat(cats, plate);
    }

    public static void catsEat(Cat[] cats, Plate plate)
    {
        for(int i = 0; i < cats.length; i ++)
        {
            System.out.println(cats[i].getName() + " " + cats[i].eat(plate));//задача 5
        }

        plate.info();
        System.out.println("Добавляем еду в миску");
        plate.addFood(20);
        plate.info();
    }
}
