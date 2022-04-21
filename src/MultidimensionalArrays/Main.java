package MultidimensionalArrays;

public class Main {

    public static void main(String[] args) {
//        int[][][] cube = MultidimensionalArrays.createCube2();
//        MultidimensionalArrays.printThreeDimArray(cube);

//        int[][] array = MultidimensionalArrays.rotateRectangle();
//        MultidimensionalArrays.printTwoDimArray(array);

        int[][] twoDimArray = MultidimensionalArrays.populateTwoDimArray();
        MultidimensionalArrays.printTwoDimArray(twoDimArray);
        System.out.println();

        MultidimensionalArrays.printCorner(twoDimArray);


    }
}
