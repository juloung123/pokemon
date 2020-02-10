package Pokeball;
import Item.*;

public class Pokeball extends Item{
        public Pokeball(int id,String Pokeball,int amount){
            super(id,Pokeball,amount);
        }
        public void print(){
            System.out.println("Use Pokeball to catch Pokemon"+getAmount());
        }
}