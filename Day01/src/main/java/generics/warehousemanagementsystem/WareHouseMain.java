package generics.warehousemanagementsystem;

public class WareHouseMain {
    public static void main(String[] args) {
        Storage<Electronics> electronic = new Storage<>();
        electronic.storeItem(new Electronics("Laptop", 1200));
        electronic.storeItem(new Electronics("Smartphone", 800));
        electronic.displayItem(electronic.getItems());

        Storage<Groceries> groceries = new Storage<>();
        groceries.storeItem(new Groceries("Apple", 20));
        groceries.storeItem(new Groceries("Milk", 120));
        groceries.displayItem(groceries.getItems());

        Storage<Furniture> furniture = new Storage<>();
        furniture.storeItem(new Furniture("Chair", 800));
        furniture.storeItem(new Furniture("Table", 700));
        furniture.displayItem(furniture.getItems());


    }
}
