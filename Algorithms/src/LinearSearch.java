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

    public static <E> int search2(E[] data, E target) {
        int i = 0, j = data.length - 1;
        while (i != j) {
            if (data[i].equals(target)) {
                return i;
            }
            i++;
            if (data[j].equals(target)) {
                return j;
            }
            j--;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1000000;
        int t = 500000;
        Integer[] data = ArrayGenerator.generatorOrderArray(n);

        Watch.begin();
        System.out.println(LinearSearch.search(data, t));
        Watch.end("search");

        Watch.begin();
        System.out.println(LinearSearch.search2(data, t));
        Watch.end("search2");
    }
}
