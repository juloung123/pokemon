package bag;
import java.util.*;

import Basicpoke.basicpoke;
import Item.*;
/*import Pokeball.*;
import hppotion.*;
import Berry.*;
import sppotion.*;*/

public class Bag{
    private ArrayList<Item> items;

    public Bag(){
        items = new ArrayList<Item>();
    }
    public void addItem(int pokeball,int hppo,int berry,int sppo){
        for(int i=0 ; i < pokeball ; i++){
            items.add(new Pokeball(0,"Pokeball"));
        }
        for(int i=0 ; i < hppo ; i++){
            items.add(new HpPotion(1,"HpPotion"));
        }
        for(int i=0 ; i < berry ;i++){
            items.add(new Berries(2,"Berries"));
        }
        for(int i=0 ; i < sppo ; i++){
            items.add(new SpPotion(3,"SpPotion"));
        }
    }
    public ArrayList<Item> getitem(){
        return items;
    }
    public void Ball(){
        Item a0 = new Pokeball(0,"Pokeball");
        items.add(a0);
    }
    public void hppo(){
        Item a1 = new HpPotion(1,"HpPotion");
        items.add(a1);
    }
    public void berry(){
        Item a2 = new Berries(2,"Berries");
        items.add(a2);
    }
    public void sppo(){
        Item a3 = new SpPotion(3,"SpPotion");
        items.add(a3);
    }
    public boolean useball(basicpoke pokemons){
        for(Item i : items){
            if(i.getID() == 0){
                items.remove(i);
                int pokemonran = (int)(Math.random()*10000);
                if(pokemons.getHp() >= (pokemons.getMaxHp()*0.8) && pokemons.getHp() <= pokemons.getMaxHp()){
                    if(pokemonran < 2000){
                        System.out.println("Catch with pokeball complete");
                        return true;
                    }
                    else{
                        System.out.println("Failed to catch");
                        return false;
                    }
                }
                else if(pokemons.getHp() >= (pokemons.getMaxHp()*0.6) && pokemons.getHp() < (pokemons.getMaxHp()*0.8)){
                    if(pokemonran < 4000){
                        System.out.println("Catch with pokeball complete");
                        return true;
                    }
                    else{
                        System.out.println("Failed to catch");
                        return false;
                    }
                }
                else if(pokemons.getHp() >= (pokemons.getMaxHp()*0.4) && pokemons.getHp() < (pokemons.getMaxHp()*0.6)){
                    if(pokemonran < 6000){
                        System.out.println("Catch with pokeball complete");
                        return true;
                    }
                    else{
                        System.out.println("Failed to catch");
                        return false;
                    }
                }
                else if(pokemons.getHp() >= (pokemons.getMaxHp()*0.2) && pokemons.getHp() < (pokemons.getMaxHp()*0.4)){
                    if(pokemonran < 8000){
                        System.out.println("Catch with pokeball complete");
                        return true;
                    }
                    else{
                        System.out.println("Failed to catch");
                        return false;
                    }
                }  
                else if(pokemons.getHp() == 0){
                    return true;
                }
                else{
                    if(pokemonran < 9000){
                        return true;
                    }
                }
                break;
            }
        }
        return false;
    }
    public void usehppo(basicpoke thepokemon,Bag bag){
        for(Item i : items){
            if(i.getID() == 1){    
                thepokemon.useallitem(1,50,bag);
                items.remove(i);
                break;
            }
        }
    }
    public void useberry(basicpoke thepokemon,Bag bag){
        for(Item i : items){
            if(i.getID() == 2){
                thepokemon.useallitem(2,100,bag);
                items.remove(i);
                break;
            }
        }
    }
    public void usesppo(basicpoke thepokemon,Bag bag){
        for(Item i : items){
            if(i.getID() == 3){
                thepokemon.useallitem(3,5,bag);
                items.remove(i);
                break;
            }
        }
    }
    public void showitem(){
        int ball=0;
        int hp=0;
        int berry=0;
        int sp=0;
        for (Item number : items) {
            if(number.getID() == 0){
                ++ball;
            }
            else if(number.getID() == 1){
                ++hp;
            }
            else if(number.getID() == 2){
                ++berry;
            }
            else if(number.getID() == 3){
                ++sp;
            }
        }
        System.out.println("No.1 : Pokeball = " + ball);
        System.out.println("No.2 : Hppotion = " + hp);
        System.out.println("No.3 : berry = " + berry);
        System.out.println("No.4 : sppotion = " + sp);
    }
    public boolean empty(){
        return items.isEmpty();
    }
    public boolean checkbag(int item){
        for(Item number : items){
            if(number.getID() == item){
                return true;
            }
        }
        return false;
    }
}