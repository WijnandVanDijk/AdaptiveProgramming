public class Rit extends Edge {
    public Rit(Node source, Node target, int weight) {
        super(source, target, weight);
    }

    @Override
    public String getMode() {
        return "Rit";
    }
}
