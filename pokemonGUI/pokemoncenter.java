package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import main.Trainer;
import java.awt.event.*;

public class pokemoncenter extends JFrame{
    JFrame f;
    public pokemoncenter(Trainer trainer){
        try{
            f = new JFrame("Pokemon Center");
            JButton breeding = new JButton("Breeding");
            JButton trade = new JButton("trade");
            JButton rest1 = new JButton("rest");
            JButton rest2 = new JButton("rest");
            JButton back = new JButton("back");
            ImageIcon img = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/pokemoncenter2.jpg");
            JLabel background = new JLabel("",img,JLabel.CENTER);
            breeding.setBounds(40,50,100,20);
            trade.setBounds(380,50,80,20);
            rest1.setBounds(25,220,80,20);
            rest2.setBounds(400,220,80,20);
            back.setBounds(210,200,100,40);
            background.setBounds(0,0,512,256);
            breeding.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    breeding T3 = new breeding(trainer);
                    f.setVisible(false);
                }
            });
            trade.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    f.setVisible(false);
                    trader T2 = new trader(trainer);
                }
            });
            back.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    f.setVisible(false);
                    Lobby T1 = new Lobby(trainer);
                }
            });
            rest1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    trainer.regen();
                    JFrame regen = new JFrame();
                    JLabel text = new JLabel("All your pokemon has Been rest"); 
                    text.setBounds(10,10,200,40);
                    regen.add(text);
                    regen.setLocation(600, 300);
                    regen.setSize(220,100);
                    regen.setLayout(null);
                    regen.setVisible(true);
                }
            });
            rest2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    trainer.regen();
                    JFrame regen = new JFrame();
                    JLabel text = new JLabel("All your pokemon has Been rest"); 
                    text.setBounds(10,10,200,40);
                    regen.add(text);
                    regen.setLocation(600, 300);
                    regen.setSize(220,100);
                    regen.setLayout(null);
                    regen.setVisible(true);
                }
            });
            f.setLocation(700, 250);
            f.add(breeding);
            f.add(trade);
            f.add(rest1);
            f.add(rest2);
            f.add(back);
            f.add(background);
            f.setSize(525,290);
            f.setLayout(null);
            f.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in pokemoncenter class");
        }
    }
}