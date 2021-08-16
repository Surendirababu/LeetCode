package ds.Graph;

import java.util.LinkedList;

public class AdjancencyListRepresentationOfUndirectedGraph {

    public static class Graph {

        LinkedList<Integer>[] adjacencyList;
        int V;
        int E;

        Graph(int nodes) {
            this.V = nodes;
            this.adjacencyList = new LinkedList[nodes];
            for (int i = 0 ; i < V ; i++){
                this.adjacencyList[i] = new LinkedList<>();
            }
            this.E = 0;
        }

        public void addEdge(int node1,int node2){
            this.adjacencyList[node1].add(node2);
            this.adjacencyList[node2].add(node1);
            this.E++;
        }

        public void print() {
            System.out.println("Number Of Vertices : " + this.V + " Number Of Edges : " + this.E);
            for(int i = 0; i < V; i++) {
                System.out.print(i + ":");
                for(int w : this.adjacencyList[i]){
                    System.out.print(w + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String a[]) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.print();
    }


}
