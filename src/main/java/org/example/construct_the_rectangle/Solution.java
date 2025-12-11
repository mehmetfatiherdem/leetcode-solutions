package org.example.construct_the_rectangle;

public class Solution {
    public int[] constructRectangle(int area) {
        int[] ar = new int[2];
        int w = (int)Math.sqrt(area);
        while(w>=2 && area%w != 0) w--;

        ar[0] = area/w;
        ar[1] = w;

        return ar;
    }
}
