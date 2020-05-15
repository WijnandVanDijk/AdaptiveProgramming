import org.junit.Test;
import java.util.Objects;
import static org.junit.Assert.*;

public class Node {
    public int id;
    public Node nodeA;
    public Node nodeB;
    public String StopA;
    public String StopB;

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

    public String getStopA() {
        return StopA;
    }

    public void setStopA(String StopA) {
        this.StopA = StopA;
    }

    public String getStopB() {
        return StopB;
    }

    public void setStopB(String StopB) {
        this.StopB = StopB;
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
        if (Objects.equals(s, "A")){ return getStopA();}
        else if (Objects.equals(s, "B")){ return getStopB();}
        else {
            return null;
        }

    }
}