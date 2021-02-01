import java.util.Arrays;

public class Lesson2_hw {
    public static void main(String[] args) {
        //1.
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array = doChange01(array)));

        //2.
        System.out.println(Arrays.toString(createArray()));

        //3.
        System.out.println(Arrays.toString(multiLittleNum()));

        //4
        for(int i = 0; i < doMainDiag().length; i++)
        {
            for(int j = 0; j < doMainDiag()[i].length; j++)
                System.out.print(doMainDiag()[i][j] + " ");
            System.out.println();
        }

        //5
        findMinMax();

        //6
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr));

        //7
        int[] mas = {3, 5, 6, 1};
        changePosition(mas, -2);
    }
    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static int[] doChange01(int[] mas)
    {
        for(int i = 0; i < mas.length; i++)
        {
            if(mas[i] == 1)
                mas[i] = 0;
            else if(mas[i] == 0)
                mas[i] = 1;
        }
        return mas;
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static int[] createArray()
    {
        int[] mas = new int[8];
        int i = 0;
        while(i < mas.length)
        {
            mas[i] = i * 3;
            i++;
        }

        return mas;
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static int[] multiLittleNum()
    {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        int i = 0;
        do {
            if(arr[i] < 6)
                arr[i] = arr[i] * 2;
            i++;
        }
        while(i < arr.length);
        return arr;
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    static int[][] doMainDiag()
    {
        int[][] matr = new int[5][5];
        for(int i = 0; i < matr.length; i ++)
            {
                matr[i][i] = 1;
                matr[i][matr.length - i - 1] = 1;
            }
        return matr;
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    static void findMinMax()
    {
        int[] arr = {2, 27, 10, 6, -10, 28, -17, -30};
        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Заданный массив: " + Arrays.toString(arr));
        System.out.println("Min: " + min + "; Max: " + max);
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    static boolean checkBalance(int[] arr)
    {
        boolean result = false;
        int sum1 = 0;
        for(int i = 0; i < arr.length; i++) {
            sum1 +=arr[i];
            int sum2 = 0;
            for (int j = arr.length - 1; j > i; j--) {
                sum2 += arr[j];
                if (sum2 == sum1) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
    // вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    static void changePosition(int[] arr, int n)
    {
        if(n > 0)//выясняем в какую сторону двигать
        {
            for(int i = 0; i < n; i++)//на сколько сдвигать элементы в массиве
            {
                int temp = arr[arr.length - 1];//ну и впринципе сам сдвиг элементов
                for(int j = arr.length - 1; j > 0; j--)
                    arr[j] = arr[j - 1];
                arr[0] = temp;
            }
        }
        else
        {
            for(int i = n; i < 0; i++)
            {
                int temp = arr[0];
                for(int j = 0; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
                arr[arr.length - 1] = temp;
            }
        }
        //Понимаю, что получилось слишком громоздко, но как сделать по-другому, поа что не знаю :)

        System.out.println(Arrays.toString(arr));
    }
}
