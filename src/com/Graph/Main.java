package com.Graph;

import com.Graph.AllPairShortestPath.floydWarshallAlgorithm;
import com.Graph.BreadthFirstSearch.bfs;
import com.Graph.BreadthFirstSearch.bfsCycle;
import com.Graph.DepthFirstSearch.dfs;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Graph g = new Graph(4);
        bfs b = new bfs(g);
        dfs d = new dfs(g);
        bfsCycle bf = new bfsCycle(g);
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
        /*g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        if(bf.isCycle()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }*/
        final int INF = 99999;
        int graph[][]={ {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
        };
        floydWarshallAlgorithm f = new floydWarshallAlgorithm(g);
    }
}
