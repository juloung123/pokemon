package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import Basicpoke.*;
import main.Trainer;

public class Pokeball extends JFrame{
    private JFrame j;

    public Pokeball(Trainer trainer,basicpoke wildpokemon){
        try{
            j = new JFrame("My pokemon");
            int y = 20;
            int i=1;
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
                            j.setVisible(false);
                        }
                    });
                }
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
            System.out.println("Something wrong in Pokeball class");
        }
    }
}