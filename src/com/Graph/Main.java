package com.Graph;

import com.Graph.BreadthFirstSearch.bfs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph g = new Graph(4);
        bfs b = new bfs(g);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        b.searchBFS(2);
    }
}
