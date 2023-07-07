import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class DijkstraAlgorithm {
    public void shortestPath(Graph graph, Node source) {
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(Node::getDistance));

        source.setDistance(0);
        queue.add(source);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            for (Edge edge : currentNode.getConnections()) {
                Node adjacentNode = edge.getTarget();
                int weight = edge.getWeight();
                int distance = currentNode.getDistance() + weight;

                if (distance < adjacentNode.getDistance()) {
                    queue.remove(adjacentNode);
                    adjacentNode.setDistance(distance);
                    adjacentNode.setPrevious(currentNode);
                    queue.add(adjacentNode);
                }
            }
        }
    }

    public List<Node> getShortestPathTo(Node target) {
        List<Node> path = new ArrayList<>();

        for (Node node = target; node != null; node = node.getPrevious()) {
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }
}
