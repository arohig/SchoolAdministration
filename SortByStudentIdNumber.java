import java.util.Comparator;

public class SortByStudentIdNumber implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return ((a.getStudentIdNumber()) - (b.getStudentIdNumber()));
    }
}
