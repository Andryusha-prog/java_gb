package lesson7_hw;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;//Задача 3: по условию каждый созданный кот голоден

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate p)
    {
        return satiety = p.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }
}
