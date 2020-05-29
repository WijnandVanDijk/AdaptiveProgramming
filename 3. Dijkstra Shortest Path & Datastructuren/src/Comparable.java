import java.util.LinkedList;
import java.util.List;

public class Comparable {
    public List<String> korsteAfstand = new LinkedList<>();
    public List<String> kortsteTijd = new LinkedList<>();
    public List<String> goedkoopsteRoute = new LinkedList<>();
    public List<List> alleRoutes = new LinkedList<>();

    public List<String> getKorsteAfstand() {
        return korsteAfstand;
    }

    public List<String> getKortsteTijd() {
        return kortsteTijd;
    }

    public List<String> getGoedkoopsteRoute() {
        return goedkoopsteRoute;
    }

    public List<List> run(Reis reis, Graph graph) {
        alleRoutes.clear();
        //Code voor kortste afstand route
        graph = Algoritme.calculateBestPathFromSource(graph, reis.getStartNode(),0);

        System.out.println("Kortste route: ");
        for (Node path : reis.getEndNode().getShortestPath()) {
            //System.out.println(path.getName());
            korsteAfstand.add(path.getName());
        }
        //System.out.println(reis.getEndNode().getName());
        korsteAfstand.add(reis.getEndNode().getName());
        System.out.println(korsteAfstand);

        //Code voor snelste route in tijd
        graph = Algoritme.calculateBestPathFromSource(graph, reis.getStartNode(), 1);

        System.out.println("Snelste route: ");
        for (Node path : reis.getEndNode().getShortestPath()) {
            //System.out.println(path.getName());
            kortsteTijd.add(path.getName());
        }
        //System.out.println(reis.getEndNode().getName());
        kortsteTijd.add(reis.getEndNode().getName());
        System.out.println(kortsteTijd);

        //Code voor goedkoopste route
        graph = Algoritme.calculateBestPathFromSource(graph, reis.getStartNode(), 2);

        System.out.println("Goedkoopste route: ");
        for (Node path : reis.getEndNode().getShortestPath()) {
            //System.out.println(path.getName());
            goedkoopsteRoute.add(path.getName());
        }
        //System.out.println(reis.getEndNode().getName());
        goedkoopsteRoute.add(reis.getEndNode().getName());
        System.out.println(goedkoopsteRoute);
        alleRoutes.add(korsteAfstand);
        alleRoutes.add(kortsteTijd);
        alleRoutes.add(goedkoopsteRoute);
        return alleRoutes;
    }


}