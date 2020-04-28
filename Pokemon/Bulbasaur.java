package Pokemon;
import Basicpoke.basicpoke;


public class Bulbasaur extends basicpoke{
    public Bulbasaur(String name)
    {
        super(name);
        Race = "Bulbasaur";
        type = "Grass";
        hp = ((int)(Math.random()* 10)) + 35;
        sp = ((int)(Math.random()* 3)) + 10;
        atk = ((int)(Math.random()* 15)) + 25;
        def = ((int)(Math.random()* 20)) + 10;
        skill = ((int)(Math.random()* 15)) + 40;
        level = 1;
        exp = 0;
        MaxHp = hp;
        Maxsp = sp;
    }
}
