package MultidimensionalArrays;

import java.util.Scanner;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] twoDimArray = new int[n][n];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        printTwoDimArray(twoDimArray);

        System.out.println();
//        System.out.println(isSymmetric(twoDimArray) ? "YES" : "NO");

//        printTheThirdRow(twoDimArray);

    }

    static boolean isSymmetric(int[][] twoDimArray) {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = i + 1; j < twoDimArray[i].length; j++) {
                System.out.println("twoDimArray[i][j] = " + twoDimArray[i][j] + " | twoDimArray[j][i] = " + twoDimArray[j][i]);
                if (twoDimArray[i][j] != twoDimArray[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }


    /*
    Create a method that prints the third row of a two dimensional array. Assume there are always at least three rows.
     */

    public static void printTheThirdRow(int[][] twoDimArray) {
        for (int j : twoDimArray[2]) {
            System.out.print(j + " ");
        }
    }

    /*
    You need to implement the createCube method. It should create a 3x3x3 three-dimensional array with the following content:

    [0, 1, 2]	[3, 4, 5]	[6, 7, 8]
    [0, 1, 2]	[3, 4, 5]	[6, 7, 8]
    [0, 1, 2]	[3, 4, 5]	[6, 7, 8]

    The elements should be of type int.
     */

    static int[][][] createCube() {
        final int n = 3;
        int[][][] cube = new int[n][n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    cube[i][j][k] = k + (n * j);
                }
            }
        }

        return cube;
    }

    static int[][][] createCube2() {
        int[][] row = {{0, 1, 2}, {3, 4, 5}, {6, 7,  8}};
        int[][][] cube = new int[][][] {row, row, row};

        return cube;
    }

    static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printThreeDimArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[");
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.print("], ");
            }
            System.out.println();
        }
    }


}
