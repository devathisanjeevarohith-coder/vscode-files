class Groceries{
    int itemid;
    String itemName;
    double price;
    void display(){
        System.out.println("Item ID: " + itemid);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args){
        Groceries[] items = new Groceries[3];
        items[0] = new Groceries();
        items[0].itemid = 123;
        items[0].itemName = "choco";
        items[0].price = 20.87;
        items[0].display();
    }
}