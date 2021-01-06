import java.util.List;

public class Student extends Person {
    // studentIdNumber has seven digits
    private int studentIdNumber;
    private int lockerNumber;
    private String lockerCombination;
    private int gradeLevel;
    private List<String> coursesEnrolled;
    private List<String> parents;
    private List<String> emergencyContacts;

    public Student(String firstName, String middleName, String lastName, int homePhoneNumber, String dateOfBirth,
                   String gender, String homeMailingAddress, int studentIdNumber, int lockerNumber,
                   String lockerCombination, int gradeLevel, List<String> coursesEnrolled,
                   List<String> parents, List<String> emergencyContacts) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress);
        this.studentIdNumber = studentIdNumber;
        this.lockerNumber = lockerNumber;
        this.lockerCombination = lockerCombination;
        this.gradeLevel = gradeLevel;
        this.coursesEnrolled = coursesEnrolled;
        this.parents = parents;
        this.emergencyContacts = emergencyContacts;
    }

    public int getStudentIdNumber() {
        return studentIdNumber;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public void setLockerNumber(int newLockerNumber) {
        lockerNumber = newLockerNumber;
    }

    public String getLockerCombination() {
        return lockerCombination;
    }

    public void setLockerCombination(String newLockerCombination) {
        lockerCombination = newLockerCombination;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int newGradeLevel) {
        gradeLevel = newGradeLevel;
    }

    public List<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(List<String> newCoursesEnrolled) {
        coursesEnrolled = newCoursesEnrolled;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> newParents) {
        parents = newParents;
    }

    public List<String> getEmergencyContacts() {
        return emergencyContacts;
    }

    public void setEmergencyContacts(List<String> newEmergencyContacts) {
        emergencyContacts = newEmergencyContacts;
    }

    @Override
    public String toString() {
        return ("Student\n" + super.toString() + "\nID Number: " + getStudentIdNumber() + "\nGrade: " + getGradeLevel() + "\nLocker Number: " + getLockerNumber() + "\nLocker Combination: " + getLockerCombination() + "\nCourses Enrolled in: " + getCoursesEnrolled() + "\nName(s) of Parent(s): " + getParents() + "\nNames of Emergency Contacts: " + getEmergencyContacts());
    }
}
