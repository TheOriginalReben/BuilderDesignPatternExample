package Java.BuilderDesignPatternExample;

public class Shop {

    public static void main(String[] args) {
        PhoneInitializer phones = new PhoneInitializer();
        phones.initializePhones();
        System.out.println(phones.xiaomi);
        System.out.println(phones.macPhone);
        System.out.println(phones.windowsPhone);
        System.out.println(phones.oppo);
    }
    
}
