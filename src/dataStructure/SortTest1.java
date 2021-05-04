package dataStructure;

public class SortTest1 {
    public static void main(String[] args) {
//        String version1 = "8.5.2.4";
//        String version2 = "8.5.3";
        String version1 = "1.0.1";
        String version2 = "1";
        System.out.println(new SortTest1().solve(version1, version2));
    }

    private int solve(String version1, String version2) {
        String[] v1StrArray = version1.split("\\.");
        String[] v2StrArray = version2.split("\\.");

        int length = Math.max(v1StrArray.length, v2StrArray.length);
        for (int i = 0; i < length; i++) {
            Integer i1 = i < v1StrArray.length ? Integer.parseInt(v1StrArray[i]) : 0;
            Integer i2 = i < v2StrArray.length ? Integer.parseInt(v2StrArray[i]) : 0;

            int comp = i1.compareTo(i2);
            if (comp != 0) {
                return comp;
            }
        }
        return 0;
    }
}
