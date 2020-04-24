package pokemonGUI;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class nameground extends JFrame implements ActionListener{
    private JTextField name;
    private JFrame f;
    public nameground(boolean select){//ถ้าเป็น true เลือกใส่มนุษย์ false เลือกใส่ โปเกม่อน
        Container c = getContentPane();
        f = new JFrame("Name");
        JLabel detail = new JLabel("Enter your name");
        JLabel detail1 = new JLabel("Enter your pokemon name");
        JButton b = new JButton("Let's Go");
        name = new JTextField();
        detail.setBounds(150,90,100,30);
        detail1.setBounds(120,90,150,30);
        name.setBounds(100,130,200,30);
        b.setBounds(150,180,100,30);
        if(select == true){
            f.add(detail);
        }
        else if(select == false){
            f.add(detail1);
        }
        b.addActionListener(this);
        f.add(b);
        f.add(name);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        f.setVisible(false);
        select test = new select();
    }
    public String getName(){
        return name.getText();
    }
}