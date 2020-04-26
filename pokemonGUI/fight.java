package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import Basicpoke.*;
import main.Trainer;

import java.awt.event.*;
import java.awt.*;

public class fight extends JFrame{
    JFrame j;
    boolean isWin;
    public fight(Trainer trainer,basicpoke mypokemon,basicpoke wildpokemon){
        j = new JFrame("Fight");
        isWin = false;
        JButton normal = new JButton("Normal Attack");
        JButton skill = new JButton("Skill Attack");
        normal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                isWin = trainer.normalattack(mypokemon,wildpokemon);
                if(mypokemon.getHp() == 0 && isWin == false){
                    JLabel cant = new JLabel("Your pokemon can't fight anymore");
                    if(trainer.cheackhavereadypoke(trainer.getpokebag()) == true){
                        mypokeoncatch T1 = new mypokeoncatch(trainer, wildpokemon);
                    }
                    else{
                        JFrame youlose = new JFrame();
                        JLabel lose = new JLabel("You lose !");
                        lose.setBounds(0,0,200,100);
                        youlose.add(lose);
                        youlose.setLayout(null);
                        youlose.setSize(400,300);
                        youlose.setVisible(true);
                    }
                    cant.setBounds(0,0,200,100);
                    j.add(cant);
                }
                else if(wildpokemon.getHp() == 0){
                    isWin = true;
                    JFrame youwin = new JFrame();
                    Font font1 = new Font("Courier", Font.BOLD,24);
                    JLabel win = new JLabel("enemy can't fight anymore");
                    mypokemon.afterfight(trainer.getbag());
                    win.setBounds(0,0,400,100);
                    youwin.add(win);
                    win.setFont(font1);
                    youwin.setLayout(null);
                    youwin.setSize(400,300);
                    youwin.setVisible(true);
                    action T10 = new action(trainer,mypokemon,wildpokemon);
                }
                else{
                    action T2 = new action(trainer,mypokemon,wildpokemon);
                }
                j.setVisible(false);
            }
        });
        skill.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(mypokemon.getSp() > 5 ){
                    isWin = trainer.skillattack(mypokemon,wildpokemon);
                    if(mypokemon.getHp() == 0 && isWin == false){
                    JLabel cant = new JLabel("Your pokemon can't fight anymore");
                    if(trainer.cheackhavereadypoke(trainer.getpokebag()) == true){
                        mypokeoncatch T1 = new mypokeoncatch(trainer, wildpokemon);
                    }
                    else{
                        JFrame youlose = new JFrame();
                        JLabel lose = new JLabel("You lose !");
                        lose.setBounds(0,0,200,100);
                        youlose.add(lose);
                        youlose.setLayout(null);
                        youlose.setSize(400,300);
                        youlose.setVisible(true);
                    }
                    cant.setBounds(0,0,200,100);
                    j.add(cant);
                    }
                    else if(wildpokemon.getHp() == 0){
                        isWin = true;
                        JFrame youwin = new JFrame();
                        Font font1 = new Font("Courier", Font.BOLD,24);
                        JLabel win = new JLabel("enemy can't fight anymore");
                        mypokemon.afterfight(trainer.getbag());
                        win.setBounds(0,0,400,100);
                        youwin.add(win);
                        win.setFont(font1);
                        youwin.setLayout(null);
                        youwin.setSize(400,300);
                        youwin.setVisible(true);
                        action T10 = new action(trainer,mypokemon,wildpokemon);
                    }
                    else{
                        action T2 = new action(trainer,mypokemon,wildpokemon);
                    }
                    j.setVisible(false);
                }
            }
        });
        normal.setBounds(0,0,200,100);
        skill.setBounds(200,0,200,100);
        j.add(normal);
        j.add(skill);
        j.setSize(410,135);
        j.setLayout(null);
        j.setVisible(true);
    }
}