package oop.phone;


public class Main {
    public static void main(String[] args) {
        Phone.receiveCall("Andrey");
        Phone.receiveCall("Andrey", "88888888888");
        Phone ph = new Phone("88888888888", "poco", 270);
        Phone.sendMessage(new String[]{"12345678901", "23456789012", "34567890123"});
        ph.toString();
    }
}