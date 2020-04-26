package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;
import Item.*;
import Basicpoke.*;
import main.Trainer;
import Pokemon.*;
import bag.*;
import pokemonGUI.*;
import java.util.*;

public class Inventory extends JFrame{
    private JFrame j;
    public Inventory(Trainer trainer,Bag bag){
        j = new JFrame("My Inventory");
        if(bag.empty() == true){
                JLabel text = new JLabel("Your Item is Empty"); 
                text.setBounds(10,10,200,40);
                j.add(text);
                j.setSize(220,100);
                j.setLayout(null);
                j.setVisible(true);
        }
        else{
            int ball=0;
            int hp=0;
            int berry=0;
            int sp=0;
            for(Item r : bag.getitem()){
                if(r.getID() == 0){
                    ++ball;
                }
                else if(r.getID() == 1){
                    ++hp;
                }
                else if(r.getID() == 2){
                    ++berry;
                }
                else if(r.getID() == 3){
                    ++sp;
                }
            }
            JLabel topic = new JLabel("My Inventory");
            JLabel textball = new JLabel("No.1 : Pokeball = " + ball);
            JLabel texthp = new JLabel("No.2 : Hppotion = " + hp);
            JLabel textberry = new JLabel("No.3 : berry = " + berry);
            JLabel textsp = new JLabel("No.4 : sppotion = " + sp);
            JButton Butball = new JButton("Select");
            JButton Buthp = new JButton("Select");
            JButton Butberry = new JButton("Select");
            JButton Butsp = new JButton("Select");
            topic.setBounds(100,20,200,40);
            textball.setBounds(20,80,250,40);
            texthp.setBounds(20,140,250,40);
            textberry.setBounds(20,200,250,40);
            textsp.setBounds(20,260,250,40);
            Butball.setBounds(150,80,100,40);
            Buthp.setBounds(150,140,100,40);
            Butberry.setBounds(150,200,100,40);
            Butsp.setBounds(150,260,100,40);
            Butball.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                        JFrame k = new JFrame();
                        JLabel text = new JLabel("use to catch pokemon"); 
                        text.setBounds(10,10,200,40);
                        k.add(text);
                        k.setSize(220,100);
                        k.setLayout(null);
                        k.setVisible(true);
                }
            });
            if(bag.checkbag(1) == true){
                Buthp.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        Hppotion T1 = new Hppotion(trainer);
                        j.setVisible(false);
                    }
                });
            }
            if(bag.checkbag(2) == true){
                Butberry.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        berry T1 = new berry(trainer);
                        j.setVisible(false);
                    }
                });
            }
            if(bag.checkbag(3) == true){
                Butsp.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        sppotion T1 = new sppotion(trainer);
                        j.setVisible(false);
                    }
                });
            }
            j.add(topic);
            j.add(textball);
            j.add(texthp);
            j.add(textberry);
            j.add(textsp);
            j.add(Butball);
            j.add(Buthp);
            j.add(Butberry);
            j.add(Butsp);
            j.setSize(320,400);
            j.setLayout(null);
            j.setVisible(true);
        }
    }
}