package org.example.car_fleet;

import java.util.Arrays;

public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        int cn = 0;

        int topArrival = 0;

        for (int i = 0; i<cars.length; i++) {

            double arrivalTime = (target - cars[i][0]) / cars[i][1];
            cars[i][1] = arrivalTime;
            //topArrival = i;
            cn++;

            if (cn >= 2 && cars[topArrival][1] >= cars[i][1]) cn--;
            else if (cn >= 2 && cars[topArrival][1] < cars[i][1]) topArrival = i;
        }
        return cn;
    }
}
