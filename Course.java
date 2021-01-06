import java.util.List;

public class Course {
    private String courseName;
    private String courseTeacher;
    private int roomNumber;
    private List<String> studentsEnrolled;
    private int studentNumber;

    public Course(String courseName, String courseTeacher, int roomNumber, List<String> studentsEnrolled) {
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.roomNumber = roomNumber;
        this.studentsEnrolled = studentsEnrolled;
        this.studentNumber = studentsEnrolled.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String newCourseName) {
        courseName = newCourseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String newCourseTeacher) {
        courseTeacher = newCourseTeacher;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int newRoomNumber) {
        roomNumber = newRoomNumber;
    }

    public List<String> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<String> newStudentList) {
        studentsEnrolled = newStudentList;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(List<String> newStudentList) {
        studentNumber = newStudentList.size();
    }

    public String toString()
    {
        return ("Course Name: "+getCourseName()+"\nCourse Teacher: "+getCourseTeacher()+"\nRoom Number: "+getRoomNumber()+"\nList of Students Enrolled: "+getStudentsEnrolled()+"\nNumber of Students Enrolled: "+getStudentNumber());
    }
}