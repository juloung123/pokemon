package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import Basicpoke.*;
import main.Trainer;
import java.awt.event.*;
import java.awt.*;

public class changename extends JFrame{
    private JFrame j;
    public changename(basicpoke p){
        j = new JFrame("Change name");
        JTextField a = new JTextField();
        JButton b = new JButton("Complete");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                j.setVisible(false);
                p.changename(a.getText());
            }
        });
        a.setBounds(20,20,200,20);
        b.setBounds(40,100,100,20);
        j.add(a);
        j.add(b);
        j.setSize(320,200);
        j.setLayout(null);
        j.setVisible(true);
    }
}