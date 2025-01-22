package NJIT_java.Graphs;
import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Integer> linkedList[];

    public Graph(int vertices) {
        this.vertices = vertices;

        // Type safety: The expression of type LinkedList[] needs unchecked conversion to conform to LinkedList<Integer>[]Java(16777748)
        linkedList = new LinkedList[vertices];
        for(int i = 0; i < vertices; i++) {
            linkedList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        linkedList[source].add(destination);
        linkedList[destination].add(source);
    }

    void printGraph() {
        for(int i = 0; i < vertices; i++) {
            if(linkedList[i].size() > 0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for(int j = 0; j < linkedList[i].size(); j++) {
                    System.out.print(linkedList[i].get(j)+ " ");
                }
                System.out.println();
            }
        }
    }





    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(3, 1);
        graph.printGraph();

    }
}
