package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import Basicpoke.*;
import main.Trainer;

public class sppotion extends JFrame{
    private JFrame j;

    public sppotion(Trainer trainer,basicpoke mypokemon,basicpoke wildpokemon){
        try{
            j = new JFrame("My pokemon");
            int y = 20;
            int i=1;
            JButton c = new JButton("Back");
            for(basicpoke p : trainer.getpokebag()){
                JLabel a = new JLabel("No." + i + " " + p.getName() + " = " + p.getSp() + "/" + p.getMaxSp());
                JButton b = new JButton("Select");
                b.setBounds(200,y+10,100,20);
                if(p.getSp() < p.getMaxSp()){
                    b.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            action T1 = new action(trainer,mypokemon,wildpokemon);
                            trainer.getbag().usesppo(p,trainer.getbag());
                            JFrame k = new JFrame();
                            JLabel text = new JLabel(p.getName() + " Get 5 SP"); 
                            text.setBounds(10,10,200,40);
                            k.add(text);
                            k.setSize(220,100);
                            k.setLayout(null);
                            k.setVisible(true);
                            j.setVisible(false);
                            k.setLocation(100,50);
                        }
                    });
                }
                a.setBounds(30,y,200,40);
                j.add(b);
                j.add(a);
                i++;
                y += 60;
            }
            c.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    action T1 = new action(trainer,mypokemon,wildpokemon);
                    j.setVisible(false);
                }
            });
            c.setBounds(100,y+60,100,20);
            j.setLocation(400, 200);
            j.add(c);
            j.setSize(320,400);
            j.setLayout(null);
            j.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in sppotion class");
        }
    }
}