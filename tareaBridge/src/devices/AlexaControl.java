package devices;

public class AlexaControl extends ControlDevice {
    public AlexaControl(Device device) {
        super(device);
    }

    @Override
    public void controlDevice() {
        device.showPhoto("Nature Photo");
        device.increaseVolume();
        device.decreaseVolume();
        device.printStatus();
    }
}
