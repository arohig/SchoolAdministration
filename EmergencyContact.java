public class EmergencyContact extends Person {
    private String relationship;

    public EmergencyContact(String firstName, String middleName, String lastName, int homePhoneNumber, String relationship) {
        super(firstName, middleName, lastName, homePhoneNumber, "", "", "");
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String newRelationship) {
        relationship = newRelationship;
    }

    @Override
    public String toString() {
        return ("Emergency Contact\nName: " + getName() + "\nHome Phone Number: " + getHomePhoneNumber() + "\nRelationship: " + getRelationship());
    }
}
