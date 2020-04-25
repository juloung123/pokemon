package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import Basicpoke.*;
import main.Trainer;

import java.awt.event.*;
import java.awt.*;

public class mypokeoncatch extends JFrame{
    private JFrame j;

    public mypokeoncatch(Trainer trainer,basicpoke p){
        j = new JFrame("My pokemon");
        for(basicpoke w : trainer.getpokebag()){
            int y = 20;
            int i=1;
            JLabel a = new JLabel("No." + i + " " + w.getName() + " = " + w.getHp());
            JButton b = new JButton("Select");
            b.setBounds(150,y+10,100,20);
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(w.getHp() > 0 ){
                        action T8 = new action();
                    }
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