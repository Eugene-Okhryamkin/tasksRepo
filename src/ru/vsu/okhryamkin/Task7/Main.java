package ru.vsu.okhryamkin.Task7;

public class Main {

    private static int arrSum(int[] arr) {
        int sum = 0;
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            result = sum / arr.length;
        };

        return result;

    };

    private static int checkElems(int[] arr, int num) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= num) {
                count++;
            } else {
                return 0;
            };
        };

        return count;
    };

    public static void main(String[] args) {
        int[] array = {3, 8, 5, 0, 1, 2};

        int sum = arrSum(array);
        int elems = checkElems(array, sum);

        System.out.println(elems);
    }
}
