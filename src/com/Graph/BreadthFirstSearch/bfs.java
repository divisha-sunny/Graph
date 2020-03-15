package com.Graph.BreadthFirstSearch;

import com.Graph.Graph;

import java.sql.ClientInfoStatus;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    Graph g;

    public bfs(Graph g) {
        this.g = g;
    }

    public void searchBFS(int s) {
        boolean visited[] = new boolean[g.getV()]; // By default its false
        Queue<Integer> queue = new LinkedList<Integer>();
        // Mark source node as visited first
        visited[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.poll(); //We used poll() to return and delete that element
            System.out.println(s+" ");
            // For getting adjacent elements we should use Iterator
            Iterator<Integer> i = g.adjListArray[s].listIterator();
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}