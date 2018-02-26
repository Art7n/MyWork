package ex7.reader;

public class Reader {
    private String firstName;
    private String lastName;
    private String fatherName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String mobileNum;

    Reader() {
        firstName = "Unknown";
        lastName = "Unknown";
        fatherName = "Unknown";
        ticketNumber = 0;
        faculty = "Unknown";
        birthDate = "Unknown";
        mobileNum = "Unknown";
    }

    public void takeBook(int bookNum) {
        System.out.println(lastName + " " + firstName + " " + fatherName + " взял " + bookNum + " книг(и)");
    }

    public void takeBook(String... bookName) {
        System.out.print(lastName + " " + firstName + " " + fatherName + " взял книги: ");
        for (String str : bookName) {
            System.out.print(str + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... b1) {
        System.out.print(lastName + " " + firstName + " " + fatherName + " взял книги: ");
        for (Book b2 : b1) {
            System.out.print(b2.getBookName() + ", " + b2.getAuthor() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int bookNum) {
        System.out.println(lastName + " " + firstName + " " + fatherName + " вернул " + bookNum + " книг(и)");
    }

    public void returnBook(String... bookName) {
        System.out.print(lastName + " " + firstName + " " + fatherName + " вернул книги: ");
        for (String str : bookName) {
            System.out.print(str + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... b1) {
        System.out.print(lastName + " " + firstName + " " + fatherName + " вернул книги: ");
        for (Book b2 : b1) {
            System.out.print(b2.getBookName() + ", " + b2.getAuthor() + ", ");
        }
        System.out.println();
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
}
