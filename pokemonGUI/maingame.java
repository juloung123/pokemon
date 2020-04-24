package pokemonGUI;

import javax.swing.*;
import main.Trainer;
import java.awt.*;
import java.awt.event.*;

public class maingame extends JFrame{
    private Trainer trainer;
    private nameground Settingname;
    public maingame(Trainer trainer){
        super("Pokemon red chinese");
        this.trainer = trainer;
        Container c = getContentPane();
        c.add(Settingname);
        setSize(1280,1024);
        setVisible(true);
    }
}
