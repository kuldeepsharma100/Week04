package generics.warehousemanagementsystem;

abstract class WarehouseItem {
    String name;
    int price;

    WarehouseItem(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "WarehouseItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
