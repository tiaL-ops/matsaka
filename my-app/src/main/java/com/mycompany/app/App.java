package com.mycompany.app;

import javax.swing.*;
import com.mycompany.Rano;
import java.awt.*;


/**
 * Matsaka :)
 */
public class App extends JFrame {

    private JLabel label;
    private int bidonCount = 0; 

    public App() {
        
        JFrame frame = new JFrame("Matsaka");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

      
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Ville");
        JMenuItem city1 = new JMenuItem("Ambohipo");
        JMenuItem city2 = new JMenuItem("Andraharo");
        JMenuItem city3 = new JMenuItem("Ankorondrano");
        JMenuItem city4 = new JMenuItem("Andohalo");
        JMenuItem city5 = new JMenuItem("67");

        fileMenu.add(city1);
        fileMenu.add(city2);
        fileMenu.add(city3);
        fileMenu.add(city4);
        fileMenu.add(city5);
        menuBar.add(fileMenu);

        
        label = new JLabel("Please select a city to see bidon count.");
        frame.add(label, BorderLayout.NORTH);

        // Action listeners for each city menu item
        city1.addActionListener(e -> updateBidonCount("Ambohipo"));
        city2.addActionListener(e -> updateBidonCount("Andraharo"));
        city3.addActionListener(e -> updateBidonCount("Ankorondrano"));
        city4.addActionListener(e -> updateBidonCount("Andohalo"));
        city5.addActionListener(e -> updateBidonCount("67"));

     
        JPanel panel = new JPanel();
        JButton button = new JButton("Line up for Queue");
        panel.add(button);

        button.addActionListener(e -> {
            bidonCount++;
            label.setText("There are " + bidonCount + " bidons waiting before you.");
            JOptionPane.showMessageDialog(frame, "You have lined up. Current bidons: " + bidonCount);
        });

       
        frame.add(panel, BorderLayout.CENTER);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    
    private void updateBidonCount(String cityName) {
        Rano rano = new Rano(cityName);
        bidonCount = rano.getBidon(); 
        label.setText("There are " + bidonCount + " bidons waiting in " + cityName + ".");
    }

    public static void main(String[] args) {
        new App();
    }
}
