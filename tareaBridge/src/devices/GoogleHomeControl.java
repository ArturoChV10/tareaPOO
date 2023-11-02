package devices;

public class GoogleHomeControl extends ControlDevice {
    public GoogleHomeControl(Device device) {
        super(device);
    }

    @Override
    public void controlDevice() {
        device.showPhoto("Family Gathering Photo");
        device.increaseVolume();
        device.decreaseVolume();
        device.printStatus();
    }
}
