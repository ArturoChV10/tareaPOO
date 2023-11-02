package tester;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageInPanelExample {
	
	JLabel imageLabel;

    private ImageInPanelExample() {
    	JFrame frame = new JFrame("Image in JFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1000, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Carga la imagen desde un archivo (asegúrate de proporcionar la ruta correcta)
        try {
            File imageFile = new File("C:/Users/PRINCIPAL/Downloads/rioGrandeArriba.png");
            Image originalImage = ImageIO.read(imageFile);

            // Redimensiona la imagen al tamaño deseado
            int imageWidth = 200; // Tamaño deseado de la imagen
            int imageHeight = 150;
            Image resizedImage = originalImage.getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);

            // Crea un ImageIcon con la imagen redimensionada y colócala en un JLabel
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            imageLabel = new JLabel(resizedIcon);

            // Agrega el JLabel al panel
            panel.add(imageLabel, BorderLayout.CENTER);
            
            panel.setBounds(200, 200, 400, 300);

            frame.add(panel);
            frame.setLayout(null);
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
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
        
        showPhotoButton.setBounds(0, 0, 150, 50);
        
        JButton increaseVolumeButton = new JButton("Adjust Volume");
        increaseVolumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                controlDevice.device.increaseVolume();
            	System.out.println("Sonido ha subido");
            }
        });
        
        increaseVolumeButton.setBounds(150, 0, 150, 50);
        
        JButton decreaseVolumeButton = new JButton("Adjust Volume");
        decreaseVolumeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                controlDevice.device.decreaseVolume();
            	System.out.println("Sonido ha bajado");
            }
        });
        
        decreaseVolumeButton.setBounds(300, 0, 150, 50);
        
        frame.add(increaseVolumeButton);
        frame.add(decreaseVolumeButton);
        frame.add(showPhotoButton);
    }
    
    public static void main(String[] args) {
        ImageInPanelExample main = new ImageInPanelExample();
    }
}