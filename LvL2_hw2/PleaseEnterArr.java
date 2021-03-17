import ExceptionPack.MyArrayDataException;
import ExceptionPack.MyArraySizeException;

public class PleaseEnterArr {
    public void EnterArr(String[][] arr)
    {
        int sum = 0;

        ExceptionFunc(arr.length);
        for (int i = 0; i < arr.length; i++) {
            ExceptionFunc(arr[i].length);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try{
                    sum += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException ex)
                {
                    String str = String.format("В ячейке [%d][%d] находится не целочисленое значение!!!", i, j);
                    throw new MyArrayDataException(str, ex);
                }
            }

        }
        System.out.println("Сумма всех элементов в матрице = " + sum);
    }

    public void ExceptionFunc(int length)
    {
        if(length != 4) throw new MyArraySizeException("Размер массива должен быть 4x4");
    }

}
