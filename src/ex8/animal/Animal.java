package ex8.animal;

public class Animal {
    private String food;
    private String location;
    private String name;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(Animal animal) {
        System.out.println(animal + " создаёт шум.");
    }

    public void eat(Animal animal) {
        System.out.println(animal + " ест.");
    }

    public void sleep(Animal animal) {
        System.out.println(animal + " спит.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
