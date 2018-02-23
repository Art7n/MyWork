package ex6.person;

public class Person {
    private String fullName;
    private int age;
    Person(){
        this.fullName = "Teimun Loers";
        this.age = 23;
    }
    Person (String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void move(){
        System.out.println(fullName + " ходит на работу.");
    }
    public void talk(){
        System.out.println(fullName + " говорит по-английски.");
    }
}
