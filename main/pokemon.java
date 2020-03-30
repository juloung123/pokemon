package main;
import java.util.*;
import Pokemon.*;
import Basicpoke.basicpoke;
import bag.*;

public class pokemon {

    public static void main(String[] args){
        int i = 0 ;
        String name;
        boolean event = true;
        Bag bag = new Bag();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = scanner.next();
        System.out.println("Welcome to Pokemon World " + name);
        System.out.println("Let select your Starter Poke !!");
        System.out.printf("1.Bulbasaur\n2.Charmander\n3.Squirtle\n4.Pikachu\n>");
        int selected = scanner.nextInt();
        if(selected == 1){
            Bulbasaur pokemonNo1 = new Bulbasaur();
        }
        else if(selected == 2){
            Charmander pokemonNo1 = new Charmander();
        }
        else if(selected == 3){
            Squirtle pokemonNo1 = new Squirtle();
        }
        else if(selected == 4){
            Pikachu pokemonNo1 = new Pikachu();
        }
    }
}

