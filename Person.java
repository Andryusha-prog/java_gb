public class Person {
    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    public String name;
    public String position;
    public String email;
    private String phone;
    private int salary;
    public int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Person(String name, String position, String email, String phone, int salary, int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void printInfoPerson()
    {
        System.out.printf("Имя сотрудника: %s; %n" +
                "Должность сотрудника: %s; %n" +
                "email сотрудника: %s; %n" +
                "Номер телефона сотрудника: %s; %n" +
                "Размер заработной платы: %d; %n" +
                "Возраст: %d. %n ", this.name, this.position, this.email, this.phone, this.salary, this.age);
        System.out.println();
    }
}
