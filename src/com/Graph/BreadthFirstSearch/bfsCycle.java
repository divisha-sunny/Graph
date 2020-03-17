package com.Graph.BreadthFirstSearch;

import com.Graph.Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfsCycle {
    Graph g;

    public bfsCycle(Graph g) {
        this.g = g;
    }

    public boolean isCycleConnected(int s, boolean[] visited) {
        int parent[] = new int[g.getV()];
        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            int u = queue.poll();//This will return but not delete the element
            Iterator<Integer> i = g.adjListArray[u].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                    parent[n] = u;
                }
                else if(parent[u] != n){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycle() {
        boolean visited[] = new boolean[g.getV()];
        for (int i = 0; i < g.getV(); i++) {
            if (!visited[i] && isCycleConnected(i,visited)) {
                return true;
            }
        }
        return false;
    }
}



