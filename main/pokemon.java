package main;
import java.util.*;
import Pokemon.*;
import Basicpoke.basicpoke;
import bag.*;

public class pokemon {

    public static void main(String[] args){
        /*int Enter;
        String name;
        String pokemon1;
        boolean event = true;
        Bag bag = new Bag();*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = scanner.next();
        /*System.out.print("Enter your first pokemon name :");
        pokemon1 = scanner.next();
        System.out.println("Welcome to Pokemon World " + name);
        System.out.println("Let select your Starter Poke !!");
        System.out.printf("1.Bulbasaur\n2.Charmander\n3.Squirtle\n4.Pikachu\n>");
        int selected = scanner.nextInt();*/
        if(selected == 1){
            basicpoke pokemonNo1 = new Bulbasaur();
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
        else if(selected == 2){
            basicpoke pokemonNo1 = new Charmander();
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
        else if(selected == 3){
            basicpoke pokemonNo1 = new Squirtle();
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
        else if(selected == 4){
            basicpoke pokemonNo1 = new Pikachu();
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
}

