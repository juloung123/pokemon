package main;
import java.util.*;
import Pokemon.*;
/*class basicpoke{
    public int hp;
    public int sp;
    public int atk = 0;
    public int def = 0;
    public int skill1 = 0;
    public int skill2 = 0;
    public int level = 0;
}*/

public class pokemon {
    public static void main(String[] args){
        int i = 0 ;
        Scanner scanner = new Scanner(System.in);
        basicpoke p = new Bulbasaur();
        System.out.println("Let select your Starter Poke !!");
        System.out.printf("1.Bulbasaur\n2.Charmander\n3.Squirtle\n4.Pikachu\n>");
        int selected = scanner.nextInt();
        System.out.println(p.hp);
    }
}

