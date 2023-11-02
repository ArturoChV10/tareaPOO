package devices;

public abstract class ControlDevice {
    protected Device device;

    public ControlDevice(Device device) {
        this.device = device;
    }

    public abstract void controlDevice();
}
