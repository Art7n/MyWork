package ex8.animal;

public class Dog extends Animal {
    private String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Собака лает на прохожего!");
    }

    public void eat() {
        System.out.println("Собака ест кашу.");
    }

    public String getName() {
        return name;
    }

    public void setName(String waf) {
        this.name = name;
    }
}
