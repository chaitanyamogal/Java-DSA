package Array;

public class ValidAnagram {
	
	public static void main(String args[]) {
		String s1 = "anagram";
		String s2 = "nagaram";
		System.out.print(isAnagram(s1,s2));
	}
	
	static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
	
	
}
