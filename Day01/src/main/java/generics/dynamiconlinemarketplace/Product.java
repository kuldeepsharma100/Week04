package generics.dynamiconlinemarketplace;

import java.util.ArrayList;

public class  Product<T extends Category> {
     ArrayList<T> items = new ArrayList<>();
     public void addItems(T item){
         items.add(item);
     }



    public ArrayList<T> getItems() {
        return items;
    }


    public  void applyDiscount( T product, double percentage){
        System.out.println("Before Discount: " + product);
        product.applyDiscount(percentage);
        System.out.println("Discount applied: " + product);


   }
}
