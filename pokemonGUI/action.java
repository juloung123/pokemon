package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

import Basicpoke.*;
import main.Trainer;
import Pokemon.*;
import bag.*;
import pokemonGUI.*;
import java.util.*;

public class action extends JFrame{
    private JFrame f;
    public action(Trainer trainer,basicpoke mypokemon,basicpoke wildpokemon){
        Font font = new Font("Courier", Font.BOLD,48);
        Font font1 = new Font("Courier", Font.BOLD,24);
        ImageIcon img = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/background.png");
        f = new JFrame("action");
        JLabel topic = new JLabel("What will ");
        JLabel topic1 = new JLabel(mypokemon.getName() + " do ?");
        JButton fight1 = new JButton("Fight");
        JButton mybag1 = new JButton("Bag");
        JButton mypo1 = new JButton("Pokemon");
        JButton run1 = new JButton("Run");
        
        JLabel background = new JLabel("",img,JLabel.CENTER);
        if(wildpokemon.getHp() != 0){
            fight1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    f.setVisible(false);
                    fight T1 = new fight(trainer,mypokemon,wildpokemon);
                
                }
            }); 
        }
        mybag1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                invenincatch T2 = new invenincatch(trainer,mypokemon,wildpokemon);
                f.setVisible(false);
            }
        });
        mypo1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mypokeoncatch T7 = new mypokeoncatch(trainer,wildpokemon);
                f.setVisible(false);
            }
        });
        run1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.setVisible(false);
            }
        }); 
        fight1.setFont(font1);
        mybag1.setFont(font1);
        mypo1.setFont(font1);
        run1.setFont(font1);
        topic.setFont(font);
        topic1.setFont(font);
        topic1.setBounds(20,800,800,100);
        topic.setBounds(20,725,800,100);
        background.setBounds(0,0,1280,720); 
        fight1.setBounds(625,725,300,100);
        mybag1.setBounds(975,725,300,100);
        mypo1.setBounds(625,850,300,100);
        run1.setBounds(975,850,300,100);
        f.add(topic1);
        f.add(background);
        f.add(topic);
        f.add(fight1);
        f.add(run1);
        f.add(mybag1);
        f.add(mypo1);
        f.setSize(1295,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
}