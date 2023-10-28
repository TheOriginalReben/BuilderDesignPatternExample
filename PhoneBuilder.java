package Java.BuilderDesignPatternExample;

public class PhoneBuilder {
    private String os;
    private String processor;
    private float screenSize;
    private int batteryCapacity;
    private int cameraPixel;

    private boolean vrSupport;

    public PhoneBuilder(String os, String processor, float screenSize, int batteryCapacity, int cameraPixel) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.cameraPixel = cameraPixel;
    }

    public PhoneBuilder setVRSupport(boolean vrSupport) {
        this.vrSupport = vrSupport;
        return this;
    }

    public Phone build() {
        return new Phone(this);
    }

    public String getOS() { return os; }
    public String getProcessor() { return processor; }
    public float getScreenSize() { return screenSize; }
    public int getBatteryCapacity() { return batteryCapacity; }
    public int getCameraPixel() { return cameraPixel; }
    public boolean getVRSupport() { return vrSupport; }

}
