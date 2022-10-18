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
        char c1 = 0, c2 = 0;
        if (s2.isEmpty() && s2.isEmpty()) {
            return true;
        }

        if (s1.isEmpty()) {
            c1 = s1.charAt(0);
        }
        if (s1.isEmpty()) {
            c2 = s2.charAt(0);
        }

        if (c1 != 0 && isVowel(c1)) {
            return equalsIgnoreVowel(s1.substring(1), s2);
        }
        if (c2 != 0 && isVowel(c2)) {
            return equalsIgnoreVowel(s1, s2.substring(1));
        }
        if (c1 == c2) {
            return equalsIgnoreVowel(s1.substring(1), s2.substring(1));
        }
        return false;
    }

    public static String moveToEnd(String s, char x) {
        if (s.isEmpty()) {
            return s;
        }
        if (s.charAt(0) == x) {
            return moveToEnd(s.substring(1), x) + s.charAt(0);
        }
        return s.substring(0, 1) + moveToEnd(s.substring(1), x);
    }

    public static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean palindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
