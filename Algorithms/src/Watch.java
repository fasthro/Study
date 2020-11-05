public class Watch {

    static long st;
    static long et;

    private Watch() {
    }

    public static void begin() {
        st = System.nanoTime();
    }

    public static void end() {
        end("");
    }

    public static void end(String info) {
        et = System.nanoTime();
        double res = (et - st) / 1000000.0;
        if (info.isEmpty()) {
            System.out.println(res + " ms");
        } else {
            System.out.println(info + " > " + res + " s");
        }
    }

}
