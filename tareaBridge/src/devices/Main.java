package devices;

public class Main {
    public static void main(String[] args) {
        Display laptopDisplay = new Display("LCD");
        Device laptop = new Laptop(laptopDisplay);
        ControlDevice smartphone = new SmartphoneControl(laptop);
        new DeviceControlUI(smartphone);

        Display tvDisplay = new Display("LED");
        Device smartTV = new SmartTV(tvDisplay);
        ControlDevice googleHome = new GoogleHomeControl(smartTV);
        new DeviceControlUI(googleHome);

        Display projectorDisplay = new Display("DLP");
        Device projector = new ProjectorSmart(projectorDisplay);
        ControlDevice alexa = new AlexaControl(projector);
        new DeviceControlUI(alexa);
    }
}
