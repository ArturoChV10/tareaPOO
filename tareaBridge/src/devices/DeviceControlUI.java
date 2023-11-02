package devices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeviceControlUI {
    private ControlDevice controlDevice;

    public DeviceControlUI(ControlDevice controlDevice) {
        this.controlDevice = controlDevice;

        JFrame frame = new JFrame("Device Control UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        JButton showPhotoButton = new JButton("Show Photo");
        showPhotoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlDevice.device.showPhoto("Vacation Photo");
            }
        });

        JButton increaseVolumeButton = new JButton("Adjust Volume");
        increaseVolumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlDevice.device.increaseVolume();
            }
        });
        
        JButton decreaseVolumeButton = new JButton("Adjust Volume");
        decreaseVolumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlDevice.device.decreaseVolume();
            }
        });

        JButton printStatusButton = new JButton("Print Status");
        printStatusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlDevice.device.printStatus();
            }
        });

        frame.add(showPhotoButton);
        frame.add(increaseVolumeButton);
        frame.add(decreaseVolumeButton);
        frame.add(printStatusButton);
        frame.setVisible(true);
    }
}