package pokemonGUI;

import Pokemon.*;
import javax.swing.*;
import javax.swing.JFrame;
import Basicpoke.*;
import main.Trainer;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class trader extends JFrame{
    public JFrame j;
    public basicpoke delete ;
    public basicpoke add ;
    public trader(Trainer trainer){
        delete = null;
        add = null;
        try{
        j = new JFrame("trading");
        JPanel mypoke = new JPanel();
        JPanel pospoke = new JPanel();
        JLabel mid = new JLabel();
        mid.setBounds(400,0,200,400);
        mid.setBackground(Color.BLACK);
        mid.setOpaque(true);
        JButton confirm = new JButton("Confirm");
        confirm.setBounds(450,300,100,20);
        mypoke.setBounds(0,0,400,400);    
        mypoke.setBackground(Color.RED); 
        pospoke.setBounds(600,0,400,400);    
        pospoke.setBackground(Color.WHITE); 
        mypoke.setLayout(new BoxLayout(mypoke, BoxLayout.Y_AXIS)); 
        pospoke.setLayout(new BoxLayout(pospoke, BoxLayout.PAGE_AXIS)); 
        int i = 1;
        for(basicpoke p : trainer.getpokebag()){
            JLabel a = new JLabel("No." + i + " " + p.getName());
            JButton b = new JButton("Select");
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(delete ==null){
                        delete = p;
                        a.setVisible(false);
                        b.setVisible(false);
                        JLabel choose = new JLabel(p.getName());
                        JButton newchoose = new JButton("back");
                        choose.setBounds(450,100, 100, 40);
                        newchoose.setBounds(450,150, 100, 20);
                        newchoose.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                delete = null;
                                choose.setVisible(false);
                                newchoose.setVisible(false);
                                a.setVisible(true);
                                b.setVisible(true);
                            }
                        }); 
                        choose.setForeground(Color.WHITE);
                        j.remove(mid);
                        j.add(choose);
                        j.add(newchoose);
                        j.add(mid);
                        j.repaint();
                    }
                }
            });
            a.setForeground(Color.white);
            mypoke.add(a);
            mypoke.add(b);
            i++;
        }   
        ArrayList<basicpoke> pokemons = new ArrayList<basicpoke>();
        int pokemonran = (int)(Math.random()*8 + 1);
        for(int j=0; j < pokemonran; j++){
            int type = (int)(Math.random()*4);
            if(type == 0){
                pokemons.add(new Bulbasaur("Bulbasaur"));
            }
            else if(type == 1){
                pokemons.add(new Squirtle("Squirtle"));
            }
            else if(type == 2){
                pokemons.add(new Charmander("Chamander"));
            }
            else if(type == 3){
                pokemons.add(new Pikachu("Pikachu"));    
            }
        }
        int k = 1;
        for(basicpoke p : pokemons){
            JLabel a = new JLabel("No." + k + " " + p.getName());
            JButton b = new JButton("Select");
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(add == null){
                        add = p;
                        a.setVisible(false);
                        b.setVisible(false);
                        JLabel choose = new JLabel(p.getName());
                        JButton newchoose = new JButton("back");
                        choose.setBounds(450,200, 100, 40);
                        newchoose.setBounds(450,250, 100, 20);
                        newchoose.addActionListener(new ActionListener(){
                            public void actionPerformed(ActionEvent e){
                                add = null;
                                choose.setVisible(false);
                                newchoose.setVisible(false);
                                a.setVisible(true);
                                b.setVisible(true);
                            }
                        });
                        choose.setForeground(Color.WHITE);
                        j.remove(mid);
                        j.add(choose);
                        j.add(newchoose);
                        j.add(mid);
                        j.repaint();
                    }
                }
            });
            pospoke.add(a);
            pospoke.add(b);
            k++;
        }
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trainer.getpokebag().add(add);
                trainer.getpokebag().remove(delete);
                j.setVisible(false);
                pokemoncenter T1 = new pokemoncenter(trainer);
            }
        });
        j.add(confirm);
        j.add(mypoke);
        j.add(pospoke);
        j.add(mid);
        j.setLocation(400,400);
        j.setSize(1000,400);
        j.setLayout(null);
        j.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in breeding class");
        }
    }
}