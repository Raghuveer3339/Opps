import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String s1 = "Yes", s2 = "esy";
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + isAnagram(s1, s2));

        s1 = "tarr"; s2 = "Ratr";
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + isAnagram(s1, s2));
    }
}
