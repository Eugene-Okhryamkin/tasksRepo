import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String tribonacci(int[] t, int n) {
        String result = "";
        int temp = 0;
        for (int i = 0; i < t.length; i++) {

            if (n == t[i]) {
                result = "Число трибоначчи, равное n = " + t[i];
            } else if(n > t[i]){
                temp = t[i+1];
                result = temp + "";
            }

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = sc.nextInt();
        int temp = 0;
        int[] t = new int[15];
        t[0] = 0;
        t[1] = 0;
        t[2] = 1;

        for (int i = 3; i < t.length; i++) {
            t[i] = t[i - 3] + t[i - 2] + t[i - 1];
        }

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
//        for (int i = 0; i < t.length; i++) {
//            if (n == t[i]) {
//                System.out.println("Число трибоначчи, равное n = " + t[i]);
//            } else if(n > t[i]){
//                temp = t[i+1];
//            }
//        }

        tribonacci(t, n);

    }
}
