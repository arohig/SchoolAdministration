import java.util.List;

public class Staff extends Person {
    // Employee ID Number has five digits
    private int employeeIdNumber;
    private List<String> emergencyContacts;

    public Staff(String firstName, String middleName, String lastName, int homePhoneNumber, String dateOfBirth,
                 String gender, String homeMailingAddress, int employeeIdNumber, List<String> emergencyContacts) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress);
        this.employeeIdNumber = employeeIdNumber;
        this.emergencyContacts = emergencyContacts;
    }

    public int getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(int newEmployeeIdNumber) {
        employeeIdNumber = newEmployeeIdNumber;
    }

    public List<String> getEmergencyContacts() {
        return emergencyContacts;
    }

    public void setEmergencyContacts(List<String> newEmergencyContacts) {
        emergencyContacts = newEmergencyContacts;
    }

    @Override
    public String toString() {
        return ("Staff\n" + super.toString() + "\nEmployee ID Number: " + getEmployeeIdNumber() + "\nNames of " +
                "Emergency Contacts: " + getEmergencyContacts());
    }
}
