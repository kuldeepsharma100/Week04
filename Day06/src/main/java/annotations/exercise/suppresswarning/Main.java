package annotations.exercise.suppresswarning;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Apple");
        list.add(100);
        list.add(3.14);

        System.out.println("ArrayList elements: " + list);
    }
}
