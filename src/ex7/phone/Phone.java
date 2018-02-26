package ex7.phone;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this("0123", "k300");
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    //--------------------------
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    //--------------------------
    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }
    public void receiverCall(String name,String number){
        System.out.println("Звонит: "+ name + ", по номеру: "+ number );
    }
    public void sendMessage(String... numbers){
        System.out.println("Количество аргументов: " + numbers.length);
        System.out.println("Вы пошлёте сообщение по номерам:");
        for(String str : numbers){
            System.out.println(str + " ");
        }
        System.out.println();
    }
}
