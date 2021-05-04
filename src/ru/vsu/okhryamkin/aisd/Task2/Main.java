package ru.vsu.okhryamkin.aisd.Task2;

import ru.vsu.okhryamkin.aisd.Task2.СustomLinkedList;

import java.util.Comparator;
import java.util.Random;

public class Main {

    public static int[] randomizer(int maxValue) {
        int[] result = new int[maxValue];
        Random random = new Random();
        for(int i = 0; i < maxValue; i++) {
            result[i] = random.nextInt(maxValue);
        }

        return result;
    };

    public static void main(String[] args) {

        СustomLinkedList cll = new СustomLinkedList();

        for(int num : randomizer(10)) {
            cll.addNode(num);
        }

        cll.display();
        Object val = cll.getMaxValue((Comparator<Integer>) Integer::compareTo);
        System.out.println(val);

    }
}
