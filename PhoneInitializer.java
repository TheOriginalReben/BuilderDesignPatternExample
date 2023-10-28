package Java.BuilderDesignPatternExample;

public class PhoneInitializer {

    Phone xiaomi;
    Phone macPhone;
    Phone windowsPhone;
    Phone oppo;

    public void initializePhones() {
        xiaomi = new Phone(new PhoneBuilder("Android 13", "Qualcomm Snapdragon", 7.6f , 48000, 64));
        oppo = new Phone(new PhoneBuilder("Android 13", "Qualcomm Snapdragon", 6.8f, 50000, 76));
        macPhone = new Phone(new PhoneBuilder("IOS", "Apple M1 Chip", 8.4f, 57000, 128));
        windowsPhone = new Phone(new PhoneBuilder("Windows", "Intel L Chip", 8.6f, 54000, 64));
    }
}
