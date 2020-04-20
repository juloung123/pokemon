package main;
import java.util.*;

public class pokemon {

    public static void main(String[] args){
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = scanner.next();
        Trainer rungame = new Trainer(name);
        rungame.play();
        scanner.close();
    }
}

