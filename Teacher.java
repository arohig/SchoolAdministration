import java.util.List;

public class Teacher extends Staff {

    private String positionTitle;
    private List<String> coursesTaught;

    public Teacher(String firstName, String middleName, String lastName, int homePhoneNumber, String dateOfBirth,
                   String gender, String homeMailingAddress, int employeeIdNumber,
                   List<String> emergencyContacts, String positionTitle, List<String> coursesTaught) {
        super(firstName, middleName, lastName, homePhoneNumber, dateOfBirth, gender, homeMailingAddress,
                employeeIdNumber, emergencyContacts);
        this.positionTitle = positionTitle;
        this.coursesTaught = coursesTaught;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String newPositionTitle) {
        positionTitle = newPositionTitle;
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<String> newCoursesTaught) {
        coursesTaught = newCoursesTaught;
    }

    @Override
    public String toString() {
        return ("Teacher, " + super.toString() + "\nPosition Title: " + getPositionTitle() + "\nName(s) of Course(s) " +
                "Taught: " + getCoursesTaught());
    }
}
