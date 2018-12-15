package General;

import java.util.LinkedList;

public abstract class Representation {
    public LinkedList<Integer> array[];
    public int vertices;

    public Representation(int v){
        this.vertices=v;
        array=new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            array[i]=new LinkedList<>();
        }
    }

    public abstract void addEdge(Representation graph, int src, int dest);

    public void printGraph(Representation graph){
        for (int i = 0; i < graph.vertices; i++) {
            System.out.println("Adjacency list of vertex"+i);
            System.out.print("head");
            for (Integer crawl :
                    graph.array[i]) {
                System.out.print("->"+crawl);
            }
            System.out.println();
        }
    }
}
