package org.example.top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int n: nums) {
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue((a, b) -> hm.get(b)-hm.get(a));
        for(int key: hm.keySet()) {
            pq.add(key);
        }

        int[] ar = new int[k];
        for(int i = 0; i<k; i++) {
            ar[i] = pq.poll();
        }
        return ar;

    }

    /*
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> l = new ArrayList<>(nums.length);
        for(int i = 0; i<=nums.length; i++) {
            l.add(new ArrayList<>());
        }
        Map<Integer, Integer> hm = new HashMap<>();

        for(int n: nums) {
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }

        for(Map.Entry<Integer, Integer> m: hm.entrySet()) {
            int key = m.getKey();
            int val = m.getValue();
            l.get(val).add(key);
        }
        List<Integer> ar = new ArrayList<>();
        for(int j = l.size()-1; j>=0; j--) {
            if(l.get(j).size() != 0) {
                for(int ij = 0; ij < l.get(j).size(); ij++) {
                    ar.add(l.get(j).get(ij));
                    if(ar.size() == k) return ar.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return ar.stream().mapToInt(Integer::intValue).toArray();
    }
    */
}
