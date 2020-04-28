package pokemonGUI;

import Pokemon.*;
import javax.swing.*;
import javax.swing.JFrame;
import Basicpoke.*;
import main.Trainer;
import java.awt.event.*;
import java.awt.*;
import Item.*;

public class breeding extends JFrame{
    public JFrame f;
    public JLabel background1,background2,background3;
    public int select;
    public basicpoke newbie;
    public breeding(Trainer trainer){
        try{
            newbie = null;
            f = new JFrame("Breeding");
            Font font = new Font("Courier", Font.BOLD,48);
            JButton confirm = new JButton("Confirm");
            confirm.setBounds(390,645,200,40);
            //Backgroundzone
            background1 = new JLabel();
            background1.setBounds(0,0,1000,400);
            background1.setBackground(Color.RED);
            background1.setOpaque(true);
            background2 = new JLabel();
            background2.setBounds(0,400,1000,100);
            background2.setBackground(Color.BLACK);
            background2.setOpaque(true);
            background3 = new JLabel();
            background3.setBounds(0,500,1000,195);
            background3.setBackground(Color.WHITE);
            background3.setOpaque(true);
            //////////
            // เช็ค berry
            int berry = 0;
            for(Item r : trainer.getbag().getitem()){
                if(r.getID() == 2){
                    ++berry;
                }
            }
            int i = 1;
            int y = 0;
            int x = 30;
            JLabel use = new JLabel("use 2 berry you have " + berry);
            use.setBounds(430,400,300,30);
            use.setForeground(Color.WHITE);
            
            select = 1;
            for(basicpoke p : trainer.getpokebag()){
                if(y == 420){
                    y = 0;
                    x += 350; 
                }
                JLabel a = new JLabel("No." + i + " " + p.getName());
                JButton b = new JButton("Select");
                b.setBounds(x+170,y+10,100,20);
                if(berry >= 2){
                    b.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(select == 1){
                                select++;
                                a.setVisible(false);
                                b.setVisible(false);
                                JLabel anew = new JLabel(p.getName());
                                JButton bnew = new JButton("cancel");
                                anew.setBounds(300,420,200,40);
                                anew.setForeground(Color.WHITE);
                                bnew.setBounds(300,470,100,20);
                                bnew.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        select--;
                                        anew.setVisible(false);
                                        bnew.setVisible(false);
                                        a.setVisible(true);
                                        b.setVisible(true);
                                    }
                                });
                                f.remove(background2);
                                f.add(anew);
                                f.add(bnew);
                                f.add(background2);
                                f.add(background3);
                                f.repaint();
                            }
                            else if(select == 2){
                                select++;
                                int type = (int)(Math.random()*4);
                                if(type == 0){
                                    newbie =new Bulbasaur("Bulbasaur");
                                }
                                else if(type == 1){
                                    newbie =new Squirtle("Squirtle");
                                }
                                else if(type == 2){
                                    newbie =new Charmander("Chamander");
                                }
                                else if(type == 3){
                                    newbie =new Pikachu("Pikachu");    
                                }
                                a.setVisible(false);
                                b.setVisible(false);
                                JLabel anew = new JLabel(p.getName());
                                JButton bnew = new JButton("cancel");
                                anew.setBounds(600,420,200,40);
                                anew.setForeground(Color.WHITE);
                                bnew.setBounds(600,470,100,20);
                                JLabel namenewbie = new JLabel(newbie.getName());
                                namenewbie.setBounds(380,560,300,40);
                                namenewbie.setFont(font);
                                namenewbie.setForeground(Color.BLACK);
                                bnew.addActionListener(new ActionListener(){
                                    public void actionPerformed(ActionEvent e){
                                        select--;
                                        anew.setVisible(false);
                                        bnew.setVisible(false);
                                        a.setVisible(true);
                                        b.setVisible(true);
                                        newbie = null;
                                        namenewbie.setVisible(false);
                                    }
                                });
                                f.remove(background3);
                                f.remove(background2);
                                f.add(namenewbie);
                                f.add(anew);
                                f.add(bnew);
                                f.add(background2);
                                f.add(background3);
                                f.repaint();
                            }
                        }
                    });
                }
                a.setForeground(Color.WHITE);
                a.setBounds(x,y,200,40);
                f.add(b);
                f.add(a);
                i++;
                y += 60;
            }
            confirm.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(newbie != null){
                        trainer.getbag().berrytobreed();
                        trainer.getpokebag().add(newbie);
                    }
                    pokemoncenter T102 = new pokemoncenter(trainer);
                    f.setVisible(false);
                }
            });
            f.add(confirm);
            f.add(use);
            f.add(background1);
            f.add(background2);
            f.add(background3);
            f.setLocation(400,200);
            f.setSize(1010,725);
            f.setLayout(null);
            f.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in breeding class");
        }
    }
}