package ex7.person;

public class PersonDemo {
    public static void main(String args[]){
        Person obj1 = new Person();
        Person obj2 = new Person("Diana Loers", 20);
        obj1.talk();
        obj2.move();
    }
}
