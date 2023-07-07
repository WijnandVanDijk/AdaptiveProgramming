public class Stap extends Edge {
    private Reis reis;

    public Stap(Node source, Node target, int weight, Reis reis) {
        super(source, target, weight);
        this.reis = reis;
    }

    public Reis getReis() {
        return reis;
    }

    @Override
    public String getMode() {
        return reis.getName();
    }
}
