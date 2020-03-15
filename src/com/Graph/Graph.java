package com.Graph;

import java.util.LinkedList;

public class Graph {
     int V;
    public LinkedList<Integer>[] adjListArray;

    public Graph(int V){
        this.V = V;
        adjListArray = new LinkedList[V];
        for(int i=0; i<V; i++){
            adjListArray[i] = new LinkedList<>();
        }
    }
    void addEdge(int v, int w){
        adjListArray[v].add(w);
    }

    public int getV() {
        return V;
    }
}
