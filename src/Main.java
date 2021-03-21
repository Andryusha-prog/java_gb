import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook ph = new PhoneBook();

        ph.add("Фамилия0", "000001");
        ph.add("Фамилия1", "000002");
        ph.add("Фамилия1", "000005");
        ph.add("Фамилия2", "000006");
        ph.add("Фамилия3", "000007");

        System.out.println(ph.get("Фамилия0"));
        System.out.println(ph.get("Фамилия1"));
        System.out.println(ph.get("Фамилия3"));

        UniqueWords();
    }

    static void UniqueWords()
    {
        String[] words = {"карандаш", "телефон","карта","мышь","клавиатура","карандаш","ножницы","коробка",
                "карта","точилка","провода","интрефейс","карандаш"};

        Set<String> Unique = new HashSet<>(Arrays.asList(words));
        System.out.println("Массив уникальных слов: " + Unique);

        Map<String, Integer> QuantityWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if(QuantityWords.containsKey(words[i]))
                QuantityWords.put(words[i], QuantityWords.get(words[i]) + 1);
            else QuantityWords.put(words[i], 1);
        }

        System.out.println("Количество слов: " + QuantityWords);
    }
}

/*
* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
*  из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
* */
