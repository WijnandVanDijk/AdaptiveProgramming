import java.util.ArrayList;

public class Reis {
    //Deze class houd de start en de eindbestemming bij
    public ArrayList<Node> nodes = new ArrayList<>();

    public void addNode(Node n){
        nodes.add(n);
    }

    public Node getStartNode(){
        return nodes.get(0);
    }

    public Node getEndNode(){
        return nodes.get(nodes.size() - 1);
    }

}