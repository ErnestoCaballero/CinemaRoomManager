package ArrayExceptions;

public class Main {

    public static void main(String[] args) {
        int[] array = null;
        calculateSquare(array, 1);
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
}
