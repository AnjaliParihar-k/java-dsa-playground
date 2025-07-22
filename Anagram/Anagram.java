import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if (a.length() >= 1 && b.length() <= 50 && a.length() == b.length()) {
            HashMap<Character, Integer> map =getMapCount(a.toLowerCase().toCharArray());
            if (map.equals(getMapCount(b.toLowerCase().toCharArray()))) {
                return true;
            }
            return false;
        } else
            return false;
    }

    private static HashMap<Character, Integer> getMapCount(char[] charArray) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
