package org.example.palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x!=0 && (x%10 == 0)){
            return false;
        }
        int pal = 0;
        int num = x;
        while(num>0){
            pal = (pal*10) + (num%10);
            num = num/10;
        }
        return pal == x;
    }
}