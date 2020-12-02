import utils.ArrayGenerator;
import utils.Debug;

/**
 * 线性查询
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1000000;
        int t = 500000;
        Integer[] data = ArrayGenerator.generatorOrderArray(n);

        Debug.beginTest();
        System.out.println(LinearSearch.search(data, t));
        Debug.endTest("LinearSearch");
    }
}
