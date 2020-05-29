import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class AlgoTest {

    Graph graph;

    List<List> Output = new LinkedList<>();
    @Before
    public void Setup(){

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");
        Node nodeI = new Node("I");
        graph = new Graph();
        Stap s1 = new Stap(nodeB,1000000,Vlucht.class,1,10); // A->B

        Stap s2 = new Stap(nodeC,15,Rit.class,25,30); // A->C

        Stap s3 = new Stap(nodeD,7,Treinrit.class,50,5); // B->D

        Stap s4 = new Stap(nodeD,3,Rit.class,2,5); // C->D

        Stap s5 = new Stap(nodeE,5,Treinrit.class,12,15); // B->E

        Stap s6 = new Stap(nodeF,3,Rit.class,1,8); // D->F

        Stap s7 = new Stap(nodeF,10,Rit.class,5,12); // E->F

        Stap s8 = new Stap(nodeG,25,Vlucht.class,10,25); // C->G

        Stap s9 = new Stap(nodeG,8,Rit.class,2,8); // F->G

        Stap s10 = new Stap(nodeH,10,Vlucht.class,5,2); // F->H

        Stap s11 = new Stap(nodeH,8,Treinrit.class,4,8); // G->H

        Stap s12 = new Stap(nodeI,10,Rit.class,2,15); // H->I

        Stap s13 = new Stap(nodeI,15,Treinrit.class,8,5); // E->I

        Reis r1 = new Reis();

        r1.addNode(nodeA);
        r1.addNode(nodeH);

        nodeA.addStap(s1);
        nodeA.addStap(s2);

        nodeB.addStap(s3);
        nodeB.addStap(s5);

        nodeC.addStap(s4);
        nodeC.addStap(s8);

        nodeD.addStap(s6);

        nodeE.addStap(s7);
        nodeE.addStap(s13);

        nodeF.addStap(s9);
        nodeF.addStap(s10);

        nodeG.addStap(s11);

        nodeH.addStap(s12);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.addNode(nodeG);
        graph.addNode(nodeH);
        graph.addNode(nodeI);

        Comparable c1 = new Comparable();

        Output.add(c1.run(r1,graph));

    }
    @Test
    public void calculateBestPathFromSource() {

        assertEquals(Output.get(0).get(0).toString().length()/3,5);
        assertEquals(Output.get(0).get(1).toString().length()/3,5);
        assertEquals(Output.get(0).get(2).toString().length()/3,5);
    }
}