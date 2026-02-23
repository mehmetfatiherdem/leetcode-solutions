package org.example.add_strings;

public class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length()-1, j = num2.length()-1;
        StringBuilder str = new StringBuilder();

        while(i >= 0 || j >= 0) {
            int n1 = 0, n2 = 0;
            if(i>=0) n1 = num1.charAt(i--) - '0';
            if(j>=0) n2 = num2.charAt(j--) - '0';
            int sum = n1+n2+carry;
            if(sum >= 10) carry = 1;
            else carry = 0;
            str.append(sum%10);
        }
        if(carry == 1) str.append(1);

        return str.reverse().toString();
    }
}
