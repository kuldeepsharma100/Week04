package generics.warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
     ArrayList<T> list = new ArrayList<>();

     public void storeItem(T item){
         list.add(item);

     }

    public List<T> getItems() {
        return list;
    }
    public void displayItem(List<? extends WarehouseItem> items) {

        System.out.println(items);
    }

}
