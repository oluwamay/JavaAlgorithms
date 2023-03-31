package CollectionsAlgo;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
    public static int makeAnagram(String a, String b) {
        int[] freqA = new int[26];
        int[] freqB = new int[26];

        // Step 2: Increment frequency of each letter in string a
        for (int i = 0; i < a.length(); i++) {
            freqA[a.charAt(i) - 'a']++;
        }

        // Step 3: Decrement frequency of each letter in string b
        for (int i = 0; i < b.length(); i++) {
            freqB[b.charAt(i) - 'a']--;
        }

        // Step 4: Sum absolute differences between each frequency
        int deletions = 0;
        for (int i = 0; i < 26; i++) {
           int delRESULT = Math.abs(freqA[i] + freqB[i]);
            deletions += delRESULT;

        }

        return deletions;
    }

}
