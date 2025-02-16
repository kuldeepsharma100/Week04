package junittest.basicjunittest.listoperationtest;

import static org.junit.jupiter.api.Assertions.*;

import junit.basicjunittest.listoperations.ListManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertEquals(2, list.size());
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
    }

    @Test
    void testRemoveElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        assertTrue(listManager.removeElement(list, 10));
        assertFalse(list.contains(10));

        assertFalse(listManager.removeElement(list, 30)); // Removing non-existent element
    }

    @Test
    void testGetSize() {
        assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 5);
        assertEquals(1, listManager.getSize(list));

        listManager.addElement(list, 15);
        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 5);
        assertEquals(1, listManager.getSize(list));
    }
}
