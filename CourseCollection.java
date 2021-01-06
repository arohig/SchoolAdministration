import java.util.List;
import java.util.Collections;

public class CourseCollection {
    private List<Course> courseList;

    public CourseCollection(List<Course> courseList)
    {
        this.courseList = courseList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void addCourse(Course newCourse)
    {
        courseList.add(newCourse);
    }

    public void removeCourse(Course newCourse)
    {
        courseList.remove(newCourse);
    }

    //merge sort
    public void sortCourseName()
    {
        getCourseList().sort(new SortByCourseName());
    }

    //merge sort
    public void sortRoomNumber()
    {
        getCourseList().sort(new SortByRoomNumber());
    }

    //binary search
    public Course searchCourse(String courseName)
    {
        sortCourseName();
        int index = Collections.binarySearch(getCourseList(), new Course(courseName, null, 0, null), new SortByCourseName());
        if (index < 0)  return null;
        else
        {
            return (getCourseList().get(index));
        }
    }

    //binary search
    public Course searchCourse(int roomNumber)
    {
        sortRoomNumber();
        int index = Collections.binarySearch(getCourseList(), new Course(null, null, roomNumber, null), new SortByRoomNumber());
        if (index < 0)  return null;
        else
        {
            return (getCourseList().get(index));
        }
    }

    public void printCollection()
    {
        for (int i = 0; i < getCourseList().size(); i++)
        {
            System.out.println(getCourseList().get(i) + "\n");
        }
    }
}
