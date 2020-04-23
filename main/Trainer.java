package main;
import java.util.*;
import Pokemon.*;
import Basicpoke.*;
import bag.*;

public class Trainer{
    private String name;
    private ArrayList<basicpoke> pokemonbag;
    private boolean event;
    private Bag bag;

    public Trainer(String name){
        pokemonbag = new ArrayList<basicpoke>();
        event = true;
        bag = new Bag();
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public String toString(){
        return name;
    }

    public void firstselect(int firstpokemon,String name){
        if(firstpokemon == 1){
            pokemonbag.add(new Bulbasaur(name));
        }
        else if(firstpokemon == 2){
            pokemonbag.add(new Charmander(name));
        }
        else if(firstpokemon == 3){
            pokemonbag.add(new Squirtle(name));
        }
        else if(firstpokemon == 4){
            pokemonbag.add(new Pikachu(name)); 
        }
    }
    public void play(){
        int Enter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pokemon World " + getname());
        System.out.println("Let select your Starter Poke !!");
        System.out.printf("1.Bulbasaur\n2.Charmander\n3.Squirtle\n4.Pikachu\n>");
        int selected = scanner.nextInt();
        System.out.print("Enter your first pokemon name :");
        String pokemon1 = scanner.next();
        firstselect(selected,pokemon1);
        while(event == true){
            System.out.println("==========================");
            System.out.println("1 . My pokemon");
            System.out.println("2 . Catch pokemon");
            System.out.println("3 . INVENTORY");
            System.out.println("4 . Go to pokemon center");
            System.out.println("5 . End game  or another");
            System.out.println("==========================");
            // event bar
            System.out.print("select Event :");
            Enter = scanner.nextInt();
            //condition
            if(Enter == 1){
                status();
            }
            else if(Enter == 2){
                if(cheackhavereadypoke(pokemonbag) == true){
                catchpokemon();
                }
            }
            else if(Enter == 3){
                if(bag.empty() == true){
                    System.out.println("Your bag is empty");
                }
                else{
                    bag.showitem();
                    System.out.println("No.-1 : to go back");
                    System.out.print("No:");
                    int select = scanner.nextInt();
                    useitem(select,false,pokemonbag.get(0));
                }
            }
            else if(Enter == 4){
                regen();//regen
            }
            else{
                event = false; //End game
            }
        }
    }
    public void status(){
        int i=1;
        for(basicpoke p:pokemonbag){
            System.out.println("==========================\nNo :" + i);
            p.status();
            System.out.println("==========================");
            i++;
        }
    }
    public boolean useitem(int select,boolean pokeball,basicpoke pokemonsolo){
        if(select == 1 && pokeball == true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("You want to use pokeball ?");
            System.out.print("YES press 1 or No press 2 : ");
            int sec = scanner.nextInt();
            if(sec == 1){
                return bag.useball(pokemonsolo);
            }
        }
        if(select == 1){
            System.out.println("this Item use to catch pokemon");
        }
        else if(select == 2){
            Scanner scanner = new Scanner(System.in);
            basicpoke mypokemon;
            System.out.println("use HpPotion to ");
            currentPokemon(pokemonbag);
            System.out.print("No:");
            int sec = scanner.nextInt();
            mypokemon = pokemonbag.get(sec-1);
            bag.usehppo(mypokemon,bag);
            
        }
        else if(select == 3){
            Scanner scanner = new Scanner(System.in);
            basicpoke mypokemon;
            System.out.println("use Berry to ");
            currentPokemon(pokemonbag);
            System.out.print("No:");
            int sec = scanner.nextInt();
            mypokemon = pokemonbag.get(sec-1);
            bag.useberry(mypokemon,bag);
            
        }
        else if(select == 4){
            Scanner scanner = new Scanner(System.in);
            basicpoke mypokemon;
            System.out.println("use Berry to ");
            currentPokemon(pokemonbag);
            System.out.print("No:");
            int sec = scanner.nextInt();
            mypokemon = pokemonbag.get(sec-1);
            bag.usesppo(mypokemon,bag);
        }
        return false;
    }
    public void catchpokemon(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<basicpoke> pokemons = new ArrayList<basicpoke>();
        int pokemonran = (int)(Math.random()*5 + 1);
        for(int i=0; i < pokemonran; i++){
            int type = (int)(Math.random()*4);
            if(type == 0){
                pokemons.add(new Bulbasaur("Wild Bulbasaur"));
            }
            else if(type == 1){
                pokemons.add(new Squirtle("Wild Squirtle"));
            }
            else if(type == 2){
                pokemons.add(new Charmander("Wild Chamander"));
            }
            else if(type == 3){
                pokemons.add(new Pikachu("Wild Pikachu"));    
            }
        }

        System.out.println("==========================\nPokemon around you");
        int no=1;
        int sec;
        basicpoke myPokemon;
        for(basicpoke p : pokemons){
            System.out.println("No." + no + ":" + p.getName() + " = " + p.getHp());
            no++;
        }
        System.out.println("No.-1:Run out !");
        System.out.println("==========================");
        System.out.print("catch No :");
        no = scanner.nextInt();
        if(no > 0){
            basicpoke wildpokemon = pokemons.get(no-1);

            System.out.println("Select your pokemon to fight");
            currentPokemon(pokemonbag);
            do{
            System.out.print("No:");
            sec = scanner.nextInt();
            myPokemon = pokemonbag.get(sec-1);
            if(myPokemon.getHp() > 0){
                break;
            }
            else{
                System.out.println("your pokemon not ready to fight");
            }
            }while(true);

            boolean isWin = false;

            do{
                System.out.println("What will " + name + " do ?");
                System.out.println("No.1:fight");
                System.out.println("No.2:bag");
                System.out.println("No.3:Pokemon");
                System.out.println("No.4:Run");
                System.out.print("select : ");
                no = scanner.nextInt();
                if(no == 1){
                    isWin = fight(myPokemon, wildpokemon);
                    if(myPokemon.getHp() == 0 && isWin == false){
                        System.out.println("Your pokemon can't fight anymore");
                        if(cheackhavereadypoke(pokemonbag) == true){
                            currentPokemon(pokemonbag);
                            do{
                            sec = scanner.nextInt();
                            myPokemon = pokemonbag.get(sec-1);
                            if(myPokemon.getHp()>0){
                                break;
                            }
                            else{
                                System.out.println("your pokemon not ready to fight");
                            }
                            }while(true);
                        }
                        else{
                            break;
                        }
                    }
                    if(isWin == true){
                        break;
                    }
                }
                else if(no ==  2){
                    if(bag.empty() == true){
                        System.out.println("Your bag is empty");
                    }
                    else{
                        bag.showitem();
                        System.out.println("No.-1 : to go back");
                        System.out.print("No:");
                        int select = scanner.nextInt();
                        boolean a = useitem(select,true,wildpokemon);
                        if(a == true){
                            isWin = true;
                            break;
                        }
                    }
                }
                else if(no == 3){
                    System.out.println("Select your pokemon to fight");
                    currentPokemon(pokemonbag);
                    do{
                    System.out.print("No:");
                    sec = scanner.nextInt();
                    myPokemon = pokemonbag.get(sec-1);
                    if(myPokemon.getHp() > 0){
                        break;
                    }
                    else{
                        System.out.println("your pokemon not ready to fight");
                    }   
                    }while(true);
                }
                else if(no == 4){
                    break;
                }
            }while(true);
            if(isWin){
                myPokemon.afterfight(bag);
                System.out.println("Catch complete");
                pokemonbag.add(wildpokemon);
            }
            else{
                System.out.println(wildpokemon.getName() + " Win");
            }
        }
    }
    public void currentPokemon(ArrayList<basicpoke> Pokemono){
        int i = 1;
        for(basicpoke p : Pokemono){
            System.out.println("==========================\nNo." + i + ":"+ p.getName() + " Lv = "+ p.getLv() +"\n(Hp : " + p.getHp() + ")(SP :" +p.getSp() + ")\n==========================");
            i++;
        }
    }
    public boolean cheackhavereadypoke(ArrayList<basicpoke> pokemon){
        for(basicpoke i : pokemonbag){
            if(i.getHp() != 0){
                return true;
            }
        }
        return false;
    }
    public boolean fight(basicpoke firstattack,basicpoke secondattack){
       
        System.out.println("==========================\nselect action");
        System.out.println("No.1 : Normal attack !");
        System.out.println("No.2 : skill attack !");
        System.out.println("==========================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select :");
        int s = scanner.nextInt();
        if(s == 1){
            return normalattack(firstattack,secondattack);
        }
        //skill attack
        else if(s == 2){
            return skillattack(firstattack, secondattack);
        }
        else{
            return false;
        }
    }
    public void regen(){
        for(basicpoke i : pokemonbag){
            i.regenHp();
        }
    }
    public boolean normalattack(basicpoke firstattack,basicpoke secondattack){
        firstattack.attack(secondattack);
        if(secondattack.getHp() == 0){
            return true;
        }
        else{
            int ran;
            ran = (int)(Math.random()* 10);
            if(ran <= 8){
            secondattack.attack(firstattack);
            }
            else{
                secondattack.skillattack(firstattack);
            }
        }
        return false;
    }
    public boolean skillattack(basicpoke firstattack,basicpoke secondattack){
        if(firstattack.getSp() < 5){
            System.out.println("Can't use skill you have Sp = " + firstattack.getSp());
            return false;
        }
        else{
            firstattack.skillattack(secondattack);
            if(secondattack.getHp() == 0){
                return true;
            }
            else{
                int ran;
                ran = (int)(Math.random()* 10);
                if(ran <= 8){
                secondattack.attack(firstattack);
                }
                else{
                    secondattack.skillattack(firstattack);
                }
            }
            return false;
        }
    }
}

//method ด้านล่างคือตัวเดินเกมและปรับแต่งตรงตัว pokemon ให้มาเราเป็น method ในนี้แทน
