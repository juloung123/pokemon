package Item;

public class Berries extends Item{
        public Berries(int id,String Berries,int amount){
            super(id,Berries,amount);
        }
        public void print(){
            System.out.println("use to level up your pokemon"+getAmount());
        }
}