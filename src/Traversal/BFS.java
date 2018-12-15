package Traversal;

import General.Representation;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS extends Representation {

    public BFS(int v) {
        super(v);
    }

    @Override
    public void addEdge(Representation graph, int src, int dest) {
        graph.array[src].add(dest);
    }

    public void printBFS(Representation graph,int start){
        boolean visited[]=new boolean[graph.vertices];

        LinkedList<Integer> queue=new LinkedList<>();
        visited[start]=true;
        queue.add(start);

        while(queue.size()!=0){
            start=queue.poll();
            System.out.print(start+" ");
            Iterator<Integer> i=graph.array[start].iterator();
            while (i.hasNext()){
                int n=i.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }
}
