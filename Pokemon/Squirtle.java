package Pokemon;
import Basicpoke.basicpoke;

public class Squirtle extends basicpoke{
    public Squirtle(String name){
        super(name);
        Race = "Squirtle";
        type = "Water";
        hp = ((int)(Math.random()* 9)) + 35;
        sp = ((int)(Math.random()* 3)) + 10;
        atk = ((int)(Math.random()* 13)) + 25;
        def = ((int)(Math.random()* 15)) + 10;
        skill = ((int)(Math.random()* 4)) + 48;
        level = 1;
        exp = 0;
        MaxHp = hp;
        Maxsp = sp;
    }
}