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

public class Catchpokemon extends JFrame{
    private JFrame j;
    public Catchpokemon(Trainer trainer){
        try{
            j = new JFrame("Let's Catch");
            JLabel a= new JLabel();
            JButton b = new JButton("select"); 
            if(trainer.cheackhavereadypoke(trainer.getpokebag()) == false){
                JLabel cant = new JLabel("You don't have ready pokemon");
                cant.setBounds(50,50,300,40);
                j.add(cant);
                j.setVisible(false);
            }
            else{
                JLabel topic = new JLabel("Pokemon around you");
                
                ArrayList<basicpoke> pokemons = new ArrayList<basicpoke>();
                int pokemonran = (int)(Math.random()*7 + 1);
                for(int i=0; i < pokemonran; i++){
                int type = (int)(Math.random()*4);
                if(type == 0){
                    pokemons.add(new Bulbasaur("Wild Bulbasaur"));
                }
                else if(type == 1){
                    pokemons.add(new Squirtle("Wild Squirtle"));
                }
                else if(type == 2){
                    pokemons.add(new Charmander("Wild Chamander"));
                }
                else if(type == 3){
                    pokemons.add(new Pikachu("Wild Pikachu"));    
                }
                int y = 60;
                for(basicpoke p : pokemons){
                    int no = 1;
                    JLabel pok = new JLabel("No." + no + ":" + p.getName() + " = " + p.getHp());
                    JButton fight = new JButton("Fight");
                    pok.setBounds(20,y,200,20);
                    fight.setBounds(220,y,100,20);
                    fight.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            mypokeoncatch T7 = new mypokeoncatch(trainer,p);
                            j.setVisible(false);
                        }
                    });
                    y += 40;
                    j.add(fight);
                    j.add(pok);
                }
                topic.setBounds(100,10,200,40);
                j.add(topic);
            }
            j.setLocation(400, 200);
            }
            j.setSize(350,400);
            j.setLayout(null);
            j.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in Catchpokemon class");
        }
    }
}