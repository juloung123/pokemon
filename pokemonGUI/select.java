package pokemonGUI;

import main.Trainer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;



public class select extends JFrame{
    private JFrame f;
    private JButton pick1,pick2,pick3,pick4;
    private int selecter;
    public select(Trainer trainer){
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
        pick1 = new JButton("Select");
        pick2 = new JButton("Select");
        pick3 = new JButton("Select");
        pick4 = new JButton("Select");
        pick1.setBounds(50,400,120,80);
        pick2.setBounds(230,400,120,80);
        pick3.setBounds(440,400,120,80);
        pick4.setBounds(620,400,120,80);
        detailpik.setBounds(80,20,60,80);
        detailchar.setBounds(265,20,100,80);
        detailsquir.setBounds(465,20,80,80);
        detailbul.setBounds(660,20,60,80);
        pik.setBounds(20,80,175,300);
        cha.setBounds(215,80,175,300);
        squir.setBounds(410,80,175,300);
        bul.setBounds(605,80,175,300);
        pick1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //selecter = 1;
                f.setVisible(false);
                namepokemonground T2 = new namepokemonground(trainer,1);
            }
        });
        pick2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //selecter = 2;
                f.setVisible(false);
                namepokemonground T2 = new namepokemonground(trainer,2);
            }
        });
        pick3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //selecter = 3;
                f.setVisible(false);
                namepokemonground T2 = new namepokemonground(trainer,3);
            }
        });
        pick4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //selecter = 4;
                f.setVisible(false);
                namepokemonground T2 = new namepokemonground(trainer,4);
            }
        });
        f.add(pick1);
        f.add(pick2);
        f.add(pick3);
        f.add(pick4);
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
    public int selected(){
        return selecter;      
    }
}