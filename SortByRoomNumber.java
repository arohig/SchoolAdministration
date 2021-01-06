import java.util.Comparator;

public class SortByRoomNumber implements Comparator<Course>
{
    public int compare(Course a, Course b)
    {
        return ((a.getRoomNumber()) - (b.getRoomNumber()));
    }
}