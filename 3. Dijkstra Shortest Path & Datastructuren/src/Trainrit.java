public class Trainrit extends Edge {
    public Trainrit(Node source, Node target, int weight) {
        super(source, target, weight);
    }

    @Override
    public String getMode() {
        return "Trainrit";
    }
}
