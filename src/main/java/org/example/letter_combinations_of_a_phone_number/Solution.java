package org.example.letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> li = new ArrayList<>();
        backtrack(li, digits, new StringBuilder(), 0);
        return li;
    }

    public void backtrack(List<String> li, String digits, StringBuilder sb, int i) {
        if(i == digits.length()) {
            li.add(new String(sb.toString()));
            return;
        }

        if((digits.charAt(i)-'0')<7) {
            int x = ((digits.charAt(i)-'0')-2)*3;

            sb.append((char)('a'+x));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+1));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+2));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

        } else if((digits.charAt(i)-'0')==7) {
            int x = ((digits.charAt(i)-'0')-2)*3;

            sb.append((char)('a'+x));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+1));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+2));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+3));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);
        } else if((digits.charAt(i)-'0')==8) {
            int x = 19;

            sb.append((char)('a'+x));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+1));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+2));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

        } else if((digits.charAt(i)-'0')==9) {
            int x = 22;

            sb.append((char)('a'+x));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+1));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+2));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);

            sb.append((char)('a'+x+3));
            backtrack(li, digits, sb, i+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}