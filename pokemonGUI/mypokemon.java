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
        try{
            j = new JFrame("My pokemon");
            int y = 20;
            int i=1;
            for(basicpoke p : trainer.getpokebag()){
                JLabel a = new JLabel("No." + i + " " + p.getName());
                JButton b = new JButton("Select");
                b.setBounds(200,y+10,100,20);
                b.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        infopoke T6 = new infopoke(p);
                        j.setVisible(false);
                    }
                });
                a.setBounds(30,y,200,40);
                j.add(b);
                j.add(a);
                i++;
                y += 60;
            }
            j.setLocation(400, 200);
            j.setSize(320,400);
            j.setLayout(null);
            j.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in mypokemon class");
        }
    }
}