package ArrayExceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = null;
//        calculateSquare(array, 1);
        fixStringIndexOutOfBoundsException();
    }

    /*
    You need to implement the calculateSquare method.

    It should output the square of the element by the provided index of an array.
    In the case when the exception might happen, your program output should be: Exception!

     */
    public static void calculateSquare(int[] array, int index) {
        System.out.println(array == null
                || index < 0
                || index > array.length - 1
                ? "Exception"
                : String.format("%.0f", Math.pow(array[index], 2)));
    }

    /*
    Take a look at the program that reads a string and a number N and outputs the Nth element of a string (starting from 0).

    This program may throw StringIndexOutOfBoundsException. Fix it to avoid the exception.

    In the case when the exception might happen, your updated program should output: "Out of bounds!".
     */

    public static void fixStringIndexOutOfBoundsException() {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        System.out.println(index > string.length() - 1 || index < 0 ? "Out of bounds!" : string.charAt(index));
    }

}
