package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import main.Trainer;
import java.awt.event.*;

public class Lobby extends JFrame{
    private JFrame f;
    public Lobby(Trainer trainer){
        try{
            f = new JFrame("Lobby");
            ImageIcon img = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/Lobby.jpg");
            JLabel background = new JLabel("",img,JLabel.CENTER);
            JButton mypoke1 = new JButton("My pokemon");
            JButton catchpoke1 = new JButton("Catch Pokemon");
            JButton Inven1 = new JButton("My Inventory");
            JButton pokecenter1 = new JButton("Pokemon Center");
            background.setBounds(0, 0,1600,900);
            mypoke1.setBounds(580,600,200,40);
            catchpoke1.setBounds(1050,500,200,40);
            Inven1.setBounds(830,600,200,40);
            pokecenter1.setBounds(710,390,200,40);
            mypoke1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    mypokemon T4 = new mypokemon(trainer);
                }
            });
            catchpoke1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Catchpokemon T7 = new Catchpokemon(trainer);
                    f.setVisible(false);
                }
            });
            Inven1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Inventory T8 = new Inventory(trainer,trainer.getbag());
                }
            });
            pokecenter1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    pokemoncenter T9 = new pokemoncenter(trainer);
                    f.setVisible(false);
                }
            });
            f.setLocation(150,100);
            f.add(mypoke1);
            f.add(catchpoke1);
            f.add(Inven1);
            f.add(pokecenter1);
            f.add(background);
            f.setSize(1600,900);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }catch(Exception e){
            System.out.println("Something wrong in Lobby class");
        }
    }
}