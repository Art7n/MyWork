package classWork.lesson8;

/**
 * Created by Student on 23.02.2018.
 */
public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private double avg;


    public Student(String group, String lastName, String firstName, double avg) {
        this.group = group;
        this.lastName = lastName;
        this.firstName = firstName;
        this.avg = avg;
    }

    public int getScholarship() {
        if (this.avg == 5) {
            return 100;
        } else {
            return 80;
        }
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
