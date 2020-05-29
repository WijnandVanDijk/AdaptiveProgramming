// hulp van klas en internet
import java.util.HashSet;
import java.util.Set;

public class Graph {
    public Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) {
        this.nodes = nodes;
    }

    public Node getNode(){
        return (Node) nodes;
    }
}