package starter;
import java.util.*;

public class Starter{
    public void StarterSec(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let select your Starter Poke !!");
        System.out.printf("1.Bulbasaur\n2.Charmander\n3.Squirtle\n>");
        int selected = scanner.nextInt();
        int lvl = 1;
        if(selected == 1){
            int hp = 45;
            int sp = 10;
            int atk = 49;
            int def = 49;
            System.out.println("You select Bulbasaur !!!");
            System.out.println("Your Bulbasaur Status");
            System.out.println("HP = " + hp);
            System.out.println("SP = " + sp);
            System.out.println("Atk = " + atk);
            System.out.println("Def = " + def);
            System.out.println("Level = " + lvl);
        }
        else if(selected == 2){
            System.out.println("You select Charmander !!!");
        }
        else if(selected == 3){
            System.out.println("You select Squirtle !!!");
        }
        else{
            System.out.println("Just 1 2 and 3 !!!!");
        }
        scanner.close();
    }
}