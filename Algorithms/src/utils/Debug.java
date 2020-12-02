package utils;

public class Debug {

    static long st;
    static long et;

    private Debug() {
    }

    public static void beginTest() {
        st = System.nanoTime();
    }

    public static void endTest() {
        endTest("");
    }

    public static void endTest(String info) {
        et = System.nanoTime();
        double res = (et - st) / 1000000000.0;
        if (info.isEmpty()) {
            System.out.println(res + " ms");
        } else {
            System.out.println(info + " time：" + res + "s");
        }
    }
}
