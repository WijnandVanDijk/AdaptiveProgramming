import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NodeTest {

    @Test
    public void verwerkInvoer() {
        Node n1 = new Node(1);
        assertEquals(n1.getNodeA(), n1.verwerkInvoer("A"));
        assertEquals(n1.getNodeB(), n1.verwerkInvoer("B"));
        assertNull(n1.verwerkInvoer("C"));
        assertNull(n1.verwerkInvoer("D"));
        assertNull(n1.verwerkInvoer("E"));
        assertNull(n1.verwerkInvoer(""));

    }

    @Test
    public void getStopA() {
        Node n1 = new Node(1);
        n1.setStopA("StopA");
        assertEquals("StopA", n1.getStopA());
    }


    @Test
    public void getStopB() {
        Node n1 = new Node(1);
        n1.setStopB("StopB");
        assertEquals("StopB", n1.getStopB());

    }

    @Test
    public void getNodeA() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.setNodeA(n2);
        assertEquals(n2, n1.getNodeA());
    }

    @Test
    public void getNodeB() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.setNodeB(n3);
        assertEquals(n3, n1.getNodeB());
    }
}