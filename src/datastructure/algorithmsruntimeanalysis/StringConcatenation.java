package datastructure.algorithmsruntimeanalysis;

/*
 This class compares different string-building approaches.
 It demonstrates performance impact of immutability.
 */
class StringConcatenation {

    static String usingString(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        return s;
    }

    static String usingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    static String usingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int n = 100_000;

        long start = System.currentTimeMillis();
        usingString(n);
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        usingStringBuilder(n);
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        usingStringBuffer(n);
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }
}
