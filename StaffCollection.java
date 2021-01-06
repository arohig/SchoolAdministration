import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaffCollection {
    private List<Staff> staffList;

    public StaffCollection(List<Staff> staffList)
    {
        this.staffList = staffList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void addStaff(Staff newStaff)
    {
        staffList.add(newStaff);
    }

    public void removeStaff(Staff newStaff)
    {
        staffList.remove(newStaff);
    }

    public void sortPersonName()
    {
        Collections.sort(getStaffList(), new SortByPersonName());
    }

    public void sortEmployeeIdNumber()
    {
        Collections.sort(getStaffList(), new SortByEmployeeIdNumber());
    }

    public void sortTeacherPositionTitle()
    {
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < getStaffList().size(); i++)
        {
            if (getStaffList().get(i) instanceof Teacher)
            {
                teacherList.add((Teacher) getStaffList().get(i));
            }
        }
        Collections.sort(teacherList, new SortByTeacherPositionTitle());
    }

    public void sortSupportStaffPositionTitle()
    {
        List<SupportStaff> supportStaffList = new ArrayList<>();
        for (int i = 0; i < getStaffList().size(); i++)
        {
            if (getStaffList().get(i) instanceof SupportStaff)
            {
                supportStaffList.add((SupportStaff) getStaffList().get(i));
            }
        }
        Collections.sort(supportStaffList, new SortBySupportStaffPositionTitle());
    }

    public Staff searchStaff(String firstName, String lastName)
    {
        sortPersonName();
        int index = Collections.binarySearch(getStaffList(), new Staff(firstName, null, lastName, 0, null, null, null, 0, null), new SortByPersonName());
        if (index < 0) return null;
        else
        {
            return (getStaffList().get(index));
        }
    }

    public Staff searchStaff(int employeeIdNumber)
    {
        sortEmployeeIdNumber();
        int index = Collections.binarySearch(getStaffList(), new Staff(null, null, null, 0, null, null, null, employeeIdNumber, null), new SortByEmployeeIdNumber());
        if (index < 0) return null;
        else
        {
            return (getStaffList().get(index));
        }
    }

    public Teacher searchTeacher(String positionTitle)
    {
        sortTeacherPositionTitle();
        int index = Collections.binarySearch(getStaffList(), new Teacher(null, null, null, 0, null, null, null, 0, null, positionTitle, null), new SortByPersonName());
        if (index < 0) return null;
        else
        {
            return ((Teacher) (getStaffList().get(index)));
        }
    }

    public SupportStaff searchSupportStaff(String positionTitle)
    {
        sortSupportStaffPositionTitle();
        int index = Collections.binarySearch(getStaffList(), new SupportStaff(null, null, null, 0, null, null, null, 0, null, positionTitle), new SortByPersonName());
        if (index < 0) return null;
        else
        {
            return ((SupportStaff) (getStaffList().get(index)));
        }
    }

    public void printCollection()
    {
        for (int i = 0; i < getStaffList().size(); i++)
        {
            System.out.println(getStaffList().get(i) + "\n");
        }
    }
}
