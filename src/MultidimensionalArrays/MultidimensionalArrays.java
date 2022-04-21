package MultidimensionalArrays;

import java.util.Arrays;
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
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
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

    /*
    ROTATE A RECTANGLE ARRAY
    Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the
    new array m×n in size.

    Input data format

    Input consists of the two numbers n and m, not exceeding 100, and then an array n×m in size.

    Output data format

    Output the resulting array. Separate numbers by a single space in the output.
     */

    static int[][] rotateRectangle() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] input = new int[n][m];
        int[][] output = new int[m][n];

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < input[0].length; i++) {
            for (int j = 0; j < input.length; j++) {
                output[i][j] = input[input.length - j - 1][i];
            }
        }

        return output;
    }

    static int[][] populateTwoDimArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] output = new int[n][m];

        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                output[i][j] = scanner.nextInt();
            }
        }

        return output;
    }

    /*
    FIND CORNER
    You need to implement printCorners method. It should print all corner elements of the twoDimArray in the
    following order: left to right and top to bottom.

    The elements must be separated by space and printed as an example below.

    Input array:

    1 0 2
    0 0 0
    3 0 4
    Printed corners:

    1 2
    3 4
    Notice, that you must always print 4 corners, for example:

    Input array:

    1
    2
    3
    Printed corners:

    1 1
    3 3
     */
    public static void printCorner(int[][] arr) {
        System.out.print(arr[0][0] + " " + arr[0][arr[0].length - 1] + "\n");
        System.out.println(arr[arr.length - 1][0] + " " + arr[arr.length - 1][arr[arr.length -1].length - 1]);
    }

    /*
    REVERSE ELEMENTS
    In this task, you need to implement reverseElements method.
    It should reverse all rows of the twoDimArray as in the example below.

    0 0 9 9              9 9 0 0
    1 2 3 4 will become: 4 3 2 1
    5 6 7 8              8 7 6 5
    It is guaranteed that twoDimArray has at least 1 row.

    P.S. You don't need to print anything in this task.
     */

    public static void reverseElements(int[][] twoDimArray) {
        for (int[] arr : twoDimArray) {
            reverseArray(arr);
        }
    }

    public static void reverseArray(int[] input) {
        int hold;
        for (int i = 0; i < input.length / 2; i++) {
            hold = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = hold;
        }
    }

}
