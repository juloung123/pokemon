package Pokemon;
import Basicpoke.basicpoke;

public class Pikachu extends basicpoke{
    public Pikachu(String name){
        super(name);
        Race = "Pikachu";
        type = "Electric";
        hp = ((int)(Math.random()* 15)) + 30;
        sp = ((int)(Math.random() * 3)) + 10;
        atk = ((int)(Math.random() * 20)) + 40;
        def = ((int)(Math.random() * 8)) + 10;
        skill = ((int)(Math.random() * 20)) + 60;
        level = 1;
        exp = 0;
        MaxHp = hp;
        Maxsp = sp;
    }
}