package devices;

public class Main {
    public static void main(String[] args) {
        Display laptopDisplay = new Display("Laptop");
        Device laptop = new Laptop(laptopDisplay);
        ControlDevice smartphone = new SmartphoneControl(laptop);
        new DeviceControlUI(smartphone);

        Display tvDisplay = new Display("TV");
        Device smartTV = new SmartTV(tvDisplay);
        ControlDevice googleHome = new GoogleHomeControl(smartTV);
        new DeviceControlUI(googleHome);

        Display projectorDisplay = new Display("Proyector");
        Device projector = new ProjectorSmart(projectorDisplay);
        ControlDevice alexa = new AlexaControl(projector);
        new DeviceControlUI(alexa);
    }
}
