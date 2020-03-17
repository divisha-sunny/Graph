package com.Graph;

import com.Graph.BreadthFirstSearch.bfs;
import com.Graph.BreadthFirstSearch.bfsCycle;
import com.Graph.DepthFirstSearch.dfs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Graph g = new Graph(4);
        bfs b = new bfs(g);
        dfs d = new dfs(g);
        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        b.searchBFS(2);*/
        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        d.searchDFS(2);*/
        bfsCycle bf = new bfsCycle(g);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        if(bf.isCycle()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
