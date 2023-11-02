package devices;

public abstract class Device {
    protected Display display;
    protected int currentVolume;
    protected boolean statePhoto;

    public Device(Display display) {
        this.display = display;
        this.currentVolume = 50; // Volumen por defecto
    }

    public abstract void showPhoto(String photo);
    public abstract void increaseVolume();
    public abstract void decreaseVolume();

    public void printStatus() {
        System.out.println("Device: Display - " + display.getType() + ", Volume - " + currentVolume);
    }
    
    public abstract void changeState();
    
}
