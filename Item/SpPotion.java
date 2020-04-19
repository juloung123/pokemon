package Item;

public class SpPotion extends Item{
        public SpPotion(int id,String SpPotion,int amount){
            super(id,SpPotion,amount);
        }
        public void print(){
            System.out.println("use to regen Sp pokeman"+getAmount());
        }
}