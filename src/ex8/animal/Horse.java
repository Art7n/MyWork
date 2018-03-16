package ex8.animal;

public class Horse extends Animal {
    private String name;

    public Horse(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Лошадь бьёт копытом и ржёт.");
    }

    public void eat() {
        System.out.println("Лошадь ест траву.");
    }

    public String getName() {
        return name;
    }

    public void setName(String speed) {
        this.name = name;
    }
}
