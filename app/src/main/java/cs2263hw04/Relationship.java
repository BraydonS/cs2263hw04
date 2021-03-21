package cs2263hw04;

public class Relationship{


    private RelationshipEnum relationshipType;

    public Relationship(RelationshipEnum t){
        this.relationshipType = t;
    }

    public String getRelationship() {
        return relationshipType.toString();
    }
}
