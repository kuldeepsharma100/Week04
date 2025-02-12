package generics.dynamiconlinemarketplace;

public class Category {
    String category;
    double price;

    public Category(String category, double price){
        this.category = category;
        this.price = price;
    }
    public void applyDiscount(double percentage){
        price -= price*(percentage/100);
    }
    public void setPrice(double price){
        this.price =price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Category{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
