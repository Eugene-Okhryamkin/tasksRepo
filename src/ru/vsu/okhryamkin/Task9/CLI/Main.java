package ru.vsu.okhryamkin.Task9.CLI;

import ru.vsu.okhryamkin.Task8.Utils.ArrayUtils;
import ru.vsu.okhryamkin.Task9.utils.Array;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Array arr = new Array();

        List<Integer> list = arr.getListFromFile();


        List<Integer> uniqEls = arr.uniq(list);
        arr.setArrayToFile(uniqEls);

        System.out.println(uniqEls);
    }

}
