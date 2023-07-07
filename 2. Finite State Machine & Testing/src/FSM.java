import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class FSM {
    private Map<String, Node> nodes;
    private Node startNode;
    private Node currentNode;
    private Random random;

    public FSM() {
        nodes = new HashMap<>();
        random = new Random();
    }

    public void addTextTransition(String from, String to, String input) {
        if (nodes.containsKey(from) && nodes.containsKey(to)) {
            Node fromNode = nodes.get(from);
            Node toNode = nodes.get(to);
            fromNode.addTransition(input, toNode);
        }
    }

    public void addProbabilityTransition(String from, String to, double probability) {
        if (nodes.containsKey(from) && nodes.containsKey(to)) {
            Node fromNode = nodes.get(from);
            Node toNode = nodes.get(to);
            fromNode.addTransition(probability, toNode);
        }
    }

    public void processTextInput(String input) {
        if (currentNode != null) {
            Node nextNode = currentNode.getTransition(input);
            if (nextNode != null) {
                currentNode = nextNode;
            }
        }
    }

    public void processProbabilityInput() {
        if (currentNode != null) {
            Node nextNode = currentNode.getTransition(random.nextDouble());
            if (nextNode != null) {
                currentNode = nextNode;
            }
        }
    }

    public String getCurrentState() {
        return (currentNode != null) ? currentNode.getName() : null;
    }

    public void addNode(String name) {
        Node node = new Node(name);
        nodes.put(name, node);
        if (startNode == null) {
            startNode = node;
            currentNode = node;
        }
    }
}
