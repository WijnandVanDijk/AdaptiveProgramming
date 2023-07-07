public class Main {
    public static void main(String[] args) {
        FSM fsm = new FSM();
        fsm.addNode("A");
        fsm.addNode("B");
        fsm.addNode("C");
        fsm.addNode("D");
        fsm.addNode("E");
        fsm.addNode("F");

        fsm.addTextTransition("A", "B", "1");
        fsm.addTextTransition("B", "C", "0");
        fsm.addTextTransition("C", "D", "1");
        fsm.addTextTransition("D", "A", "0");
        fsm.addTextTransition("D", "E", "1");
        fsm.addTextTransition("E", "F", "0");
        fsm.addTextTransition("F", "A", "1");

        fsm.addProbabilityTransition("A", "B", 0.5);
        fsm.addProbabilityTransition("A", "C", 0.5);
        fsm.addProbabilityTransition("B", "C", 0.7);
        fsm.addProbabilityTransition("B", "D", 0.3);
        fsm.addProbabilityTransition("C", "A", 0.4);
        fsm.addProbabilityTransition("C", "B", 0.6);
        fsm.addProbabilityTransition("D", "A", 1.0);

        fsm.processTextInput("1");
        System.out.println("Current State: " + fsm.getCurrentState());

        fsm.processProbabilityInput();
        System.out.println("Current State: " + fsm.getCurrentState());

        fsm.processTextInput("0");
        System.out.println("Current State: " + fsm.getCurrentState());

        fsm.processProbabilityInput();
        System.out.println("Current State: " + fsm.getCurrentState());

        fsm.processTextInput("1");
        System.out.println("Current State: " + fsm.getCurrentState());

        fsm.processProbabilityInput();
        System.out.println("Current State: " + fsm.getCurrentState());

        fsm.processTextInput("0");
        System.out.println("Current State: " + fsm.getCurrentState());
    }
}
