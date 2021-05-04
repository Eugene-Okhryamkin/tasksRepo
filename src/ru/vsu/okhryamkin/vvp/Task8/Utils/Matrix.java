package ru.vsu.okhryamkin.vvp.Task8.Utils;

import java.io.FileNotFoundException;

public class Matrix {

    private ArrayUtils arrayUtils = new ArrayUtils();

    public int[][] getMatrix(String pathToMatrixFile) {
        return this.arrayUtils.readIntArray2FromFile(pathToMatrixFile);
    };

    public void setMatrix(String pathToMatrixFile, int[][] matrix) {
        try {
            this.arrayUtils.writeArrayToFile(pathToMatrixFile, matrix);
        } catch(FileNotFoundException ex) {
            System.err.println(ex);
        }
    };

    public int[][] getSortedMatrix(String path) {
        int[][] matrix = getMatrix(path);
        quickSort(matrix,0,matrix[0].length-1);
        return matrix;
    };

//    public void getMatrix(String path)  {
//        int[][] matrix = setMatrix(path);
//        quickSort(matrix,0,matrix[0].length-1);
//        try {
//            this.arrayUtils.writeArrayToFile("C://Users//Lenovo//IdeaProjects//study//src//ru//vsu//okhryamkin//Task8//ArrayFiles//dist//array.txt", matrix);
//        } catch (FileNotFoundException ex) {
//            System.err.println(ex);
//        }
//    };
//
//    public int[][] setMatrix(String path) {
//        return this.arrayUtils.readIntArray2FromFile(path);
//    };
//
//    private void printMatrix(int[][] matrix) {
//        for(int[] row : matrix){
//            System.out.println(Arrays.toString(row));
//        }
//    }

    public int compareColumns(int[][] matrix, int col1, int col2) {
        for (int[] row : matrix) {
            if (row[col1] > row[col2]) {
                return 1;
            }
            if (row[col1] < row[col2]) {
                return -1;
            }
        }

        return 0;
    }

    public void swapColumns(int[][] matrix, int col1, int col2) {
        for (int row = 0; row < matrix.length; row++) {
            int tmp = matrix[row][col1];
            matrix[row][col1] = matrix[row][col2];
            matrix[row][col2] = tmp;
        }
    }


    public void quickSort(int[][] matrix, int low, int high) {
        if (matrix.length == 0)
            return;

        if (low >= high)
            return;


        int middle = low + (high - low) / 2;


        int i = low, j = high;
        while (i <= j) {
            while (compareColumns(matrix, middle, i) == 1) {
                i++;
            }

            while (compareColumns(matrix,  middle,j) == -1) {
                j--;
            }

            if (i <= j) {
                swapColumns(matrix, i, j);
                i++;
                j--;
            }
        }


        if (low < j)
            quickSort(matrix, low, j);

        if (high > i)
            quickSort(matrix, i, high);
    }
}
