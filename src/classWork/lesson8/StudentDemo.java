package classWork.lesson8;

/**
 * Created by Student on 23.02.2018.
 */
public class StudentDemo {
    public static void main(String args[]) {
        Student s1 = new Aspirant("g23", "Linor", "Grim", "EA3291");
        //Aspirant s2 = new Student("", "", "");
        Student s3 = new Student("", "", "");
        Aspirant s4 = new Aspirant("", "", "", "");
       // System.out.println(s1.getFirstName() + s1.getGroup() + s1.getLastName() + s1.getScienceWork());
        //System.out.println(s2.getFirstName() + s2.getGroup() + s2.getLastName() + s2.getScienceWork());
       // System.out.println(s3.getFirstName() + s3.getGroup() + s3.getLastName() + s3.getScienceWork());
        System.out.println(s4.getFirstName() + s4.getGroup() + s4.getLastName() + s4.getScienceWork());
    }
}
