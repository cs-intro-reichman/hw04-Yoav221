public class ArrayOps {
    public static void main(String[] args) {
        int[] array = { 3, 0, 1 };
        // System.out.println("the sorted array is: " + findMissingInt(array));

    }

    public static int findMissingInt(int[] array) {
        return 0;

    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int SecondMax = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > SecondMax && array[j] < max) {
                SecondMax = array[j];
            }
        }
        return SecondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        return false;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
