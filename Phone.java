package Java.BuilderDesignPatternExample;

public class Phone {

    //required parameters
    private String os;
    private String processor;
    private float screenSize;
    private int batteryCapacity;
    private int cameraPixel;

    //optional parameters
    private boolean vrSupport;

    public Phone(PhoneBuilder builder) {
        this.os = builder.getOS();
        this.processor = builder.getProcessor();
        this.screenSize = builder.getScreenSize();
        this.batteryCapacity = builder.getBatteryCapacity();
        this.cameraPixel = builder.getCameraPixel();
        this.vrSupport = builder.getVRSupport();
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone [os=" + os + ", processor=" + processor + ", screen size=" + screenSize + ", battery capacity=" + batteryCapacity +", camera pixels=" + cameraPixel+ "]";
    }

    public String getOS() {return os; }
    public String getProcessor() { return processor; }
    public float getScreenSize() { return screenSize; }
    public int getBatteryCapacity() { return batteryCapacity; }
    public int getCameraPixel() { return cameraPixel; }

}