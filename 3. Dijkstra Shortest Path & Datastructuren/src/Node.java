// hulp van Klas

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    Map<Node, Integer> adjacentNodesDistance = new HashMap<>();
    Map<Node, Integer> adjacentNodesTime = new HashMap<>();
    Map<Node, Integer> adjacentNodesPrice = new HashMap<>();

    //Eigentoevoeing, meer HashMaps voor verschillenden soorten vergelijkingen
    public void addStap(Stap stap){
        addDestinationDistance(stap.n,stap.distance);
        addDestinationTime(stap.n,stap.tijdInMinuten);
        addDestinationPrice(stap.n,stap.price);
    }

    public void addDestinationPrice(Node destination, Integer distance) {
        adjacentNodesPrice.put(destination, distance);
    }


    public Map<Node, Integer> getadjacentNodesPrice() {
        return adjacentNodesPrice;
    }

    public void setadjacentNodesPrice(Map<Node, Integer> adjacentNodesPrice) {
        this.adjacentNodesPrice = adjacentNodesPrice;
    }

    public void addDestinationTime(Node destination, int time) {
        adjacentNodesTime.put(destination, time);
    }


    public Map<Node, Integer> getadjacentNodesTime() {
        return adjacentNodesTime;
    }

    public void setadjacentNodesTime(Map<Node, Integer> adjacentNodesTime) {
        this.adjacentNodesTime = adjacentNodesTime;
    }

    public int getTime(Stap stap){
        return stap.tijdInMinuten;
    }
    public void addDestinationDistance(Node destination, int distance) {
        adjacentNodesDistance.put(destination, distance);
    }

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Node, Integer> getAdjacentNodesDistance() {
        return adjacentNodesDistance;
    }

    public void setAdjacentNodesDistance(Map<Node, Integer> adjacentNodesDistance) {
        this.adjacentNodesDistance = adjacentNodesDistance;
    }
}