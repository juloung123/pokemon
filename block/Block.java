package block;

public class Block{
    public int Block_input(int attack,int damage){
        int damage_block = damage - (int)((float)attack*0.7);
        if(damage_block <= 0){
            return 0;
        }
        else{
            return damage_block;
        }
    }
}
//ดาเมจจากการบล็อคแล้วศัตรูโจมตี