public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int homePhoneNumber;
    private String dateOfBirth;
    private String gender;
    private String homeMailingAddress;

    public Person(String firstName, String middleName, String lastName, int homePhoneNumber, String dateOfBirth,
                  String gender, String homeMailingAddress) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.homePhoneNumber = homePhoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.homeMailingAddress = homeMailingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    // returns first and last name
    // ex: Tristan James Holmes returns Tristan Holmes
    // for searching method (searchStudent) which only uses first and last name
    // likely for two students to have same first or last names
    public String getAbbreviatedName()
    {
        return (getFirstName() + " " + getLastName());
    }

    public String getName() {
        if (getMiddleName().isEmpty())   return (getFirstName() + " " + getLastName());
        else
        {
            return (getFirstName() + " " + getMiddleName() + " " + getLastName());
        }
    }

    public int getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(int newHomePhoneNumber) {
        homePhoneNumber = newHomePhoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String newDateOfBirth) {
        dateOfBirth = newDateOfBirth;
    }

    // date of birth and current date are in the format mm/dd/yyyy
    public int age(String dateOfBirth, String currentDate) {
        int year = (Integer.parseInt(currentDate.substring(6)) - Integer.parseInt(dateOfBirth.substring(6)));
        int currentMonth = Integer.parseInt(currentDate.substring(0, 2));
        int birthMonth = Integer.parseInt(dateOfBirth.substring(0, 2));
        int currentDay = Integer.parseInt(currentDate.substring(3, 5));
        int birthDay = Integer.parseInt(dateOfBirth.substring(3, 5));

        if (birthMonth < currentMonth) year--;
        if ((birthMonth == currentMonth) && (currentDay < birthDay)) year--;

        return year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String newGender) {
        gender = newGender;
    }

    public String getHomeMailingAddress() {
        return homeMailingAddress;
    }

    public void setHomeMailingAddress(String newHomeMailingAddress) {
        homeMailingAddress = newHomeMailingAddress;
    }

    public String toString() {
        return ("Name: " + getName() + "\nHome Phone Number: " + getHomePhoneNumber() + "\nDate of Birth: " + getDateOfBirth() + "\nAge: "+age(getDateOfBirth(), "01/06/2020")+"\nGender: " + getGender() + "\nHome Mailing Address: " + getHomeMailingAddress());
    }
}
