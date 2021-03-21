package cs2263hw04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RelationshipSummarizerVisitor implements Visitor {
    @Override
    public String visitGraph(NetworkGraphManager n) {
        Set edges = n.getNetworkGraph().edges();
        Iterator edgesIterator = edges.iterator();
        Map<String, Integer> relationshipMap = new HashMap();

        while(edgesIterator.hasNext()){
          Relationship Edge = (Relationship) edgesIterator.next();
          String RelationshipString = Edge.getRelationship();
          if(relationshipMap.containsKey(RelationshipString)){
              Integer count = relationshipMap.get(RelationshipString);
              relationshipMap.put(RelationshipString, count + 1);
          }
          else{
              relationshipMap.put(RelationshipString, 1);
          }
        }

        Iterator mapIterator = relationshipMap.entrySet().iterator();
        String returnString = "Relationship   Count\n--------------------\n";

        while(mapIterator.hasNext()){
            Map.Entry kvp = (Map.Entry)mapIterator.next();
            returnString = returnString + kvp.getKey() + "     " + kvp.getValue() + "\n";
        }
        return returnString;
    }
}
