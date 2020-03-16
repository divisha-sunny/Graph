package com.Graph.DepthFirstSearch;

import com.Graph.Graph;

import java.util.Iterator;

public class dfs {
    Graph g;

    public dfs(Graph g) {
        this.g = g;
    }
    public void DFSTraversal(int s, boolean visited[]){
        visited[s] = true;
        System.out.println(s+" ");
        Iterator<Integer> i = g.adjListArray[s].listIterator();
        while(i.hasNext())
        {
            int n = i.next();
            if(!visited[n]){
                DFSTraversal(n, visited);
            }
        }

    }
    public void searchDFS(int s){
        boolean visited[] = new boolean[g.getV()];
        DFSTraversal(s, visited);
    }

}
