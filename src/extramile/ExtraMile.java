package extramile;

public class ExtraMile {
    public static void main(String[] args) {
        System.out.println(capitalize("abcdef"));
        int[] array = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int[] emptyArray = {};
        System.out.println(frequency(array));
        System.out.println(frequency(emptyArray));
    }

    private static String capitalizeEven(String string) {
        String output = "";
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) {
                output += Character.toUpperCase(string.charAt(i));
            } else {
                output += Character.toLowerCase(string.charAt(i));
            }
        }
        return output;
    }

    private static String capitalizeOdd(String string) {
        String output = "";
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 != 0) {
                output += Character.toUpperCase(string.charAt(i));
            } else {
                output += Character.toLowerCase(string.charAt(i));
            }
        }
        return output;
    }

    private static String capitalize(String string) {
        String output = "['" + capitalizeEven(string) + "', '" + capitalizeOdd(string) + "']";
        return output;
    }

    private static int frequency(int[] array) {
        int frequency = 0;
        int elementMaxFrequency = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > frequency) {
                frequency = count;
                elementMaxFrequency = array[i];
            }
        }
        return frequency;
    }
}