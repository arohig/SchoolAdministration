import java.util.Comparator;

public class SortByPersonName implements Comparator<Person>
{
    public int compare(Person a, Person b)
    {
        return ((a.getAbbreviatedName()).compareTo(b.getAbbreviatedName()));
        //( ((a.getFirstName()).compareTo(b.getFirstName())) && ((a.getLastName()).compareTo(b.getLastName())) );
    }
}
