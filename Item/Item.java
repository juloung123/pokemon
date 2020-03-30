package Item;

public class Item{
    public int itemId;
    public String name;
    String detail;
    public int amount;

    public Item(int itemId,String itemName,int amountItemFound) {
        this.itemId = itemId;
        this.name = itemName;
        this.amount=amountItemFound ;
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
}