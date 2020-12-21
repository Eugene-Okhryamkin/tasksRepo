package ru.vsu.okhryamkin.Task9.utils;

import ru.vsu.okhryamkin.Task8.Utils.ArrayUtils;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array {

    private ArrayUtils arrayUtils = new ArrayUtils();

    public List<Integer> uniq(List<Integer> list) {
        return  list
                    .stream()
                    .distinct()
                    .collect(Collectors.toList());
    };

    public int[] getArrayFromFile() {
        return this.arrayUtils.readIntArrayFromFile("C:\\Users\\Lenovo\\IdeaProjects\\study\\src\\ru\\vsu\\okhryamkin\\Task9\\ArrayFiles\\source\\array.txt");
    };

    public int[] getDistArrayFromFile() {
        return this.arrayUtils.readIntArrayFromFile("C:\\Users\\Lenovo\\IdeaProjects\\study\\src\\ru\\vsu\\okhryamkin\\Task9\\ArrayFiles\\dist\\array.txt");
    };

    public List<Integer> getListFromFile() {
        int[] arr = this.arrayUtils.readIntArrayFromFile("C:\\Users\\Lenovo\\IdeaProjects\\study\\src\\ru\\vsu\\okhryamkin\\Task9\\ArrayFiles\\source\\array.txt");
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        return list;
    };

    public int[] listToArray(List<Integer> list) {
        int[] response = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            response[i] = list.get(i);
        };

        return response;
    };

    public void setArrayToFile(List<Integer> list) {
        int[] arr = list.stream().mapToInt(el -> el).toArray();
        try {
            this.arrayUtils.writeArrayToFile("C:\\Users\\Lenovo\\IdeaProjects\\study\\src\\ru\\vsu\\okhryamkin\\Task9\\ArrayFiles\\dist\\array.txt", arr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    };
}
