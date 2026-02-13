package collectionsandstreams.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit test cases for the ListManager class.
 *
 * Verifies that elements are correctly added, removed, and that the list
 * size is updated correctly after each operation.
 */
class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    // Create fresh ListManager and empty list before each test for isolation
    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    // Test that elements are correctly added to the list
    @Test
    @DisplayName("Should add elements to list correctly")
    void testAddElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        assertTrue(list.contains(10));
        assertTrue(list.contains(20));
        assertEquals(2, list.size());
    }

    // Test that elements are correctly removed from the list
    @Test
    @DisplayName("Should remove elements from list correctly")
    void testRemoveElement() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);
        listManager.addElement(list, 30);
        listManager.removeElement(list, 20);
        assertFalse(list.contains(20));
        assertTrue(list.contains(10));
        assertTrue(list.contains(30));
    }

    // Test that getSize returns correct count after operations
    @Test
    @DisplayName("Should return correct list size")
    void testGetSize() {
        assertEquals(0, listManager.getSize(list));
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        assertEquals(2, listManager.getSize(list));
        listManager.removeElement(list, 1);
        assertEquals(1, listManager.getSize(list));
    }

    // Test remove when element does not exist
    @Test
    @DisplayName("Should handle remove of non-existent element gracefully")
    void testRemoveNonExistentElement() {
        listManager.addElement(list, 10);
        listManager.removeElement(list, 99);
        assertEquals(1, listManager.getSize(list));
        assertTrue(list.contains(10));
    }
}
