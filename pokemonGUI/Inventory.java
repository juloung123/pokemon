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
        try{
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
                            JFrame main = new JFrame("My pokemon");
                            int y = 20;
                            int i=1;
                            JButton c = new JButton("Back");
                            for(basicpoke p : trainer.getpokebag()){
                                JLabel a = new JLabel("No." + i + " " + p.getName() + " = " + p.getHp() + "/" + p.getMaxHp());
                                JButton b = new JButton("Select");
                                b.setBounds(200,y+10,100,20);
                                if(p.getHp() < p.getMaxHp()){
                                    b.addActionListener(new ActionListener(){
                                        public void actionPerformed(ActionEvent e){
                                            trainer.getbag().usehppo(p,trainer.getbag());
                                            JFrame k = new JFrame();
                                            JLabel text = new JLabel(p.getName() + " Get 50 HP"); 
                                            text.setBounds(10,10,200,40);
                                            k.add(text);
                                            k.setSize(220,100);
                                            k.setLayout(null);
                                            k.setVisible(true);
                                            main.setVisible(false);
                                        }
                                    });
                                }
                                a.setBounds(30,y,200,40);
                                main.add(b);
                                main.add(a);
                                i++;
                                y += 60;
                            }
            
                            main.setSize(320,400);
                            main.setLayout(null);
                            main.setVisible(true);
                            j.setVisible(false);
                        }
                    });
                }
                if(bag.checkbag(2) == true){
                    Butberry.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            JFrame k = new JFrame("My pokemon");
                            int y = 20;
                            int i=1;
                            for(basicpoke p : trainer.getpokebag()){
                                JLabel a = new JLabel("No." + i + " " + p.getName() + " = " + p.getHp() + "/" + p.getMaxHp());
                                JButton b = new JButton("Select");
                                b.setBounds(200,y+10,100,20);
                                b.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        trainer.getbag().useberry(p,trainer.getbag());
                                        JFrame l = new JFrame();
                                        JLabel text = new JLabel(p.getName() + " Get 1 Berry"); 
                                        text.setBounds(10,10,200,40);
                                        l.add(text);
                                        l.setSize(220,100);
                                        l.setLayout(null);
                                        l.setVisible(true);
                                        k.setVisible(false);
                                    }
                                });
                                a.setBounds(30,y,200,40);
                                k.add(b);
                                k.add(a);
                                i++;
                                y += 60;
                            }
                            k.setSize(320,400);
                            k.setLayout(null);
                            k.setVisible(true);
                            j.setVisible(false);
                        }
                    });
                }
                if(bag.checkbag(3) == true){
                    Butsp.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            JFrame k = new JFrame("My pokemon");
                            int y = 20;
                            int i=1;
                            for(basicpoke p : trainer.getpokebag()){
                                JLabel a = new JLabel("No." + i + " " + p.getName() + " = " + p.getSp() + "/" + p.getMaxSp());
                                JButton b = new JButton("Select");
                                b.setBounds(200,y+10,100,20);
                                if(p.getSp() < p.getMaxSp()){
                                    b.addActionListener(new ActionListener(){
                                        public void actionPerformed(ActionEvent e){
                                            trainer.getbag().usesppo(p,trainer.getbag());
                                            JFrame l = new JFrame();
                                            JLabel text = new JLabel(p.getName() + " Get 5 SP"); 
                                            text.setBounds(10,10,200,40);
                                            l.add(text);
                                            l.setSize(220,100);
                                            l.setLayout(null);
                                            l.setVisible(true);
                                            k.setVisible(false);
                                        }
                                    });
                                }
                                a.setBounds(30,y,200,40);
                                k.add(b);
                                k.add(a);
                                i++;
                                y += 60;
                            }
                            k.setSize(320,400);
                            k.setLayout(null);
                            k.setVisible(true);
                            j.setVisible(false);
                        }
                    });
                }
                j.setLocation(400, 200);
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
        }catch(Exception e){
            System.out.println("Something wrong in Inventory class");
        }
    }
}