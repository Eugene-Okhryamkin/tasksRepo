package ru.vsu.okhryamkin.vvp.Task9;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

//    private static String filePathINP;
//    private static String filePathOUT;

    private static ArrayList<Integer> list;

    public static void main(String[] args) {
        if(args[0].equals("GUI")) {
            System.out.println("using GUI");
            SwingInterface gui = new SwingInterface();
            gui.setVisible(true);
            gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }
        if(args[0].equals("CLI")) {
            System.out.println("using CLI");
        }
    }

    public static ArrayList<Integer> uniq (ArrayList<Integer> insertedArrayList) {
        ArrayList<Integer> actualArrayList = new ArrayList<>();

        for (int i = 0; i < insertedArrayList.size(); i++) {
            boolean needToAdd = true;
            for (int j = 0; j < actualArrayList.size(); j++) {
                if(insertedArrayList.get(i).equals(actualArrayList.get(j))) {
                    needToAdd = false;
                }
            }

            if(needToAdd) {
                actualArrayList.add(insertedArrayList.get(i));
            }
        }

        return actualArrayList;
    }

    public static ArrayList<Integer> loader(String path) {
        int[] arr = ArrayUtils.readIntArrayFromFile(path);
        ArrayList<Integer> listLocal = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            listLocal.add(arr[i]);
        }
        return listLocal;
    }

    public static void saver(String path, ArrayList<Integer> needToSave) {

        int [] localBuffer = new int [needToSave.size()];

        for (int i = 0; i < needToSave.size(); i++) {
            localBuffer[i] = needToSave.get(i);
        }

        try {
            ArrayUtils.writeArrayToFile(path, localBuffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
