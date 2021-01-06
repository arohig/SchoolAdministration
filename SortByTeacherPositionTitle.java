import java.util.Comparator;

public class SortByTeacherPositionTitle implements Comparator<Teacher>
{
    public int compare(Teacher a, Teacher b)
    {
        return ((a.getPositionTitle()).compareTo(b.getPositionTitle()));
    }
}
