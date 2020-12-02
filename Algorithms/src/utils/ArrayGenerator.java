package utils;

public class ArrayGenerator {

    private ArrayGenerator() {
    }

    public static Integer[] generatorOrderArray(int n) {
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
