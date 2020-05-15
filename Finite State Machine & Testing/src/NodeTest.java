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
    }
}