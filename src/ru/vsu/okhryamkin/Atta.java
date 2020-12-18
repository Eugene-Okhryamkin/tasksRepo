package ru.vsu.okhryamkin;

import java.util.Arrays;
import java.util.List;

public class Atta {
    public static List<Integer> process(List<Integer> list) {
        List<Integer> result = null;
        for(int element : list) {
            if(element > element + 1) {
                return list;
            } else {
                result.add(element);
            }
        }
        return result;
    };

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 8, 8, 12, 1, 2, 3, 4, 5, 6, 7, 4);

        System.out.println(process(list));
    }
}
