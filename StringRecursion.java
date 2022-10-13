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
    
    public static void main(String[] args) {
    }
}
