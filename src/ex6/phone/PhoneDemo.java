package ex6.phone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("0992130808", "k300", "0.2");
        Phone phone2 = new Phone("0932134123", "j100", "0.1");
        Phone phone3 = new Phone("0953245208", "m200", "0.4");
        System.out.println(phone1.getNumber());
        //phone1.receiverCall("Артём" , phone1.getNumber());
        phone1.sendMessage("0992130808", "0951043946" , "0505489451");
    }
}
