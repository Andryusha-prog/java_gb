import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;
    public static void main(String[] args) {
        method1();
        method2();
    }

    static void method1()
    {
        float[] arr = new float[size];

        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }

    static void method2()
    {

        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        Arrays.fill(arr, 1);
        System.out.println("START");
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread t1 = new Thread(() -> calculate(a1));
        Thread t2 = new Thread(() -> calculate(a2));

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(System.currentTimeMillis() - a);
        System.out.println("FINISH");
    }
    static float[] calculate(float[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("HERE CALCULATING");
        return arr;
    }
}
