package General;

import Traversal.BFS;

public class Main {
    public static void main(String[] args) {
        BFS graph=new BFS(4);
        graph.addEdge(graph,0,1);
        graph.addEdge(graph,0,2);
        graph.addEdge(graph,1,2);
        graph.addEdge(graph,2,0);
        graph.addEdge(graph,2,3);
        graph.addEdge(graph,3,3);
        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        graph.printBFS(graph,2);

    }
}
