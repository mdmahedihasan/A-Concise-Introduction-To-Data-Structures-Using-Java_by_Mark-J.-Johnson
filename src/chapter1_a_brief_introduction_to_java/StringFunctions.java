package chapter1_a_brief_introduction_to_java;

public class StringFunctions {

    public static int count(String s, String target) {
        int count = 0;
        int n = target.length();
        for (int i = 0; i < s.length() - n; i++) {
            String piece = s.substring(i, i + n);
            if (piece.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static String acronym(String phrase) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String token : phrase.split("\\s+")) {
            stringBuilder.append(token.toUpperCase().charAt(0));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println("Number of this's : " + count("this and this and that and this", "this"));
    }
}
