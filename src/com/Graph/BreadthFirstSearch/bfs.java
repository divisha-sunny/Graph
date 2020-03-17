package com.Graph.BreadthFirstSearch;

import com.Graph.Graph;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    Graph g;

    public bfs(Graph g) {
        this.g = g;
    }

    public void searchBFS(int s) {
        boolean visited[] = new boolean[g.getV()];
        Queue<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while(queue.size() != 0){
            s = queue.poll();//This will return but not delete the element
            System.out.println(s+" ");
            Iterator<Integer> i = g.adjListArray[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }
}