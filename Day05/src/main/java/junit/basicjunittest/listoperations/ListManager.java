package junit.basicjunittest.listoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element)); // Removes first occurrence
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ListManager listManager = new ListManager();
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Get List Size");
            System.out.println("4. Display List");
            System.out.println("5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element to add:");
                    int addElement = sc.nextInt();
                    listManager.addElement(list, addElement);
                    System.out.println(addElement + " added.");
                    break;
                case 2:
                    System.out.println("Enter element to remove:");
                    int removeElement = sc.nextInt();
                    if (listManager.removeElement(list, removeElement)) {
                        System.out.println(removeElement + " removed.");
                    } else {
                        System.out.println(removeElement + " not found.");
                    }
                    break;
                case 3:
                    System.out.println("List size: " + listManager.getSize(list));
                    break;
                case 4:
                    System.out.println("List: " + list);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
