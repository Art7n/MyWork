package classWork.lesson8;

/**
 * Created by Student on 23.02.2018.
 */
public class Aspirant extends Student {


    private String scienceWork;

    public Aspirant(String group, String lastName, String firstName, String scienceWork) {
        super(group, lastName, firstName);
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }
}
