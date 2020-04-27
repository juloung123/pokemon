package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;

import main.Trainer;

import java.awt.event.*;
import java.awt.*;

public class nameground extends JFrame {
    private JTextField name;
    private JFrame f;
    public nameground(){
        try{
            f = new JFrame("Name");
            JLabel detail = new JLabel("Enter your name");
            JButton b = new JButton("Let's Go");
            name = new JTextField();
            detail.setBounds(150,90,100,30);
            name.setBounds(100,130,200,30);
            b.setBounds(150,180,100,30);
            f.add(detail);
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    f.setVisible(false);
                    Trainer trainer = new Trainer(name.getText());
                    select test = new select(trainer);
                }
            });
            f.setLocation(600, 300);
            f.add(b);
            f.add(name);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in nameground class");
        }
    }
}