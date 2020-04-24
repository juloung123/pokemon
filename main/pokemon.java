package main;
import java.util.*;

import pokemonGUI.*;

public class pokemon {

    public static void main(String[] args){
        /*String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        Settingname = new nameground(true);
        name = scanner.next();
        Trainer rungame = new Trainer(name);*/
        nameground Settingname = new nameground(true);
        Trainer rungame = new Trainer(Settingname.getName());
        rungame.play();
        maingame mg = new maingame(rungame);

    }
}

