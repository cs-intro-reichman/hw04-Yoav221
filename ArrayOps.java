public class ArrayOps {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 5 };
        System.out.println(secondMaxValue(array1));

    }

    public static int findMissingInt(int[] array) {
        // Takes care of all cases that array.length == 1
        if (array.length == 1) {
            if (array[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        // Otherwise:
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int sum = 0;
        for (int i = 0; i <= max; i++) {
            sum += i;
        }

        for (int i = 0; i < array.length; i++) {
            sum -= array[i];
        }
        int missingInt = sum;
        return missingInt;

    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        int max = array[0];
        int IndexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                IndexOfMax = i;
            }
        }
        int SecondMax = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > SecondMax && array[j] < max) {
                SecondMax = array[j];
            }
            if (array[j] == max && j != IndexOfMax) {
                SecondMax = array[j];
            }
        }
        return SecondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean result = true;
        for (int i = 0; i < array1.length; i++) {
            int CurrentSearchValue = array1[i];
            boolean isInArray2 = false;
            for (int j = 0; j < array2.length; j++) {
                if (CurrentSearchValue == array2[j]) {
                    isInArray2 = true;
                }
            }
            if (isInArray2 == false) {
                result = isInArray2;
                break;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            int CurrentSearchValue = array2[i];
            boolean isInArray1 = false;
            for (int j = 0; j < array1.length; j++) {
                if (CurrentSearchValue == array1[j]) {
                    isInArray1 = true;
                }
            }
            if (isInArray1 == false) {
                result = isInArray1;
                break;
            }
        }

        return result;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        return false;
    }

}
