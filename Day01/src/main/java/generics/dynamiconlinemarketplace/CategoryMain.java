package generics.dynamiconlinemarketplace;

public class CategoryMain {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>();
        book.addItems(new BookCategory("rich dad ", 500));
        book.addItems(new BookCategory("poor dad ", 700));

        book.applyDiscount(book.getItems().get(1), 5);

        Product<ClothingCategory> cloth = new Product<>();
        cloth.addItems(new ClothingCategory("T-Shirt", 1200));
        cloth.addItems(new ClothingCategory("jacket ", 4000));

        cloth.applyDiscount(cloth.getItems().get(1), 5);


    }
}
