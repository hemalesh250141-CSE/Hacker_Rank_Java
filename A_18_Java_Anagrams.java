import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
    // If lengths differ, they cannot be anagrams
    if (a.length() != b.length()) {
        return false;
    }
    
    // Convert both strings to lowercase
    a = a.toLowerCase();
    b = b.toLowerCase();
    
    // Frequency array for English alphabet ('a' through 'z')
    int[] charCounts = new int[26];
    
    // Count frequencies of characters in both strings
    for (int i = 0; i < a.length(); i++) {
        charCounts[a.charAt(i) - 'a']++;
        charCounts[b.charAt(i) - 'a']--;
    }
    
    // If any frequency is non-zero, they are not anagrams
    for (int count : charCounts) {
        if (count != 0) {
            return false;
        }
    }
    
    return true;
}

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
