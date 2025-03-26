package org.example.license_key_formatting;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int ck = 0;
        for(int i = s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '-'){
                continue;
            }
            if(ck<k) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                ck++;
                if(ck == k) {
                    sb.append("-");
                    ck = 0;
                }
            }
        }
        if(sb.length()>0 && sb.charAt(sb.length()-1) == '-') sb.deleteCharAt(sb.length()-1);
        return sb.reverse().toString();
    }
}
