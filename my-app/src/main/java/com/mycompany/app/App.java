package com.mycompany.app;

import javax.swing.*;

import com.mycompany.Rano;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Matsaka :)
 */
public class App extends JFrame {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Matsaka");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        
        //Choose the City
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

        city1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Rano rano = new Rano(city1);
                JLabel label = new JLabel("There is " + rano.getBidon() + " waiting before you.");
                frame.add(label);
                label.setVisible(true);
                System.out.println("Label Added");
            }
        });


        //Add queue or not to get water
        JPanel panel= new JPanel();
        JButton button= new JButton("Line up for Queue");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
                JOptionPane.showMessageDialog(frame,"Added Clicked");
            }
        });


    
        frame.add(panel,BorderLayout.CENTER);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

       
      
        
    }

    public void intialize(){




    }
}
