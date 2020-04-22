package Basicpoke;
import java.util.*;
import bag.*;

public class basicpoke{
    public String name;
    public String type;
    public int hp;
    public int sp;
    public int atk;
    public int def;
    public int skill;
    public int level;
    public int exp;
    public String Race;
    public int MaxHp;
    public int Maxsp;

    public basicpoke(String name){
        this.name = name;
        Race = "Nothing";
        type =  "Nothing";
        hp = 1;
        sp = 1;
        atk = 1;
        def = 1;
        skill = 1;
        level = 1;
        exp = 0;
        MaxHp = 1;
        Maxsp = 1;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }

    public void status(){
        System.out.println("Name : "+name);
            System.out.println("Race : " + Race);
            System.out.println("type : " + type);
            System.out.println("Level : "+getLv());
            System.out.println("Exp : "+getExp());
            System.out.println("Hp : " + getHp() + "/" + getMaxHp());
            System.out.println("SP : "+ getSp() + "/" + getMaxSp());
            System.out.println("Defence : " + getdef());
            System.out.println("Attack Damage : " + getAttackDamage() + "\nSkill Damage : "+ getMagicDamage());
    }
    public double getAttackDamage(){
        return atk;
    }
    public double getMagicDamage(){
        return skill;
    }
    public int getLv(){
        return level;
    }
    public double getExp(){
        return exp;
    }
    public int getHp(){
        return hp;
    }
    public int getSp(){
        return sp;
    }
    public int getMaxHp(){
        return MaxHp;
    }
    public int getdef(){
        return def;
    }
    public int getMaxSp(){
        return Maxsp;
    }
    public void setExp(int earn){
            exp = exp + earn;
        }
    public void regenHp(){
        hp = MaxHp;
        sp = Maxsp;
        System.out.println(name + " pokemon HP and SP Will be Regen");
    }
    public void setDamage(int damage){
        int damagecal = damage-def;
        if(damagecal <= 0){
            damagecal = 0;
        }
        hp = hp-damagecal;
        if(hp <= 0 ){
            System.out.println("Pokemon " + name + " can't fight anymore");
            hp = 0;
        }
    }
    public void setSp(int decrease){
        int currentsp;
        currentsp = sp;
        sp = sp - decrease;
        if(sp <= 0){
            System.out.println("Don't have sp enough");
            sp = currentsp;
        }
    }

    public void attack(basicpoke enemy){
        System.out.println(name + " attack " + enemy.getName());
        enemy.setDamage(atk);
    }
    public void skillattack(basicpoke enemy){
        sp -= 5;
        System.out.println(name + " use skill to " + enemy.getName());
        enemy.setDamage(skill);

    }
    public void hitMonster(Bag bag){
        setExp(100);
        setLv(exp);
        Random rand = new Random();
        int value = rand.nextInt(10000);  // Can get Red Potion if random is 0 and Blue Potion is 1 another don't get anything
        if (value <= 1580){
            bag.hppo();
            System.out.println("You get 1 Red Potion");
        }
        if(value <= 979){
            bag.sppo();
            System.out.println("You get 1 Blue Potion");
        }
        if(value <= 6466){
            bag.Ball();
            System.out.println("You get 1 Pokeball");
        }
        if(value <= 1432){
            bag.berry();
            System.out.println("You get 1 Berry");
        }
    }
    public void changeHpAndSp(){
        this.hp = 50 *level;
        this.MaxHp = hp;
        this.Maxsp = hp;
    }
    public void setLv(int exp){
        int levelUp;
        levelUp = level*100;
        if(exp >= levelUp){
            this.exp = exp - levelUp;
            level = level + 1;
            //rewardsfromlevel(level);
            System.out.println("Congratulations !!" + name +"level up");
            changeHpAndSp();
        }
    }
    /*public void rewardsfromlevel(int currentlevel){
        if(currentlevel == 2){
            bag.addItem(2,0,0,0);
        }
        else if(currentlevel == 3 || currentlevel == 4){
            bag.addItem(3,0,0,0);
        }
        else if(currentlevel == 5){
            bag.addItem(4,2,0,1);
        }
        else if(currentlevel == 6){
            bag.addItem(5,2,0,1);
        }
        else{
            bag.addItem(5,3,1,2);
        }
    }*/
}