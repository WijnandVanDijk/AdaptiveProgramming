import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private List<Edge> connections;
    private int distance;
    private Node previous;

    public Node(String name) {
        this.name = name;
        this.connections = new ArrayList<>();
        this.distance = Integer.MAX_VALUE;
        this.previous = null;
    }

    public String getName() {
        return name;
    }

    public List<Edge> getConnections() {
        return connections;
    }

    public void addConnection(Edge connection) {
        connections.add(connection);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
