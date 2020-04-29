package Pokemon;
import Basicpoke.basicpoke;

public class Charmander extends basicpoke{
    public Charmander(String name){
        super(name);
        Race = "Charmander";
        type = "Fire";
        hp = ((int)(Math.random()* 9)) + 30;
        sp = ((int)(Math.random()* 3)) + 8;
        atk = ((int)(Math.random()* 10)) + 32;
        def = ((int)(Math.random()* 8)) + 10;
        skill = ((int)(Math.random()* 10)) + 50;
        level = 1;
        exp = 0;
        MaxHp = hp;
        Maxsp = sp;
    }
}