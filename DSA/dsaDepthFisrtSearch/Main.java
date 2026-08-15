public class Main{
    public static void main(String[] args) {
        
        // Depth First Search = pick a route, keep going.
        //                      If you reach a dead end, or an already visited node,
        //                      backtracck to a previous node with unvisited adajacent neighbours

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);
        


        graph.print();
        graph.depthFirstSearch(1);

        //System.out.println(graph.checkEdge(0,1));
    }
}