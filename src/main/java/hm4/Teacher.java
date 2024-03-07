package hm4;

public class Teacher implements Comparable<Teacher> {
    private String firstName;
    private String lastName;
    private int experienceYears;

    public Teacher(String firstName, String lastName, int experienceYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceYears = experienceYears;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }

    @Override
    public int compareTo(Teacher other) {
        if (experienceYears > other.getExperienceYears()) {
            return 1;
        } else if (experienceYears < other.getExperienceYears()) {
            return -1;
        } else {
            return 0;
        }
    }
}
