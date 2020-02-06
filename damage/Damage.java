package damage;

public class Damage{
    public int Damage_input(int atkenemy,int def){
        int realdamage = atkenemy - def;
        if(realdamage <= 0){
            return 0;
        }
        else{
            return realdamage;
        }
    }
}
//ดาเมจจากการโจมตีศัตรูแล้วศัตรูตีกลับ