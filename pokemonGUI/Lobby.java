package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;

import main.Trainer;

import java.awt.event.*;
import java.awt.*;

public class Lobby extends JFrame{
    private JFrame f;
    public Lobby(Trainer trainer){
        f = new JFrame("Lobby");
        JLabel topic = new JLabel("Select Event");
        JButton mypoke1 = new JButton("Select");
        JButton catchpoke1 = new JButton("Select");
        JButton Inven1 = new JButton("Select");
        JButton pokecenter1 = new JButton("Select");
        JLabel mypoke = new JLabel("My Pokemon");
        JLabel catchpoke = new JLabel("Catch Pokemon");
        JLabel Inven = new JLabel("My Inventory");
        JLabel pokecenter = new JLabel("Go to pokemon Center");
        mypoke.setBounds(30,80,100,40);
        catchpoke.setBounds(30,140,100,40);
        Inven.setBounds(30,200,100,40);
        pokecenter.setBounds(30,260,140,40);
        mypoke1.setBounds(180,80,100,40);
        catchpoke1.setBounds(180,140,100,40);
        Inven1.setBounds(180,200,100,40);
        pokecenter1.setBounds(180,260,100,40);
        topic.setBounds(110,20,200,40);
        mypoke1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                mypokemon T4 = new mypokemon(trainer);
            }
        });
        catchpoke1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Catchpokemon T7 = new Catchpokemon(trainer);
            }
        });
        Inven1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Inventory T8 = new Inventory(trainer,trainer.getbag());
            }
        });
        pokecenter1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                trainer.regen();
                JFrame regen = new JFrame();
                JLabel text = new JLabel("All your pokemon has Been rest"); 
                text.setBounds(10,10,200,40);
                regen.add(text);
                regen.setSize(220,100);
                regen.setLayout(null);
                regen.setVisible(true);
            }
        });
        f.add(topic);
        f.add(mypoke);
        f.add(catchpoke);
        f.add(Inven);
        f.add(pokecenter);
        f.add(mypoke1);
        f.add(catchpoke1);
        f.add(Inven1);
        f.add(pokecenter1);
        f.setSize(320,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}