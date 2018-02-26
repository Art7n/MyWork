package classWork.lesson8;

/**
 * Created by Student on 23.02.2018.
 */
public class Aspirant extends Student {


    private String scienceWork;

    public Aspirant(String group, String lastName, String firstName, String scienceWork,double avg) {
        super(group, lastName, firstName,avg);
        this.scienceWork = scienceWork;
    }

    public int getScholarship() {
        if (getAvg() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }
}
