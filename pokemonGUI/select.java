package pokemonGUI;

import main.Trainer;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class select extends JFrame {
    private JFrame f;

    public select(){
        JLabel pik,cha,squir,bul,detailpik,detailsquir,detailchar,detailbul;
        f = new JFrame("Select your first pokemon");
        ImageIcon pikachu = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/pikachu_1.png");
        ImageIcon charmander = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/charmander_1.png");
        ImageIcon squirtle = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/squirtle_1.png");
        ImageIcon Bulbasaur = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/bulbasaur_1.png");
        detailpik = new JLabel("Pikachu");
        detailsquir = new JLabel("Squirtle");
        detailchar = new JLabel("Charmander");
        detailbul = new JLabel("Bulbasaur");
        pik = new JLabel(pikachu);
        cha = new JLabel(charmander);
        squir = new JLabel(squirtle);
        bul = new JLabel(Bulbasaur);
        detailpik.setBounds(80,20,60,80);
        detailchar.setBounds(265,20,100,80);
        detailsquir.setBounds(465,20,60,80);
        detailbul.setBounds(660,20,60,80);
        pik.setBounds(20,80,175,300);
        cha.setBounds(215,80,175,300);
        squir.setBounds(410,80,175,300);
        bul.setBounds(605,80,175,300);
        f.add(detailpik);
        f.add(detailsquir);
        f.add(detailchar);
        f.add(detailbul);
        f.add(pik);
        f.add(cha);
        f.add(squir);
        f.add(bul);
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
    } 
}