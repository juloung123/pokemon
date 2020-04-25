package pokemonGUI;

import javax.swing.*;
import main.Trainer;
import java.awt.*;
import java.awt.event.*;

public class maingame extends JFrame{
    private Trainer trainer;
    private select poke;
    public maingame(Trainer trainer){
        super("Pokemon red chinese");
        this.trainer = trainer;
        Container c = getContentPane();
        
        c.add(poke);
        setSize(1280,1024);
        setVisible(true);
    }
}
