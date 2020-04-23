package Item;

public class Item{
    protected int itemId;
    protected String name;
    protected String detail;


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