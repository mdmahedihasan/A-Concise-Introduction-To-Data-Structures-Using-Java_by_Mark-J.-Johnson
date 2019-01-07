package chapter1_a_brief_introduction_to_java;

public class ArrayFunctions {

    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (target == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 14, 7, 22, 45, 12, 19, 42, 6};
        System.out.println("Search for 7 : " + linearSearch(data, 7));
        System.out.println("Search for 100 : " + linearSearch(data, 100));
    }
}
