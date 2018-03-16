package ex8.animal;

public class Cat extends Animal {
    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Кот разбил вазу!");
    }

    public void eat() {
        System.out.println("Кот ест сосиску.");
    }

    public String getName() {
        return name;
    }

    public void setName(String claws) {
        this.name = name;
    }
}
