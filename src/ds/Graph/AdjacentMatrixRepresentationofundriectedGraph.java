package ds.Graph;

public class AdjacentMatrixRepresentationofundriectedGraph {
    static class Graph {
        int v;
        int E;
        int[][] twodarray;

        Graph(int nodes) {
            twodarray = new int[nodes][nodes];
            this.v = nodes;
            this.E = 0;
        }

        public void addEdge(int u, int v) {
            this.twodarray[u][v] = 1;
            this.twodarray[v][u] = 1;
            this.E++;
        }

        public void print() {
            System.out.println("Number of Vertices : " + this.v + "Number of Edges : " + this.E);
            for(int i = 0; i < this.v; i++) {
                System.out.print(i + " :  ");
                for(int j = 0; j < this.v ; j++) {
                    System.out.print(this.twodarray[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String a[]){
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.print();

    }
}
