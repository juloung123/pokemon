package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import Basicpoke.*;
import main.Trainer;

import java.awt.event.*;
import java.awt.*;

public class mypokemon extends JFrame{
    private JFrame j;

    public mypokemon(Trainer trainer){
        j = new JFrame("My pokemon");
        for(basicpoke p : trainer.getpokebag()){
            int y = 20;
            int i=1;
            JLabel a = new JLabel("No." + i + " " + p.getName());
            JButton b = new JButton("Select");
            b.setBounds(150,y+10,100,20);
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    infopoke T6 = new infopoke(p);
                }
            });
            a.setBounds(30,y,100,40);
            j.add(b);
            j.add(a);
            i++;
            y += 60;
        }
        j.setSize(320,400);
        j.setLayout(null);
        j.setVisible(true);
    }
}