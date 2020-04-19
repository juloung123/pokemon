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
            System.out.println("2 . Catch pokemon");
            System.out.println("3 . INVENTORY");
            System.out.println("4 . Go to pokemon center");
            System.out.println("5 . End game  or another");
            System.out.println("==========================");
            // event bar
            System.out.print("select Event :");
            Enter = scanner.nextInt();
            //condition
            if(Enter == 1){
                status();
            }
            /*else if(Enter == 2){
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
            }*/
            else{
                event = false; //End game
            }
        }
    }
    public void status(){
        int i=1;
        for(basicpoke p:pokemonbag){
            System.out.print("No :" + i);
            p.status();
            i++;
        }
    }
    public void catchpokemon(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<basicpoke> pokemons = new ArrayList<basicpoke>();
        int pokemonran = (int)(Math.random()*5 + 1);
        for(int i=0; i < pokemonran; i++){
            int type = (int)(Math.random()*4);
            if(type == 0){
                pokemons.add(new Bulbasaur("Wild Bulbasaur"));
            }
            else if(type == 1){
                pokemons.add(new Squirtle("Wild Squirtle"));
            }
            else if(type == 2){
                pokemons.add(new Charmander("Wild Chamander"));
            }
            else if(type == 3){
                pokemons.add(new Pikachu("Wild Pikachu"));    
            }
        }

        System.out.println("Pokemon around you");
        int no=1;
        int sec;
        for(basicpoke p : pokemons){
            System.out.println("No. " + no + ":" + p.getName());
            no++;
        }

        System.out.println("catch No.:");
        no = scanner.nextInt();
        basicpoke wildpokemon = pokemons.get(no-1);
        
        currentPokemon(pokemonbag);
        System.out.println("Select your pokemon to fight");
        sec = scanner.nextInt();
        basicpoke myPokemon = pokemonbag.get(sec-1);

        boolean isWin = false;
        do{
            myPokemon.attack(wildpokemon);
            if(wildpokemon.getHp() == 0){
                isWin = true;
                break;
            }
            else{
                wildpokemon.attack(myPokemon);
                if(myPokemon.getHp() == 0){
                    isWin = false;
                    break;
                }
            }
        }while(true);
        if(isWin){
            System.out.println("Catch complete");
            pokemonbag.add(pokemons.get(sec));
        }
        else{
            System.out.println(wildpokemon.getName() + "Win");
        }
    }
    public void currentPokemon(ArrayList<basicpoke> Pokemono){
        int i = 1;
        for(basicpoke p : Pokemono){
            System.out.print("No. " + i + p.getName() + "Hp : " + p.getHp());
            i++;
        }
    }
    //method สร้างทางเลือกแอ็คชั่น
    /*public void actioncatchpokemon(){

    }*/
}

//method ด้านล่างคือตัวเดินเกมและปรับแต่งตรงตัว pokemon ให้มาเราเป็น method ในนี้แทน
