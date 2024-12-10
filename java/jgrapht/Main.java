import org.jgrapht.graph.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // SimpleGraph<String, DefaultEdge> sim_undi_graph = new SimpleGraph<>(DefaultEdge.class);
        // SimpleDirectedGraph<String, DefaultEdge> sim_di_graph = new SimpleDirectedGraph<>(DefaultEdge.class);
        // SimpleWeightedGraph<String, DefaultWeightedEdge> sim_undi_wei_graph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);


        SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> kk = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);

        kk.addVertex("Hello");
        kk.addVertex("World");
        kk.addVertex("Nigga");
        
        kk.addEdge("Hello", "Nigga");
        kk.addEdge("Nigga", "World");
        kk.addEdge("Hello", "World");

        kk.setEdgeWeight("Hello", "Nigga", 2.3);
        kk.setEdgeWeight("Nigga", "World", 5.3);
        kk.setEdgeWeight("Hello", "World", 1.9);

        System.out.println("Graph: " + kk);
        System.out.println("Vertex: " + kk.vertexSet());
        System.out.println("Edge: " + kk.edgeSet());

        for (DefaultWeightedEdge edge : kk.edgeSet()) {
            System.out.println(edge + ": " + kk.getEdgeWeight(edge));
        }

        for (String word : kk.vertexSet()) {
            System.out.println(word);
        }
    }
}