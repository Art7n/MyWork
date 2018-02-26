package classWork.lesson8;

/**
 * Created by Student on 23.02.2018.
 */
public class StudentDemo {
    public static void main(String args[]) {
        Student s1 = new Aspirant("g23", "Linor", "Grim", "EA3291", 5);
        Student s2 = new Student("g22", "Munre", "Joe", 2);
        Aspirant s3 = new Aspirant("g54", "Keroa", "Mnris", "EA3232", 4);
        // System.out.println(s4.getFirstName() + s4.getGroup() + s4.getLastName() + s4.getScienceWork());
       /* System.out.println(s1.getScholarship());
        System.out.println(s2.getScholarship());
        System.out.println(s3.getScholarship());*/
        Student students[] = new Student[3];
        students[0] = new Aspirant("g22", "Minor", "Grim", "EA1231", 5);
        students[1] = new Student("g23", "Kirno", "Lonf", 5);
        students[2] = new Student("g44", "Jung", "Lor", 3);
        for (Student st : students) {
            System.out.println(st.getLastName() + " " + st.getScholarship());
        }
    }
}
