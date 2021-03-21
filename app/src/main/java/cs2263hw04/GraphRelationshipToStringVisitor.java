package cs2263hw04;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Network;

import java.util.Iterator;
import java.util.Set;

public class GraphRelationshipToStringVisitor implements Visitor{

    // Visits a network graph and prints its relationships in a friendly view
    @Override
    public String visitGraph(NetworkGraphManager n) {
        String s = "Relationships\n-------------\n";
        Network g = n.getNetworkGraph();
        Iterator edgesIterator = g.edges().iterator();

        while(edgesIterator.hasNext()){
           Relationship relationship = (Relationship) edgesIterator.next();
           EndpointPair actors = g.incidentNodes(relationship);
           Person ActorA = (Person) actors.nodeU();
            Person ActorB = (Person) actors.nodeV();
           s = s + ActorA.getName() + " -- " + relationship.getRelationship() + " -- " + ActorB.getName()+"\n";
        }

        return s;
    }
}
