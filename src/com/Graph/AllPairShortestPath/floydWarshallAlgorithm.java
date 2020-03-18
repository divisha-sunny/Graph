package com.Graph.AllPairShortestPath;

import com.Graph.Graph;

public class floydWarshallAlgorithm {
    Graph g;

    public floydWarshallAlgorithm(Graph g) {
        this.g = g;
    }
    final static int INF = 99999;
    void floydWarshall(int graph[][]){

        int dist[][] = new int[g.getV()][g.getV()];
        //Initialize solution matrix matrix same as input graph matrix.
        for(int i=0; i<g.getV(); i++){
            for(int j=0; i<g.getV(); j++){
                dist[i][j] = graph[i][j];
            }
        }
        for(int k=0; k<g.getV(); k++){
            for(int i=0; i<g.getV(); i++){
                for(int j=0; j<g.getV(); j++){
                    if(dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

    }
    void printSolutionGraph(int dist[][]){
        System.out.println("The following graph shows the shortest path distances");
        for(int i=0; i<g.getV(); i++){
            for(int j=0; j<g.getV(); j++){
                if(dist[i][j] == INF){
                    System.out.println("INF");
                }
                else{
                    System.out.println(dist[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
