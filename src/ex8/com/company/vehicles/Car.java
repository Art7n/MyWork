package ex8.com.company.vehicles;

import ex8.com.company.details.Engine;
import ex8.com.company.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private String weight;
    Driver driver = new Driver();
    Engine engine = new Engine();

    public Car() {
    carModel = "Opel";
    carClass = "Light Car";
    weight = "2t.";
    driver.setFIO("Борсук Андрей Владимирович");
    driver.setDriveExp("Без стажа");
    engine.setManufacturer("OkayTeam");
    engine.setPower("4 ls");
    }

    public void start() {
        System.out.println("Go");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void turnRight() {
        System.out.println("Right");
    }

    public void turnLeft() {
        System.out.println("Left");
    }

    public void printInfo() {
        System.out.println("Модель:" + this.carModel);
        System.out.println("Класс автомобиля:" + this.carClass);
        System.out.println("Вес:" + this.weight);
        System.out.println("Водитель:\nФИО: "+driver.getFIO()+"\nСтаж: "+driver.getDriveExp());
        System.out.println("Двигатель:\n Мощность: "+engine.getPower()+"\nПроизводитель: "+engine.getManufacturer());
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
}
