package org.example.multiply_strings;

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] res = new int[num1.length() + num2.length()];

        char[] n1 = new StringBuilder(num1).reverse().toString().toCharArray();
        char[] n2 = new StringBuilder(num2).reverse().toString().toCharArray();


        for (int i1 = 0; i1 < n1.length; i1++) {
            for (int i2 = 0; i2 < n2.length; i2++) {
                int digit = (n1[i1] - '0') * (n2[i2] - '0');
                res[i1 + i2] += digit;
                res[i1 + i2 + 1] += res[i1 + i2] / 10;
                res[i1 + i2] = res[i1 + i2] % 10;
            }
        }

        int beg = res.length - 1;
        while (beg > 0 && res[beg] == 0) {
            beg--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = beg; i >= 0; i--) {
            sb.append(res[i]);
        }

        return sb.toString();
    }
}
