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

        printTheThirdRow(twoDimArray);

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

     static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
     }

    public static void printTheThirdRow(int[][] twoDimArray) {
        for (int j : twoDimArray[2]) {
            System.out.print(j + " ");
        }
    }


}
