package cs2263hw04;

import com.google.common.graph.*;

public class NetworkGraphGenerator {

    MutableNetwork graph;

    public NetworkGraphGenerator(){

    }

    //Creates a network graph of relationships and stores in graph
    public Network generateGraph(){
        graph = NetworkBuilder.undirected().build();

        Person Dale = new Person("Dale",30);
        Person Kate = new Person("Kate",30);
        Person Jenna = new Person("Jenna",26);
        Person Bob = new Person("Bob",22);
        Person Joe = new Person("Joe",45);




        graph.addEdge(Dale, Kate, new Relationship(RelationshipEnum.SPOUSE));
        graph.addEdge(Dale, Bob, new Relationship(RelationshipEnum.FRIEND));
        graph.addEdge(Jenna, Kate, new Relationship(RelationshipEnum.FRIEND));
        graph.addEdge(Jenna, Joe, new Relationship(RelationshipEnum.COLLEAGUE));
        graph.addEdge(Bob, Joe, new Relationship(RelationshipEnum.PEER));
        graph.addEdge(Kate, Joe, new Relationship(RelationshipEnum.PEER));
        graph.addEdge(Bob, Jenna, new Relationship(RelationshipEnum.PEER));

        return graph;
    }
}
