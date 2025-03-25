package org.example.maximum_matching_of_players_with_trainers;

import java.util.Arrays;

public class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int sum = 0;
        int i = 0, j = 0;
        while(i<players.length && j<trainers.length) {
            if(trainers[j]>=players[i]) {
                sum++;
                j++;
                i++;
            }
            else {
                j++;
            }
        }
        return sum;
    }
}
