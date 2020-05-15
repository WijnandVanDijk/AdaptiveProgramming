import org.junit.Test;
import java.util.Objects;
import static org.junit.Assert.*;

public class Node {
    public int id;
    public Node nodeA;
    public Node nodeB;
    public String exitA;
    public String exitB;

    public Node(int id) {
        this.id = id;
    }

    public Node verwerkInvoer(String s){
        if (Objects.equals(s, "A")){ return getNodeA();}
        else if (Objects.equals(s, "B")){ return getNodeB();}
        else {
            return null;
        }

    }

    public String getExitA() {
        return exitA;
    }

    public void setExitA(String exitA) {
        this.exitA = exitA;
    }

    public String getExitB() {
        return exitB;
    }

    public void setExitB(String exitB) {
        this.exitB = exitB;
    }

    public void setNodeA(Node n) {
        this.nodeA = n;
    }

    public void setNodeB(Node n) {
        this.nodeB = n;
    }

    @Override
    public String toString() {
        return "s"+ id;
    }
    public Node getNodeA() {
        return nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

    public String endNode(String s){
        if (Objects.equals(s, "A")){ return getExitA();}
        else if (Objects.equals(s, "B")){ return getExitB();}
        else {
            return null;
        }

    }
}