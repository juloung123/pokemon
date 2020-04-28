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

public class action extends JFrame{
    private JFrame f;
    JPanel myhelthbar,wildhelthbar;
    JProgressBar myhelth,wildhelth;
    public action(Trainer trainer,basicpoke mypokemon,basicpoke wildpokemon){
        try{
            Font font = new Font("Courier", Font.BOLD,48);
            Font font1 = new Font("Courier", Font.BOLD,24);
            ImageIcon imgnormal = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/background.png");
            ImageIcon imgBulvsBul = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/BulvsBul.png");
            ImageIcon imgBulvschar = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/Bulvschar.png");
            ImageIcon imgBulvspik = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/Bulvspik.png");
            ImageIcon imgBulvssquirtle = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/Bulvssquirtle.png");
            ImageIcon imgcharvsbul = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/charvsbul.png");
            ImageIcon imgcharvschar = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/charvschar.png");
            ImageIcon imgcharvspik = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/charvspik.png");
            ImageIcon imgcharvssquir = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/charvssquir.png");
            ImageIcon imgpikvsbul = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/pikvsbul.png");
            ImageIcon imgpikvschar = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/pikvschar.png");
            ImageIcon imgpikvspik = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/pikvspik.png");
            ImageIcon imgpikvssquir = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/pikvssquir.png");
            ImageIcon imgsquirvsbul = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/squirvsbul.png");
            ImageIcon imgsquirvschar = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/squirvschar.png");
            ImageIcon imgsquirvspik = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/squirvspik.png");
            ImageIcon imgsquirvssquir = new ImageIcon("C:/Users/BlazeR/Desktop/pokemon/pokemonGUI/pokemonpic/complete/squirvssquir.png");

            myhelthbar = new JPanel();
            myhelthbar.setBounds(900,500,350,25);
            myhelthbar.setBackground(Color.BLACK);
            wildhelthbar = new JPanel();
            wildhelthbar.setBounds(100,180,350,25);
            wildhelthbar.setBackground(Color.BLACK);
            myhelth = new JProgressBar(0,mypokemon.getMaxHp());
            myhelth.setPreferredSize(new Dimension(350,25));
            myhelthbar.add(myhelth);
            wildhelth = new JProgressBar(0,wildpokemon.getMaxHp());
            wildhelth.setPreferredSize(new Dimension(350,25));
            wildhelthbar.add(wildhelth);
            myhelth.setValue(mypokemon.getHp());
            wildhelth.setValue(wildpokemon.getHp());

            f = new JFrame("action");
            JPanel describe = new JPanel();
            describe.setBounds(80,120,400,100);
            describe.setBackground(Color.lightGray);
            JPanel describe2 = new JPanel();
            describe2.setBounds(875,400,405,200);
            describe2.setBackground(Color.lightGray);
            JLabel topic = new JLabel("What will ");
            JLabel topic1 = new JLabel(mypokemon.getName() + " do ?");
            JButton fight1 = new JButton("Fight");
            JButton mybag1 = new JButton("Bag");
            JButton mypo1 = new JButton("Pokemon");
            JButton run1 = new JButton("Run");
            JLabel background;
            JLabel myLv = new JLabel("Lv" + mypokemon.getLv()); //******************************************* */
            JLabel wildLv = new JLabel("Lv" + wildpokemon.getLv());
            JLabel myname = new JLabel(mypokemon.getName());
            JLabel wildname = new JLabel(wildpokemon.getName());
            JLabel myHp = new JLabel(mypokemon.getHp() + "/" + mypokemon.getMaxHp()); //**************************************** */
            if(mypokemon.getRace() == "Bulbasaur" && wildpokemon.getRace() == "Bulbasaur"){
                background = new JLabel("",imgBulvsBul,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Bulbasaur" && wildpokemon.getRace() == "Charmander"){
                background = new JLabel("",imgBulvschar,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Bulbasaur" && wildpokemon.getRace() == "Pikachu"){
                background = new JLabel("",imgBulvspik,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Bulbasaur" && wildpokemon.getRace() == "Squirtle"){
                background = new JLabel("",imgBulvssquirtle,JLabel.CENTER);
            }
            else if(mypokemon.getRace() == "Charmander" && wildpokemon.getRace() == "Bulbasaur"){
                background = new JLabel("",imgcharvsbul,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Charmander" && wildpokemon.getRace() == "Charmander"){
                background = new JLabel("",imgcharvschar,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Charmander" && wildpokemon.getRace() == "Pikachu"){
                background = new JLabel("",imgcharvspik,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Charmander" && wildpokemon.getRace() == "Squirtle"){
                background = new JLabel("",imgcharvssquir,JLabel.CENTER);
            }  
            else if(mypokemon.getRace() == "Pikachu" && wildpokemon.getRace() == "Bulbasaur"){
                background = new JLabel("",imgpikvsbul,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Pikachu" && wildpokemon.getRace() == "Charmander"){
                background = new JLabel("",imgpikvschar,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Pikachu" && wildpokemon.getRace() == "Pikachu"){
                background = new JLabel("",imgpikvspik,JLabel.CENTER);
            } 
            else if(mypokemon.getRace() == "Pikachu" && wildpokemon.getRace() == "Squirtle"){
                background = new JLabel("",imgpikvssquir,JLabel.CENTER);
            }
            else if(mypokemon.getRace() == "Squirtle" && wildpokemon.getRace() == "Bulbasaur"){
                background = new JLabel("",imgsquirvsbul,JLabel.CENTER);
            }
            else if(mypokemon.getRace() == "Squirtle" && wildpokemon.getRace() == "Charmander"){
                background = new JLabel("",imgsquirvschar,JLabel.CENTER);
            }
            else if(mypokemon.getRace() == "Squirtle" && wildpokemon.getRace() == "Pikachu"){
                background = new JLabel("",imgsquirvspik,JLabel.CENTER);
            }
            else if(mypokemon.getRace() == "Squirtle" && wildpokemon.getRace() == "Squirtle"){
                background = new JLabel("",imgsquirvssquir,JLabel.CENTER);
            }
            else{
                background = new JLabel("",imgnormal,JLabel.CENTER);
            }
                if(wildpokemon.getHp() != 0){
                    fight1.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            f.setVisible(false);
                            fight T1 = new fight(trainer,mypokemon,wildpokemon);
                        }
                    }); 
                }
                mybag1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        invenincatch T2 = new invenincatch(trainer,mypokemon,wildpokemon);
                        f.setVisible(false);
                    }
                });
                mypo1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        mypokeoncatch T7 = new mypokeoncatch(trainer,wildpokemon);
                        f.setVisible(false);
                    }
                });
                run1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        f.setVisible(false);
                        Lobby T1 = new Lobby(trainer);
                    }
                });
            
            /*layeredPane.setPreferredSize(new Dimension(1280, 720));
            layeredPane.add(background, new Integer(100));
            layeredPane.add(myLv, new Integer(200));
            layeredPane.add(wildLv, new Integer(200));
            layeredPane.add(myHp, new Integer(200));
            layeredPane.add(myname, new Integer(200));
            f.add(layeredPane); */
            
        
            fight1.setFont(font1);
            mybag1.setFont(font1);
            mypo1.setFont(font1);
            run1.setFont(font1);
            topic.setFont(font);
            topic1.setFont(font);
            myLv.setFont(font1);
            wildLv.setFont(font1);
            myHp.setFont(font1);
            myname.setFont(font1);
            wildname.setFont(font1);
            topic1.setBounds(20,800,800,100);
            topic.setBounds(20,725,800,100);
            background.setBounds(0,0,1280,720);
            myLv.setBounds(1200,400,200,100);/****************** */
            wildLv.setBounds(400,100,200,100);
            myname.setBounds(900,400,200,100);
            wildname.setBounds(100,100,200,100);
            myHp.setBounds(1100,500,200,100);//******************* */ 
            fight1.setBounds(625,725,300,100);
            mybag1.setBounds(975,725,300,100);
            mypo1.setBounds(625,850,300,100);
            run1.setBounds(975,850,300,100);
            
            f.add(topic1);
            f.setLocation(300,0);
            f.add(myLv);//
            f.add(wildLv);
            f.add(myHp);
            f.add(myname);
            f.add(wildname);//
            f.add(myhelthbar);
            f.add(wildhelthbar);
            f.add(describe);
            f.add(describe2);
            f.add(topic);
            f.add(fight1);
            f.add(run1);
            f.add(mybag1);
            f.add(mypo1);
            f.add(background);
            f.setSize(1295,1000);
            f.setLayout(null);
            f.setVisible(true);
        }catch(Exception e){
            System.out.println("Something wrong in action class");
        }
    }

}