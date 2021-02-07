import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3_hw {
    public static void main(String[] args) {


        doGameWords(randString());

    }

    //Создать массив из слов
    //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
    //Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
    //apple – загаданное
    //apricot - ответ игрока
    //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //Для сравнения двух слов посимвольно можно пользоваться:
    //String str = "apple";
    //char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
    //Играем до тех пор, пока игрок не отгадает слово.
    //Используем только маленькие буквы.

    static String randString()
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        return words[rand.nextInt(words.length)];//Загадали рандомное слово из переданного массива

    }

    static void doGameWords(String word)
    {
        boolean finish = false;//признак для завершения
        Scanner scanner = new Scanner(System.in);
        String answer, wordString;
        char[] wordChar = new char[15];
        int size;

        for(int i = 0; i < 15; i++)
            wordChar[i] = '#';

        System.out.println("Слово загаданно! Попытайтесь угадать! Введите на следующей строке загаданное слово:");

        do {
            answer = scanner.next();
            if(answer.equals(word))
            {
                System.out.println("Поздравляю! Вы угадали слово!");
                finish = true;
            }
            else
            {
                wordString = "";
                if(word.length() < answer.length())//проверка размера введеного и загаданного слов чтоб не было ошибки размера массива в цикле
                    size = word.length();
                else size = answer.length();

                for(int i = 0; i < size; i++)
                {
                    if(word.charAt(i) == answer.charAt(i))
                        wordChar[i] = word.charAt(i);
                }

                for(int i = 0; i < wordChar.length; i++)
                    System.out.print(wordChar[i]);
                System.out.println();

                for (int i = 0; i < word.length();i++)
                    wordString += wordChar[i];

                finish = word.equals(wordString);

                if(finish)
                    System.out.println("Победа подбором букв!");
                else System.out.println("Попробуте другое слово!");

            }
        }
        while(!finish);

    }
}
