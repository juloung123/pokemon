package bag;
import java.util.*;
import Item.*;
import Pokeball.*;
import hppotion.*;
import Berry.*;
import sppotion.*;

public class Bag{
    public ArrayList<Item> items;

    public Bag(){
        items = new ArrayList<Item>();
    }
    public void addItem(){
        items.add(new Item(0,"Pokeball",5));
        items.add(new Item(1,"HpPotion",5));
        items.add(new Item(2,"Berries",5));
        items.add(new Item(3,"SpPotion",5));
    }
    public void Ball(){
        Item a0 = new Pokeball(0,"Pokeball",1);
        items.add(a0);
    }
    public void hppo(){
        Item a1 = new HpPotion(1,"HpPotion",1);
        items.add(a1);
    }
    public void berry(){
        Item a2 = new Berries(1,"Berries",1);
        items.add(a2);
    }
    public void sppo(){
        Item a3 = new SpPotion(1,"SpPotion",1);
        items.add(a3);
    }
    public void showitem(){
        int i=0;
        for (Item number : items) {
            System.out.println(items.get(i).getName()+ "   amount  " + items.get(i).getAmount());
            i++;
        }
    }
    public boolean empty(){
        return items.isEmpty();
    }
}