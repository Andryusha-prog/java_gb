public class homeWork5 {
    public static void main(String[] args) {
        Person[] person = createPerson();

        cyclePrint(person);
    }

    //4. Создать массив из 5 сотрудников.
    static Person[] createPerson()
    {
        Person[] person = new Person[5];
        person[0] = new Person(" Иванов Иван", "Инженер", "ivaneng@mail.com", "9568976453", 32000, 28);
        person[1] = new Person("Андреев Андрей", "Инженер 2к.", "andrew@mail.com", "9300568299", 35000, 26);
        person[2] = new Person("Сидоров Кирилл", "Программист", "sidkir@mail.com", "9561247397", 80000, 47);
        person[3] = new Person("Солынина Екатерина", "Специалист по продажам", "katesol@mail.com", "9875678898", 55000, 19);
        person[4] = new Person("Васильева Василиса", "Бухгалтер", "vasvas@mail.com", "9568765423", 85000, 43);

        return person;
    }

    //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    static void cyclePrint(Person[] person)
    {
        for(int i = 0; i < person.length; i++)
            if(person[i].age > 40)
                person[i].printInfoPerson();
    }
}
