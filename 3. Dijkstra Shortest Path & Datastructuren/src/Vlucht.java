public class Vlucht extends Edge {
    public Vlucht(Node source, Node target, int weight) {
        super(source, target, weight);
    }

    @Override
    public String getMode() {
        return "Vlucht";
    }
}
