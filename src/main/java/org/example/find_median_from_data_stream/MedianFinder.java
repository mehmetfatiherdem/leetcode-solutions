package org.example.find_median_from_data_stream;

import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> sh;
    PriorityQueue<Integer> lh;

    public MedianFinder() {
        sh = new PriorityQueue<>((a, b) -> b - a);
        lh = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (sh.isEmpty() || num <= sh.peek()) {
            sh.add(num);
        } else {
            lh.add(num);
        }

        if (sh.size() > lh.size() + 1) {
            lh.add(sh.poll());
        } else if (lh.size() > sh.size()) {
            sh.add(lh.poll());
        }

    }

    public double findMedian() {
        int shs = sh.size();
        int lhs = lh.size();
        int pqs = shs + lhs;
        if (pqs % 2 == 1) {
            return sh.peek();
        }

        return ((double) (sh.peek() + lh.peek())) / 2;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
