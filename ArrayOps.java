public class ArrayOps {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 1, 1, 2 };
        int[] array2 = { 2, 1 };
        System.out.println(containsTheSameElements(array1, array2));

    }

    public static int findMissingInt(int[] array) {
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
