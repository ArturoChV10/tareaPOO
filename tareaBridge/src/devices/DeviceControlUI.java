package devices;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;

public class DeviceControlUI {
	
	JLabel imageLabel;
    private ControlDevice controlDevice;
    int imageWidth;
    int imageHeight;
    JLabel label;
    JLabel labelVolumen;

    public DeviceControlUI(ControlDevice controlDevice) {
        this.controlDevice = controlDevice;
        
    	JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(650, 420);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(25, 10, 400, 300);
        
        labelVolumen = new JLabel("Volumen:");
        labelVolumen.setBounds(490, 130, 100, 50);
        labelVolumen.setFont(new Font("Arial", Font.BOLD, 18));
        
        int volumen = controlDevice.device.currentVolume;
        String volumenStr = String.valueOf(volumen);
        label = new JLabel(volumenStr);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBounds(520, 150, 50, 50);
        
        String name = controlDevice.device.display.getType();
        
        JButton showPhotoButton = new JButton("Show Photo");
        showPhotoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(imageLabel.isVisible()) {
            		imageLabel.setVisible(false);
            	} else {
            		imageLabel.setVisible(true);
            	}
            }
        });
        
        showPhotoButton.setBounds(0, 310, 150, 50);
        
        JButton increaseVolumeButton = new JButton("Increase Volume");
        increaseVolumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlDevice.device.increaseVolume();
            	System.out.println("Sonido ha subido");
            	int volumen = controlDevice.device.currentVolume;
            	String volumenStr = String.valueOf(volumen);
                label.setText(volumenStr);
            }
        });
        
        increaseVolumeButton.setBounds(150, 310, 150, 50);
        
        JButton decreaseVolumeButton = new JButton("Decrease Volume");
        decreaseVolumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlDevice.device.decreaseVolume();
            	System.out.println("Sonido ha bajado");
            	int volumen = controlDevice.device.currentVolume;
            	String volumenStr = String.valueOf(volumen);
                label.setText(volumenStr);
            	
            }
        });
        
        decreaseVolumeButton.setBounds(300, 310, 150, 50);

        // Carga la imagen desde un archivo (asegúrate de proporcionar la ruta correcta)
        try {
            File imageFile = new File("C:/Users/PRINCIPAL/Downloads/rioGrandeArriba.png");
            Image originalImage = ImageIO.read(imageFile);
            
            if(name == "TV") {
            	imageWidth = 275;
                imageHeight = 225;
            }

            if(name == "Proyector") {
            	imageWidth = 800;
                imageHeight = 400;
                frame.setSize(1100, 550);
                panel.setBounds(25, 10, imageWidth, imageHeight);
                showPhotoButton.setBounds(100, 430, 150, 50);
                increaseVolumeButton.setBounds(300, 430, 150, 50);
                decreaseVolumeButton.setBounds(500, 430, 150, 50);
                labelVolumen.setBounds(920, 130, 100, 50);
                label.setBounds(950, 150, 50, 50);
            }

            if(name == "Laptop") {
            	imageWidth = 400;
                imageHeight = 200;
            }

            frame.setTitle(name);
            
            Image resizedImage = originalImage.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);

            // Crea un ImageIcon con la imagen redimensionada y colócala en un JLabel
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            imageLabel = new JLabel(resizedIcon);

            // Agrega el JLabel al panel
            panel.add(imageLabel, BorderLayout.CENTER);

            frame.add(panel);
            frame.setLayout(null);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        frame.add(labelVolumen);
        frame.add(label);
        frame.add(increaseVolumeButton);
        frame.add(decreaseVolumeButton);
        frame.add(showPhotoButton);
    }
/*    
    public static void main(String[] args) {
        DeviceControlUI main = new DeviceControlUI();
    }
*/
}