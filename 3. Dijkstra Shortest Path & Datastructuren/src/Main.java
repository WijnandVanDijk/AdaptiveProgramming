import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a new graph
        Graph graph = new Graph();

        // Create nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        // Add nodes to the graph
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        // Add connections (edges) between nodes
        nodeA.addConnection(new Stap(nodeA, nodeB, 100, new Reis("Reis1")));
        nodeB.addConnection(new Stap(nodeB, nodeD, 40, new Reis("Reis2")));
        nodeB.addConnection(new Stap(nodeB, nodeF, 70, new Reis("Reis3")));
        nodeC.addConnection(new Stap(nodeC, nodeE, 45, new Reis("Reis4")));
        nodeD.addConnection(new Stap(nodeD, nodeE, 20, new Reis("Reis5")));
        nodeD.addConnection(new Stap(nodeD, nodeF, 10, new Reis("Reis6")));
        nodeF.addConnection(new Stap(nodeF, nodeE, 50, new Reis("Reis7")));

        // Create an instance of DijkstraAlgorithm
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();

        // Find the shortest path from node A to node E
        dijkstraAlgorithm.shortestPath(graph, nodeA);
        Node targetNode = nodeE;
        List<Node> shortestPath = dijkstraAlgorithm.getShortestPathTo(targetNode);

        // Print the shortest path
        System.out.println("Shortest path from A to E:");
        for (Node node : shortestPath) {
            System.out.println(node.getName());
        }
    }
}
