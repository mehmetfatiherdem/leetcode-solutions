package org.example.course_schedule;

import java.util.*;

public class Solution {
    public boolean dfs(int crs, Set<Integer> vs, Map<Integer, List<Integer>> hm) {
        if(vs.contains(crs)) {
            return false;
        } else if(hm.get(crs).isEmpty()) {
            return true;
        }
        vs.add(crs);
        for(int req: hm.get(crs)) {
            if(!dfs(req, vs, hm)) return false;
        }

        vs.remove(crs);
        hm.put(crs, new ArrayList<>());
        return true;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length == 0) return true;
        Map<Integer, List<Integer>> hm = new HashMap<>();

        for(int i = 0; i<numCourses; i++) {
            hm.put(i, new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) hm.get(prerequisite[0]).add(prerequisite[1]);


        Set<Integer> vs = new HashSet<>();

        for(int j = 0; j<numCourses; j++) {
            if(!dfs(j, vs, hm)) return false;
        }

        return true;
    }
}
