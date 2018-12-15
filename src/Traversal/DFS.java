package Traversal;

import General.Representation;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS extends Representation {

    public DFS(int v) {
        super(v);
    }

    @Override
    public void addEdge(Representation graph, int src, int dest) {
        graph.array[src].add(dest);
    }

    public void printDFS(Representation graph, int start){
        boolean[] visited=new boolean[graph.vertices];
        LinkedList<Integer> queue=new LinkedList<>();
        visited[start]=true;
        System.out.println(" "+start+"");
        Iterator<Integer> i=graph.array[start].iterator();
        while (i.hasNext()){
        int n=i.next();
        while (!visited[n]){
            printDFS(graph,n);
        }
        }
    }
}
