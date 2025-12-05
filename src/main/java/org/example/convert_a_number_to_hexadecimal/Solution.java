package org.example.convert_a_number_to_hexadecimal;

public class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        int m = 0x000f;
        StringBuilder sb = new StringBuilder();
        boolean passz = false;
        for(int i = 0; i<32; i+=4) {
            int n = num >> (28-i);
            n = n&m;
            if(n > 0) passz = true;
            if(!passz) continue;
            switch (n) {
                case 0:
                    sb.append(0);
                    break;
                case 1:
                    sb.append(1);
                    break;
                case 2:
                    sb.append(2);
                    break;
                case 3:
                    sb.append(3);
                    break;
                case 4:
                    sb.append(4);
                    break;
                case 5:
                    sb.append(5);
                    break;
                case 6:
                    sb.append(6);
                    break;
                case 7:
                    sb.append(7);
                    break;
                case 8:
                    sb.append(8);
                    break;
                case 9:
                    sb.append(9);
                    break;
                case 10:
                    sb.append('a');
                    break;
                case 11:
                    sb.append('b');
                    break;
                case 12:
                    sb.append('c');
                    break;
                case 13:
                    sb.append('d');
                    break;
                case 14:
                    sb.append('e');
                    break;
                case 15:
                    sb.append('f');
                    break;
            }

        }

        return sb.toString();
    }
}
