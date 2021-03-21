import java.util.*;

public class PhoneBook {
    private final Map<String, Set<String>> phoneBook;

    public PhoneBook(){
        this.phoneBook = new HashMap<>();
    }

    //комментриями сам себе объясняю, чтоб лучше понять :)
    public void add(String name, String number)
    {
        Set<String> numbers = phoneBook.getOrDefault(name, new HashSet<>());//Если в тел.книге есть человек с именем "name", в коллекцию "numbers" записываются номера из книги, если нет, то создается новая коллекция для хранения номеров
        numbers.add(number);//добавить новый номер телефона в коллекцию
        phoneBook.put(name, numbers);//добавить в телефонную книгу обновленный/созданный список номеров для "name"
    }

    public Set<String> get(String name)
    {
        return phoneBook.getOrDefault(name, Collections.EMPTY_SET);//при существовании, берутся номера из телефонной книги по ключу "name",, если нет, то ссылка на пустую коллекцию.
    }
}

/*
*2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
*В этот телефонный справочник с помощью метода add() можно добавлять записи.
*С помощью метода get() искать номер телефона по фамилии. Следует учесть,
*что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
*тогда при запросе такой фамилии должны выводиться все телефоны.
*/
