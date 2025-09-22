package org.example.minimum_window_substring;

public class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int[] freq = new int[128];
        int[] window = new int[128];
        int have = 0, need = 0;

        for (char c : t.toCharArray()) {
            if (freq[c] == 0) need++;
            freq[c]++;
        }

        int l = 0;
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;

        for (int j = 0; j < m; j++) {
            char c = s.charAt(j);
            window[c]++;

            if (freq[c] > 0 && window[c] == freq[c])
                have++;

            while (have == need) {
                if (j - l + 1 < resLen) {
                    res[0] = l;
                    res[1] = j;
                    resLen = j - l + 1;
                }
                window[s.charAt(l)]--;
                if (freq[s.charAt(l)] > 0 && window[s.charAt(l)] < freq[s.charAt(l)])
                    have--;
                l++;
            }
        }

        return resLen != Integer.MAX_VALUE ? s.substring(res[0], res[1] + 1) : "";
    }
}
