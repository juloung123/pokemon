package hppotion;
import Item.*;

public class HpPotion extends Item{
        public HpPotion(int id,String HpPotion,int amount){
            super(id,HpPotion,amount);
        }
        public void print(){
            System.out.println("use to regen Hp pokeman"+getAmount());
        }
}