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
        JButton mypoke1 = new JButton("Select");
        JButton catchpoke1 = new JButton("Select");
        JButton Inven1 = new JButton("Select");
        JButton pokecenter1 = new JButton("Select");
        JLabel mypoke = new JLabel("My Pokemon");
        JLabel catchpoke = new JLabel("Catch Pokemon");
        JLabel Inven = new JLabel("My Inventory");
        JLabel pokecenter = new JLabel("Go to pokemon Center");
        mypoke.setBounds(30,80,100,40);
        catchpoke.setBounds(30,120,100,40);
        Inven.setBounds(30,160,100,40);
        pokecenter.setBounds(30,200,140,40);
        mypoke1.setBounds(180,80,100,40);
        catchpoke1.setBounds(180,120,100,40);
        Inven1.setBounds(180,160,100,40);
        pokecenter1.setBounds(180,200,100,40);
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
    }
}