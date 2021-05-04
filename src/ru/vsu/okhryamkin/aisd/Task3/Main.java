package ru.vsu.okhryamkin.aisd.Task3;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static Integer[] generateArr(int size) {
        Integer arr[] = new Integer[size];
        for(int i = 0; i < size; i++) {
            arr[i] = Integer.valueOf(i);
        }

        return arr;
    };

    public static void addElements(CustomQueue queue, int size) {
        for(int i = 1; i <= size; i++) {
            System.out.println(i);
            for(int j = 1; j <= i; j++) {
                queue.enqueue(generateArr(j));
            }
        }
    }

    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();
        addElements(queue, 5);
        Stream<String> arrStream = Stream.of(queue.deepToString());
        arrStream.forEach(el -> System.out.println(el));
    }

}
