package Item;

public class Item{
    public int itemId;
    public String name;
    String detail;


    public Item(int itemId,String itemName) {
        this.itemId = itemId;
        this.name = itemName;
    }
    public int getID(){
        return itemId;
    }
    public String getName(){
        return name;
    }
}