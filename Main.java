import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();
    }
    static void doTask1()
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) list.add(i);

        list.forEach(integer -> System.out.println(integer));
    }

    static void doTask2()
    {
        Set<String> list = Set.of("Строка 1", "Строка 2", "Строка 3");
        forItem(list, s -> System.out.println(s));

    }

    static void doTask3()
    {
        System.out.println(doubleUp(3, () -> 5));
    }
    static int doubleUp(int number, Supplier<Integer> action)
    {
        return number * action.get();
    }

    static void doTask4()
    {
        System.out.println(findAllChars("ccch", 'c').get());
    }

    static void forItem(Set<String> list, Consumer<String> cons)
    {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext())
            cons.accept(iterator.next());
    }

    static Optional<String> findAllChars(String target, char toFind)
    {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            if(target.charAt(i) == toFind)
                str.append(toFind);
        }
       if(str.length() == 0)
           return Optional.empty();
       else return Optional.of(str.toString());
    }
}

/*
* 1. Создать коллекцию типа List. Наполнить ее значениями и вывести значения в консолько при помощи ее метода forEach.
2. Создать утилитарный метод forItem. Метод принимает два параметра: Коллекция Set<String> и консьюмер типа Consumer<String>.
* Внутри метода проитерироваться по коллекции и для каждого элемента выполнить метод консьюмера accept, который выводит
*  значение элемента в консоль.
3. Создать утилитарный метод doubleUp. Метод принимает два параметра: значение типа int и консьюмер типа Supplier<Integer>.
*  Внутри метода выполнить метод саплаера get, который возвращает множитель и затем переданное значение на него умножается.
*  Фукнция возращает результат произведения.
4. Создать метод findAllChars. Метод принимает два параметра: String target и char toFind. Первый параметр является
* входной строкой, а второй - символ, который необходимо найти в входящей строке. Учесть что искомый символ может
* повторяется (напр.: 'ccch'). Необходимо найти все повторения и вернуть в виде конкатенированной строки обвернутый в Optional.
*  Если ни одного совпадения не найдено, тогда необходимо вернуть пустой Optional.
* Пример выполнения: Optional<String> opt = findAllChars("ccch", 'c'); opt.get(); // вернет "ссс".
5. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
* Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели. Сообщение должно
*  отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из
*  нижнего поля в центральное. (ОПЦИОНАЛЬНО)*/