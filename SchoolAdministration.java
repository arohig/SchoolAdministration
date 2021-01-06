import java.util.ArrayList;
import java.util.List;

public class SchoolAdministration {

    public static void main(String[] args) {

        List<Person> listOfPersons = new ArrayList<>();
        PersonCollection schoolPersonList = new PersonCollection(listOfPersons);
        List<Staff> listOfStaffs = new ArrayList<>();
        StaffCollection schoolStaffList = new StaffCollection(listOfStaffs);
        List<Course> listOfCourses = new ArrayList<>();
        CourseCollection schoolCourseList = new CourseCollection(listOfCourses);

        //create 60 Student objects
        Student student1 = new Student("Tristan", "James", "Holmes", 587467519, "03/26/2004", "Male", "23 Bush Avenue, Edmonton AB T7U9R6", 1002085, 534, "APE3", 11, List.of("Biology 20", "Computing Science 20", "Horticulture 20", "Physics 20", "Math 20"), List.of("James John Holmes", "Jill Stew Holmes"), List.of("William Hendrick", "Shelly Holt"));
        schoolPersonList.addPerson(student1);
        Student student2 = new Student("Dylan", "", "Morrell", 587602624, "11/13/2005", "Male", "78 Neon Street, Sherwood Park AB T9G2O1", 1125762, 26, "GPY9", 10, List.of("Math 10", "English Language Arts 10 (AP)", "General Psychology 10", "Science 10", "Photography 10"), List.of("Locke Morrell"), List.of("Maria Brown", "Tess Love"));
        schoolPersonList.addPerson(student2);
        Student student3 = new Student("Tristan", "Joe", "Williamson", 587071937, "06/12/2003", "Male", "89 Button Drive, Fort Saskatchewan AB T2P6Q8", 5701518, 160, "HPQ5", 12, List.of("Math 30 (AP)", "Math 31 (AP)", "English Language Arts 30", "Science 30", "Robotics 30"), List.of("Joy Moraine Williamson, Matie Gold"), List.of("Cindy Tim", "Cheng Xiao"));
        schoolPersonList.addPerson(student3);
        Student student4 = new Student("Irene", "", "Song", 825072853, "05/07/2003", "Female", "314 Clinton Street, Sherwood Park AB T9G8Y3", 2804342, 19, "KPW3", 12, List.of("Math 30 (AP)", "Math 31 (AP)", "English Language Arts 30", "Biology 30 (AP)", "Chemistry 30 (AP)"), List.of("Jimin Song, Yerim Song"), List.of("Kim Minhyuk", "Violet Fleur"));
        schoolPersonList.addPerson(student4);

        // create Parent objects
        Parent parent1 = new Parent("James", "John", "Holmes", 587467519, "07/18/1980", "Male", "23 Bush Avenue, Edmonton AB T7U9R6");
        schoolPersonList.addPerson(parent1);
        Parent parent2 = new Parent("Jill", "Stew", "Holmes", 587467519, "06/06/1986", "Female", "23 Bush Avenue, Edmonton AB T7U9R6");
        schoolPersonList.addPerson(parent2);
        Parent parent3 = new Parent("Locke", "", "Morrell", 587602624, "01/29/1969", "Male", "78 Neon Street, Sherwood Park AB T9G2O1");
        schoolPersonList.addPerson(parent3);
        Parent parent4 = new Parent("Joy", "Moraine", "Williamson", 587071937, "05/15/1973", "Female", "89 Button Drive, Fort Saskatchewan AB T2P6Q8");
        schoolPersonList.addPerson(parent4);

        // create Emergency Contact objects
        EmergencyContact emergencyContact1 = new EmergencyContact("William", "", "Hendrick", 780905294, "Uncle");
        schoolPersonList.addPerson(emergencyContact1);
        EmergencyContact emergencyContact2 = new EmergencyContact("Shelly", "", "Holt", 403569206, "Family Friend");
        schoolPersonList.addPerson(emergencyContact2);

        //create Teacher objects
        Teacher teacher1 = new Teacher("Tyler", "Ester", "Norwood", 780802683, "04/29/1976", "Male", "6th Avenue, Sherwood Park AB T2C3M6", 22501, List.of("Mike Low", "Tibby Post"), "Horticulture & Math", List.of("Math 30-1", "Math 30-2", "Horticulture 20", "Horticulture 30"));
        schoolStaffList.addStaff(teacher1);
        Teacher teacher2 = new Teacher("Peter", "", "Willard", 587692673, "11/01/1989", "Male", "92 Broad Street, Fort Saskatchewan AB T8N4X6", 16036, List.of("Drake Stone", "Martha Gill"), "Math & Science", List.of("Math 10-1", "Math 20-1", "Biology 20", "Science 10"));
        schoolStaffList.addStaff(teacher2);
        Teacher teacher3 = new Teacher("Michael", "Lynch", "Tale", 780016302, "02/17/1992", "Male", "BlackRose Apartments, Edmonton AB T9H2D4", 30265, List.of("Brant Spike", "Shane Damsy"), "Social Studies", List.of("Social Studies 20-1", "Social Studies 30-1", "AP Seminar"));
        schoolStaffList.addStaff(teacher3);

        //create TeachingAssistant objects
        TeachingAssistant teachingAssistant1 = new TeachingAssistant("Peter", "", "Willard", 587692673, "11/01/1989", "Male", "92 Broad Street, Fort Saskatchewan AB T8N4X6", 16036, List.of("Drake Stone", "Martha Gill"), List.of("Social Studies 20-1", "AP European History"));
        schoolStaffList.addStaff(teachingAssistant1);

        //create JanitorialStaff objects
        JanitorialStaff janitorialStaff1 = new JanitorialStaff("Ryan", "Strauss", "Bordon", 801204891, "03/25/1987", "Male", "02 Mare Street, Edmonton AB T5IXW5", 30004, List.of("Lester Pearson", "Andrea Frazer"));
        schoolStaffList.addStaff(janitorialStaff1);

        //create SupportStaff objects
        SupportStaff supportStaff1 = new SupportStaff("Dorothy", "Rose", "Bell", 587920583, "12/03/1982", "Female", "43 Band Drive, Edmonton AB T0P1B2", 30156, List.of("Tiger McCarthy", "Hope Orr"), "Science Lead Teacher");
        schoolStaffList.addStaff(supportStaff1);

        //create 1 Principal object
        Principal principal1 = new Principal("Lucy", "Horne", "Malte", 587016391, "12/21/1968", "Female", "CrossRoads Villa, Sherwood Park AB T6W8Q1", 10452, List.of("Sam Hills", "Xuo Ling"));
        schoolStaffList.addStaff(principal1);

        //create 1 VicePrincipal object
        VicePrincipal vicePrincipal1 = new VicePrincipal("Preeti", "Jake", "Agarwal", 801016429, "02/19/1981", "Female", "Pilrose Mansion, Edmonton AB T0B0P1", 10026, List.of("Rhoe Tan", "Aarti Bhatt"));
        schoolStaffList.addStaff(vicePrincipal1);

        //create 25 courses
        Course course1 = new Course("AP European History", "Peter Willard", 267, List.of("Richie Williams", "Stephen Matthews", "Erin Rivera", "Elaine Star"));
        schoolCourseList.addCourse(course1);

        //System.out.println(student2);
        //System.out.println(emergencyContact1);
        //System.out.println(parent1);
        //System.out.println(staff1);
        //System.out.println(vicePrincipal1);
        //System.out.println(course1);
        //System.out.println(supportStaff1);
        //System.out.println(student1.toString());
        //schoolPersonList.printCollection();
        //schoolStaffList.printCollection();
        //schoolCourseList.printCollection();
        //System.out.println(schoolStaffList.searchStaff("Tyler", "Norwood"));
        //System.out.println(schoolStaffList.searchStaff(30265));
        //System.out.println(schoolPersonList.searchPerson("Tristan", "Williamson"));
        //System.out.println(schoolPersonList.searchPerson("William", "Hendrick"));
    }
}
