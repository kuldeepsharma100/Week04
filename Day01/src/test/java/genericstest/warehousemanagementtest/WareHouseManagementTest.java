package genericstest.warehousemanagementtest;
import generics.warehousemanagementsystem.Furniture;
import generics.warehousemanagementsystem.Groceries;
import org.junit.Assert;
import org.junit.Test;
import generics.warehousemanagementsystem.Electronics;
import generics.warehousemanagementsystem.Storage;


public class WareHouseManagementTest {
  @Test
    public void test1(){
      Storage<Electronics> electronic = new Storage<>();
      electronic.storeItem(new Electronics("Laptop", 1200));

      Assert.assertEquals(1, electronic.getItems().size());

  }

  @Test
  public void test2(){
    Storage<Groceries> groceries = new Storage<>();
    groceries.storeItem(new Groceries("Apple", 20));
    Assert.assertEquals("Apple", groceries.getItems().get(0).getName());
    System.out.println("true");
  }
  @Test
  public void test3(){
    Storage<Furniture> furniture = new Storage<>();
    furniture.storeItem(new Furniture("Chair", 800));
    Assert.assertEquals("Chair", furniture.getItems().get(0).getName());
  }
}
