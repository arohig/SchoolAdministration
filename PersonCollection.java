import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PersonCollection {
    private List<Person> personList;

    public PersonCollection(List<Person> personList)
    {
        this.personList = personList;
    }

    public List<Person> getPersonList()
    {
        return personList;
    }

    public void addPerson(Person newPerson)
    {
        personList.add(newPerson);
    }

    public void removePerson(Person newPerson)
    {
        personList.remove(newPerson);
    }

    // merge sort
    public void sortPersonName()
    {
        getPersonList().sort(new SortByPersonName());
    }

    // merge sort
    public void sortStudentIdNumber()
    {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < getPersonList().size(); i++)
        {
            if (getPersonList().get(i) instanceof Student)
            {
                studentList.add((Student) getPersonList().get(i));
            }
        }
        studentList.sort(new SortByStudentIdNumber());
    }

    public Person searchPerson(String firstName, String lastName)
    {
        sortPersonName();
        int index = Collections.binarySearch(getPersonList(), new Person(firstName, null, lastName, 0, null, null, null), new SortByPersonName());
        if (index < 0) return null;
        else
        {
            return (getPersonList().get(index));
        }
    }

    public Student searchStudent(int studentIdNumber)
    {
        sortStudentIdNumber();
        int index = Collections.binarySearch(getPersonList(), new Student(null, null, null, 0, null, null, null, studentIdNumber, 0, null, 0, null, null, null), new SortByPersonName());
        if (index < 0) return null;
        else
        {
            return ((Student) (getPersonList().get(index)));
        }
    }

    public void printCollection()
    {
        for (int i = 0; i < getPersonList().size(); i++)
        {
            System.out.println(getPersonList().get(i) + "\n");
        }
    }
}
