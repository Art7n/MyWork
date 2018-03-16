package ex8.animal;

public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal theCat = new Cat("рыба", "Квартира", "Кошка");
        Animal theDog = new Dog("мясо", "Будка", "Собака");
        Animal theHorse = new Horse("трава", "Конюшя", "Лошадь");
        Animal zoo[] = {theCat, theDog, theHorse};
        for (Animal animal : zoo) {
            vet.treatAnimal(animal);
        }
    }
}
