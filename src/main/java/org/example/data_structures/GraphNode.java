package org.example.data_structures;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
}
