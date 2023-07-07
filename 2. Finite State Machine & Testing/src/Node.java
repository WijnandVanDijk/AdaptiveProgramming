import java.util.Map;
import java.util.HashMap;

public class Node {
    private String name;
    private Map<String, Node> textTransitions;
    private Map<Double, Node> probabilityTransitions;

    public Node(String name) {
        this.name = name;
        textTransitions = new HashMap<>();
        probabilityTransitions = new HashMap<>();
    }

    public void addTransition(String input, Node nextNode) {
        textTransitions.put(input, nextNode);
    }

    public void addTransition(double probability, Node nextNode) {
        probabilityTransitions.put(probability, nextNode);
    }

    public Node getTransition(String input) {
        return textTransitions.get(input);
    }

    public Node getTransition(double probability) {
        double cumulativeProbability = 0.0;
        for (Map.Entry<Double, Node> entry : probabilityTransitions.entrySet()) {
            cumulativeProbability += entry.getKey();
            if (probability <= cumulativeProbability) {
                return entry.getValue();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
