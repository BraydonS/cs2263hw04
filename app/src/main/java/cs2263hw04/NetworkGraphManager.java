package cs2263hw04;

import com.google.common.graph.Graph;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.Network;


// This class takes in a social network graph and provides access to its data.
public class NetworkGraphManager implements GraphElement{



    private Network<Person, RelationshipEnum> graph;

    public NetworkGraphManager(Network g){
        this.graph = g;
    }


    @Override
    public void accept(Visitor g) {
        g.visitGraph(this);
    }

    public Network getNetworkGraph(){
        return graph;
    }
}
