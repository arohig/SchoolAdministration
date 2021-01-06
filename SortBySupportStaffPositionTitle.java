import java.util.Comparator;

public class SortBySupportStaffPositionTitle implements Comparator<SupportStaff> {
    public int compare(SupportStaff a, SupportStaff b)
    {
        return ((a.getPositionTitle()).compareTo(b.getPositionTitle()));
    }
}
