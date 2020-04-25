package pokemonGUI;

import main.Trainer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import Basicpoke.*;

public class infopoke extends JFrame{
    private JFrame j;

    public infopoke(basicpoke b){
        j = new JFrame("info");
        JButton change = new JButton("Change");
        JLabel name = new JLabel("Name : " + b.getName());
        JLabel Race = new JLabel("Race : " + b.getRace());
        JLabel type = new JLabel("type : " + b.gettype());
        JLabel level = new JLabel("Level : " + b.getLv());
        JLabel exp = new JLabel("Exp : " + b.getExp());
        JLabel hp = new JLabel("Hp : " + b.getHp() + "/" + b.getMaxHp());
        JLabel sp = new JLabel("SP : "+ b.getSp() + "/" + b.getMaxSp());
        JLabel def = new JLabel("Defence : " + b.getdef());
        JLabel atk = new JLabel("Attack Damage : " + b.getAttackDamage());
        JLabel skill = new JLabel("Skill Damage : "+ b.getMagicDamage());
        name.setBounds(20,10,150,40);
        change.setBounds(170,20,100,20);
        change.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                changename T7 = new changename(b);
                j.setVisible(false);
            }
        });
        Race.setBounds(20,50,150,40);
        type.setBounds(20,90,150,40);
        level.setBounds(20,130,150,40);
        exp.setBounds(20,170,150,40);
        hp.setBounds(20,210,150,40);
        sp.setBounds(20,250,150,40);
        def.setBounds(20,290,150,40);
        atk.setBounds(20,330,150,40);
        skill.setBounds(20,370,150,40);
        j.add(change);
        j.add(name);
        j.add(Race);
        j.add(type);
        j.add(level);
        j.add(exp);
        j.add(hp);
        j.add(sp);
        j.add(def);
        j.add(atk);
        j.add(skill);
        j.setSize(320,450);
        j.setLayout(null);
        j.setVisible(true);
    }
}