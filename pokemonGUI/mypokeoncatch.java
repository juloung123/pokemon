package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import Basicpoke.*;
import main.Trainer;

import java.awt.event.*;
import java.awt.*;

public class mypokeoncatch extends JFrame{
    private JFrame j;

    public mypokeoncatch(Trainer trainer,basicpoke wildpokemon){
        try{
            j = new JFrame("My pokemon");
            int y = 20;
            int i=1;
            for(basicpoke w : trainer.getpokebag()){
                ImageIcon img = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/background.png");
                JLabel background = new JLabel("",img,JLabel.CENTER);
                background.setBounds(0,0,1280,720);
                JLabel a = new JLabel("No." + i + " " + w.getName() + " = " + w.getHp() + "/" + w.getMaxHp());
                JButton b = new JButton("Select");
                b.setBounds(200,y+10,100,20);
                b.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        if(w.getHp() > 0 ){
                            action T8 = new action(trainer,w,wildpokemon);
                            j.setVisible(false);
                        }
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
            System.out.println("Something wrong in mypokemononcatch class");
        }
    }
}