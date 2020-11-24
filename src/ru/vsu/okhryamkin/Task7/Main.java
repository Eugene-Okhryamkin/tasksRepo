package ru.vsu.okhryamkin.Task7;

import java.util.Scanner;

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

    private static void tests() {
        int[] normalArray = {3, 8, 5, 0, 1, 2};
        int[] emptyArray = new int[0];
        int[] zeroArray = {0, 0, 0, 0, 0, 0};
        int[] minArray = {0, 1, 2, 3, 4, 5};
        int [] negativeArray = { -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1 };
        int [] randomArray = new int[] { 1, -1, 2, -2, 3, -3 };
        int [] longArray = { 222222,-33333333,7777777, 888888888 };
        int [] testArr =  { -5,-6,-55,-33 };
        int[] anotherTest = {0, 1, 2};
        int[] negArray = {-1, -2, -3};

        int normalArrSum = arrSum(normalArray);
        int normalArrElems = checkElems(normalArray, normalArrSum);

        int emptyArraySum = arrSum(emptyArray);
        int emptyArrElems = checkElems(emptyArray, emptyArraySum);

        int zeroArraySum = arrSum(zeroArray);
        int zeroArrElems = checkElems(zeroArray, zeroArraySum);

        int minArraySum = arrSum(minArray);
        int minArrElems = checkElems(minArray, minArraySum);

        int negativeArraySum = arrSum(negativeArray);
        int negativeArrayElems = checkElems(negativeArray, negativeArraySum);

        int randomArraySum = arrSum(randomArray);
        int randomArrayElems = checkElems(randomArray, randomArraySum);

        int longArraySum = arrSum(longArray);
        int longArrElems = checkElems(longArray, longArraySum);

        int testArrSum = arrSum(testArr);
        int testArrElems = checkElems(testArr, testArrSum);

        int anotherTestSum = arrSum(anotherTest);
        int anotherArrElems = checkElems(anotherTest, anotherTestSum);

        int negArraySum = arrSum(negArray);
        int negArrayElems = checkElems(negArray, negArraySum);

        System.out.println("+------------------+");

        System.out.println(normalArrElems);
        System.out.println(emptyArrElems);
        System.out.println(zeroArrElems);
        System.out.println(minArrElems);
        System.out.println(negativeArrayElems);
        System.out.println(randomArrayElems);
        System.out.println(longArrElems);
        System.out.println(testArrElems);
        System.out.println(anotherArrElems);
        System.out.println(negArrayElems);

        System.out.println("+------------------+");
    };

    public static void main(String[] args) {

        tests();
        int[] array = new int[6];
        Scanner io = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            array[i] = io.nextInt();
        };

        int arraySum = arrSum(array);
        int arrayElems = checkElems(array, arraySum);


        System.out.println(arrayElems);
    }
}
