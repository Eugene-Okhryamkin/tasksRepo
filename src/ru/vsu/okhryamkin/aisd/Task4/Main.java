package ru.vsu.okhryamkin.aisd.Task4;

public class Main {
    public static int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(System.currentTimeMillis());

        return array;
    }

    public static int[] shakerSort(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            boolean swapped = false;
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
            for (int j = array.length - 2 - i; j > i; j--) {
                if (array[j] > array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(System.currentTimeMillis());
        return array;
    }

    public static void test(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] testArrayForSort = new int[] {1, 74, 3, 5, 4};
        test(bubbleSort(testArrayForSort));
        //test(shakerSort(testArrayForSort));
    }
}
