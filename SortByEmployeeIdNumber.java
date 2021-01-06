import java.util.Comparator;

public class SortByEmployeeIdNumber implements Comparator<Staff>
{
    public int compare(Staff a, Staff b)
    {
        return ((a.getEmployeeIdNumber()) - (b.getEmployeeIdNumber()));
    }

}
