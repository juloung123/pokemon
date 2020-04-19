package main;
import java.util.*;
import Pokemon.*;
import Basicpoke.*;
import bag.*;

public class Trainer{
    private String name;
    private ArrayList<basicpoke> pokemonbag;
    public boolean event;
    public Bag bag;

    public Trainer(String name){
        pokemonbag = new ArrayList<basicpoke>();
        event = true;
        bag = new Bag();
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public String toString(){
        return name;
    }

    public void firstselect(int firstpokemon,String name){
        if(firstpokemon == 1){
            pokemonbag.add(new Bulbasaur(name));
        }
        else if(firstpokemon == 2){
            pokemonbag.add(new Charmander(name));
        }
        else if(firstpokemon == 3){
            pokemonbag.add(new Squirtle(name));
        }
        else if(firstpokemon == 4){
            pokemonbag.add(new Pikachu(name)); 
        }
    }
    public void play(){
        int Enter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pokemon World " + getname());
        System.out.println("Let select your Starter Poke !!");
        System.out.printf("1.Bulbasaur\n2.Charmander\n3.Squirtle\n4.Pikachu\n>");
        int selected = scanner.nextInt();
        System.out.print("Enter your first pokemon name :");
        String pokemon1 = scanner.next();
        firstselect(selected,pokemon1);
        while(event == true){
            System.out.println("==========================");
            System.out.println("1 . STATUS");
            System.out.println("2 . HIT MONSTER");
            System.out.println("3 . INVENTORY");
            System.out.println("4 . Go to pokemon center");
            System.out.println("5 . End game  or another");
            System.out.println("==========================");
            // event bar
            System.out.print("select Event :");
            Enter = scanner.nextInt();
            //condition
            if(Enter == 1){
                pokemonNo1.status(pokemon1);
            }
            else if(Enter == 2){
                pokemonNo1.hitMonster(bag);
            }
            else if(Enter == 3){
                if(bag.empty() == true){
                    System.out.println("Your bag is empty");
                }
                else{
                    bag.showitem();
                }
            }
            else if(Enter == 4){
                pokemonNo1.regenHp(pokemonNo1.getMaxHp());//regen
            }
            else{
                event = false; //End game
            }
        }
    }
}

//method ด้านล่างคือตัวเดินเกมและปรับแต่งตรงตัว pokemon ให้มาเราเป็น method ในนี้แทน