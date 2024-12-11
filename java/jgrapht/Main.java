import org.jgrapht.graph.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===============================================================");
        /*
        // SimpleGraph<String, DefaultEdge> sim_undi_graph = new SimpleGraph<>(DefaultEdge.class);
        // SimpleDirectedGraph<String, DefaultEdge> sim_di_graph = new SimpleDirectedGraph<>(DefaultEdge.class);
        // SimpleWeightedGraph<String, DefaultWeightedEdge> sim_undi_graph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
        // SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> sim_di_wei_graph = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);

        SimpleGraph<String, DefaultEdge> myGraph_1 = new SimpleGraph<>(DefaultEdge.class);
        // Undirected Unweighted Graph
        SimpleWeightedGraph<String, DefaultWeightedEdge> myGraph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
        // Undirected Weighted Graph

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        // myGraph.addVertex(V v); // returns as Boolean variable

        myGraph.addEdge("A", "B");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("A", "C");
        // myGraph.eddEdge(V source, V target); // returns as Edge variable

        myGraph.setEdgeWeight("A", "B", 2.3);    
        myGraph.setEdgeWeight("B", "C", 5.3);
        myGraph.setEdgeWeight("A", "C", 1.9);
        // myGraph.setEdgeWeight(V source, V target, double weight); // returns nothing (void)
        // alternative = myGraph.setEdgeWeight(E edge, double weight); // returns nothing (void)

        System.out.println("Graph: " + myGraph);
        // Returns as Set<Vertex> and Set<Edge>
        System.out.println("Vertex: " + myGraph.vertexSet());
        // Returns as Set<Vertex>
        System.out.println("Edge: " + myGraph.edgeSet());
        // Returns as Set<Edge>
        */


        /*
        for (String name : myGraph.vertexSet()) { }

        for (DefaultWeightedEdge edge : myGraph.edgeSet()) { }*/

        // DijkstraShortestPath<String, DefaultWeightedEdge> dijkSort = new DijkstraShortestPath<>(myGraph);
        // GraphPath<String, DefaultEdge> graphPath = dijkSort.getPath("A","C");
        // Probably not in exam

        /* for (DefaultWeightedEdge edge : kk.edgeSet()) {
            System.out.println(edge + ": " + kk.getEdgeWeight(edge));
        }

        for (String word : kk.vertexSet()) {
            System.out.println(word);
        } */

        TreeMap<Integer, String> tMap = new TreeMap<>();
        HashMap<Integer, String> hMap = new HashMap<>();
        //        Key  ,  Value

        TreeSet<String> tSet = new TreeSet<>();
        HashSet<String> hSet = new HashSet<>();
        //      Value

        HashSet<String> tmpSet = new HashSet<>();
        tmpSet.add("A");
        tmpSet.add("B");
        tmpSet.add("C");

        HashSet<String> tmpSet2 = new HashSet<>();
        tmpSet2.add("A");
        tmpSet2.add("C");

        HashSet<String> tmpSet3 = new HashSet<>();
        tmpSet3.add("Hello");
        tmpSet3.add("World");
        tmpSet3.add("A");

        hSet.add("Hello");
        hSet.add("World");
        hSet.add("World");
        hSet.add("Ball");
        // Added successfully = true
        // failed to add = false
        System.out.println(hSet);   // print here
        hSet.addAll(tmpSet);
        // tmpSet contains [A, B, C]
        // hSet.addAll(Set)
        System.out.println(hSet);   // print here
        hSet.remove("Ball");
        // .remove(data) returns void
        System.out.println(hSet);   // print here
        hSet.removeAll(tmpSet2);
        // tmpSet2 contains [A, C]
        System.out.println(hSet);   // print here
        hSet.retainAll(tmpSet3);
        // tmpSet3 contains [Hello, World, A]
        System.out.println(hSet);   // print here

        System.out.println("Size: " + hSet.size());
        System.out.println("Is Empty? " + hSet.isEmpty());
        System.out.println("contain Hello? " + hSet.contains("Hello"));
        
        



        /*for (HashMap.Entry<Integer, String> entry : hMap.entrySet()) {
            System.out.printf("%2d: ", entry.getKey());
            System.out.printf("%s\n", entry.getValue());
        }

        for (int key : tMap.keySet()) {
            System.out.println(tMap.get(key));
        } */
    }
}