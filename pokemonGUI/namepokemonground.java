package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;

import main.Trainer;

import java.awt.event.*;
import java.awt.*;

public class namepokemonground extends JFrame{
    private JTextField name;
    private JFrame f;
    public namepokemonground(Trainer trainer,int sec){
        
        f = new JFrame("Name");
        JLabel detail1 = new JLabel("Enter your pokemon name");
        JButton b = new JButton("Let's Go");
        name = new JTextField();
        detail1.setBounds(120,90,150,30);
        name.setBounds(100,130,200,30);
        b.setBounds(150,180,100,30);
        f.add(detail1);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
                trainer.firstselect(sec,name.getText());
                Lobby T3 = new Lobby(trainer);
            }
        });
        f.add(b);
        f.add(name);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public String getName(){
        return name.getText();
    }
}