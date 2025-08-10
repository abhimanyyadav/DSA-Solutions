// Approach 1
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false; // Early exit for different lengths

        HashMap<Character, Integer> map = new HashMap<>();

        for (char n : s.toCharArray()) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (char m : t.toCharArray()) {
            if (!map.containsKey(m)) {
                return false; // char not found → not an anagram
            }
            map.put(m, map.get(m) - 1);
            if (map.get(m) == 0) {
                map.remove(m);
            }
        }

        return map.isEmpty();
    }
}

// Approach 2
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}  