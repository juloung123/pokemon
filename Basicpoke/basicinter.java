package Basicpoke;

import bag.*;

interface basicinter{
    public String getName();
    public String toString();
    public void changename(String name);
    public void status();
    public String getRace();
    public String gettype();
    public double getAttackDamage();
    public double getMagicDamage();
    public int getLv();
    public double getExp();
    public int getHp();
    public int getSp();
    public int getMaxHp();
    public int getdef();
    public int getMaxSp();
    public void setExp(int earn);
    public void regenHp();
    public void setDamage(int damage);
    public void useallitem(int itemID,int amount,Bag bag);
    public void setSp(int decrease);
    public void attack(basicpoke enemy);
    public void skillattack(basicpoke enemy);
    public void afterfight(Bag bag);
    public void changeHpAndSp();
    public void setLv(int exp,Bag bag);
    public void rewardsfromlevel(int currentlevel,Bag bag);
}