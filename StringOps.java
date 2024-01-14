public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {
        String NewString = "";
        for (int i = 0; i < string.length(); i++) {
            char chr = string.charAt(i);
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u') {
                NewString = NewString + ((char) (string.charAt(i) - 32));
            } else if (chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
                NewString = NewString + string.charAt(i);
            } else if (chr >= 65 && chr <= 90) {
                NewString = NewString + ((char) (string.charAt(i) + 32));
            } else {
                NewString = NewString + chr;
            }

        }
        return NewString;
    }

    public static String camelCase(String string) {
        String result = "";
        boolean IsFirstWord = true;
        for (int i = 0; i < string.length(); i++) {
            if (IsFirstWord) {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    result += ((char) (string.charAt(i) + 32));
                } else if (string.charAt(i) == ' ' && result != "") {
                    IsFirstWord = false;
                } else if (string.charAt(i) != ' ') {
                    result += string.charAt(i);
                }

            } else if (string.charAt(i - 1) == ' ') {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    result += string.charAt(i);
                } else {
                    result += (char) (string.charAt(i) - 32);
                }

            } else if (string.charAt(i) != ' ') {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    result += (char) (string.charAt(i) + 32);
                } else {
                    result += (char) (string.charAt(i));
                }
            }
        }

        return result;
    }

    public static int[] allIndexOf(String string, char chr) {
        int l = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                l++;
            }
        }

        int[] arr = new int[l];

        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[counter] = i;
                counter++;
            }
        }

        return arr;
    }
}
