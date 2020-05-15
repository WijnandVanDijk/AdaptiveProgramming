import java.util.ArrayList;
import java.util.List;


    public class FSM {
        private List<Node> nodes = new ArrayList<Node>();
        private List<Node> pathTakenThroughFSM = new ArrayList<Node>();
        private List<Character> transistiesCases = new ArrayList<Character>();


        public FSM(List<Node> nodes) {
            this.nodes = nodes;
        }

    public void run(Node startNode, String Invoer) {
        Node currentNode = startNode;
        pathTakenThroughFSM.add(currentNode);
        String pathString = Invoer;                  //String bestaand uit A's en B's

        for (char ch : pathString.toCharArray()) {

            transistiesCases.add(ch);
            Node nieuweNode = currentNode.verwerkInvoer(Character.toString(ch));

            if (nieuweNode != null) {
                currentNode = nieuweNode;
            } else {
                System.out.println("end node");
                System.out.println(currentNode.endNode(Character.toString(ch)));
                break;
            }
            pathTakenThroughFSM.add(nieuweNode);

        }
        System.out.println("Nodes: " + pathTakenThroughFSM);
        System.out.println("Invoer: "+ transistiesCases);
    }
}

