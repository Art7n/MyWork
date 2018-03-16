package ex8.animal;

public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getName() + " ест " + animal.getFood() + " и обитает в " + animal.getLocation());
    }
}
