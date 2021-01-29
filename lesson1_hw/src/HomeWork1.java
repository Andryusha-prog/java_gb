public class HomeWork1 {

    public static void main(String[] args) {
        //Инициализация переменных разных типов
        boolean bool = true;

        byte b = 120;//1byte -127 : 128
        short s = 12329; // 2byte -32768 : 32767
        int i = 10; // 4byte -2147483648 : 2147483647
        long l = 230L; // 8byte -9223372036854775808 : 9223372036854775807

        float f = -256F; // 4byte -3.4E+38 : 3.4E+38
        double d = 18560; // 8byte -1.7E+308 : 1.7E+308

        char c = 'c'; //  2byte

        String str = "Hello, World!";
        //Конец инииализации переменных

        //метод, вычисляющий выражение a * (b + (c / d))
        float res_1_task = first_method(5.3F, 6F, 0.5F, 1F);
        System.out.println(res_1_task);

        //Принадлежит ли сумма чисел промежутку от 10 до 20
        boolean res_2_task = sec_method(7, 5);
        System.out.println(res_2_task);

        //Положительное или отрицательное число
        third_method(-75);

        //Положительное или отрицательное число (возврат логической переменной)
        System.out.println(fourth_met(0));

        //Аллегрова
        five_met("Андрей");

        //Високосный год
        six_met_star(2021);
    }

    static float first_method(float a, float b, float c, float d)
    {
        return a * (b + (c / d));
    }

    static boolean sec_method(int a, int b)
    {
        int sum = a + b;
        if(sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    static void third_method(int a)
    {
        if(a >= 0) {
            System.out.println("Введенное число положительное!");
        }
        else if (a < 0) {
            System.out.println("Введенное число отрицательное");
        }
    }

    static boolean fourth_met(int a)
    {
        if(a > 0 || a == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    static void five_met(String name)
    {
        System.out.println("Привет, " + name + "!");
    }

    static void six_met_star(int year)
    {
        if(year % 400 == 0)
        {
            System.out.println("Год " + year + " високосный!");
        }
        else if(year % 100 == 0)
        {
            System.out.println("Год " + year + " невисокосный!");
        }
        else if(year % 4 == 0)
        {
            System.out.println("Год " + year + " високосный!");
        }
        else {
            System.out.println("Год " + year + " невисокосный!");
        }
        
    }

}
