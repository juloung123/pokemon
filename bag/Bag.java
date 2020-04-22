package bag;
import java.util.*;

import Basicpoke.basicpoke;
import Item.*;
/*import Pokeball.*;
import hppotion.*;
import Berry.*;
import sppotion.*;*/

public class Bag{
    public ArrayList<Item> items;

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
    public void useball(){
        for(Item i : items){
            if(i.getID() == 0){
                items.remove(i);
                break;
            }
        }
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
}