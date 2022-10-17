import java.util.Arrays;

public class StringRecursion {
    public static int length(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return length(s.substring(1)) + 1;
    }

    public static boolean equalsIgnoreCase(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty() || s1.substring(1).isEmpty()) {
            return true;
        }
        if (Character.toLowerCase(s1.charAt(0)) == Character.toLowerCase(s2.charAt(0))) {
            return equalsIgnoreCase(s1.substring(1), s2.substring(1));
        }
        return false;
    }

    public static int countChar(String s, char c) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == c) {
            return countChar(s.substring(1), c) + 1;
        }
        return countChar(s.substring(1), c);
    }

    public static boolean isVowel(char x) {
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        for (char c : vowels) {
            if (c == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean equalsIgnoreVowel(String s1, String s2) {
        if (s2.isEmpty() && s2.isEmpty()) {
            return true;
        }

        // Note: Ask teacher about null values for char
        char c1 = 0;
        char c2 = 0;
        if (!s1.isEmpty()) {
            c1 = s1.charAt(0);
        }
        if (!s2.isEmpty()) {
            c2 = s2.charAt(0);
        }

        // Remove vowels from non-empty strings
        if (c1 != 0 && isVowel(c1)) {
            return equalsIgnoreVowel(s1.substring(1), s2);
        }
        if (c2 != 0 && isVowel(c2)) {
            return equalsIgnoreVowel(s1, s2.substring(1));
        }

        // The current first characters of the two arrays are not vowels; compare chars
        if (c1 == c2) {
            return equalsIgnoreVowel(s1.substring(1), s2.substring(1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(equalsIgnoreVowel("kangaroo", "kongeroo"));
    }
}
