package main;
import java.util.*;

import pokemonGUI.maingame;

public class pokemon {

    public static void main(String[] args){
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = scanner.next();
        Trainer rungame = new Trainer(name);
        maingame mg = new maingame(rungame);
        
        //rungame.play();
        scanner.close();
    }
}

