package test;
//-> input: int 2D Array
//-> copy elements to new array, include null values
public class DeepArrayCopy {
    public static int[][] clone(int[][] input) {
        //TODO create a copy of all the elements in input and return to caller.
        return new int[1][1];
    }

    public static void main(String[] args) {
        int[][] test = new int[1][];
        test[0] = new int[] {42};
        int[][] testClone = clone(test);
        // System.out.println("test clone value is: " + testClone[0][0]);
    }
}