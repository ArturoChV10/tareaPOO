package devices;

public class SmartphoneControl extends ControlDevice {
    public SmartphoneControl(Device device) {
        super(device);
    }

    @Override
    public void controlDevice() {
        device.showPhoto("Vacation Photo");
        device.increaseVolume();
        device.decreaseVolume();
        device.printStatus();
    }
}
