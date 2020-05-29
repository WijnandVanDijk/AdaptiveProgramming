import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<List> Output = new LinkedList<>();
        //Aanmaken van Nodes
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");
        Node nodeI = new Node("I");

/*
        // Zelf het begin- en eindpunt instellen heeft gewerkt maar nu niet meer.
        Scanner Begin = new Scanner(System.in);
        System.out.println("Waar begint de reis? kies uit A T/M H: ");
        String Beginpunt = Begin.nextLine();
        System.out.println("Beginpunt is: " + Beginpunt);


        Scanner Eind = new Scanner(System.in);
        System.out.println("Waar wilt u heen? kies uit A T/M I: ");
        String Destination = Eind.nextLine();
        System.out.println("Eindbestemming is: " + Destination);
*/

        Reis r1 = new Reis();
        r1.addNode(nodeA);
        r1.addNode(nodeD);
        /*
        if (Beginpunt.equals('A')) {
            r1.addNode(nodeA);}
        if (Beginpunt.equals('B')) {
            r1.addNode(nodeB);}
        if (Beginpunt.equals('C')) {
            r1.addNode(nodeC);}
        if (Beginpunt.equals('D')) {
            r1.addNode(nodeD);}
        if (Beginpunt.equals('E')) {
            r1.addNode(nodeE);}
        if (Beginpunt.equals('F')) {
            r1.addNode(nodeF);}
        if (Beginpunt.equals('G')) {
            r1.addNode(nodeG);}
        if (Beginpunt.equals('H')) {
            r1.addNode(nodeH);}
        if (Beginpunt.equals('I')) {
            r1.addNode(nodeI);}

        if (Destination.equals('A')) {
            r1.addNode(nodeA);}
        if (Destination.equals('B')) {
            r1.addNode(nodeB);}
        if (Destination.equals('C')) {
            r1.addNode(nodeC);}
        if (Destination.equals('D')) {
            r1.addNode(nodeD);}
        if (Destination.equals('E')) {
            r1.addNode(nodeE);}
        if (Destination.equals('F')) {
            r1.addNode(nodeF);}
        if (Destination.equals('G')) {
            r1.addNode(nodeG);}
        if (Destination.equals('H')) {
            r1.addNode(nodeH);}
        if (Destination.equals('I')) {
            r1.addNode(nodeI);}


        Aanmaken van stappen (prijs en tijden zijn niet realistisch)
        de prijzen en afstanden zijn niet goed afgestemd op elkaar, meestal krijg je voor alle 3 de routes dezelfde.
         U kunt zien dat de algoritmes wel werken als u de getallen hieronder drastisch veranderd
*/

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

        //Het afdrukkken van elke stap
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());
        System.out.println(s6.toString());
        System.out.println(s7.toString());
        System.out.println(s8.toString());
        System.out.println(s9.toString());
        System.out.println(s10.toString());
        System.out.println(s11.toString());
        System.out.println(s12.toString());
        System.out.println(s13.toString());

        //Toevoegen van stappen van node naar node
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

        //nodeI.addStap(); I loopt dood

        //Een niewe graph aanmaken
        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.addNode(nodeG);
        graph.addNode(nodeH);
        graph.addNode(nodeI);

        //het aanmaken van een comparable class
        Comparable c1 = new Comparable();

        //Het runnen van de comparable
        Output.add(c1.run(r1,graph));



    }
}