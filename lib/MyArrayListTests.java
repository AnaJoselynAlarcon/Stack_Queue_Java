import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class MyArrayListTests {

    private MyArrayList<Integer> myArrayList;

    @BeforeEach
    public void setUp() {
        // Create a new MyArrayList before each test
        myArrayList = new MyArrayList<>();
    }

    @Test
    public void testAddElement() {
        // myArrayList.add(42);
        assertEquals(1, myArrayList.size());
    }

    @Test
    public void testGetElement() {
        myArrayList.add(42);
        int element = myArrayList.get(0);
        assertEquals(42, element);
    }

    @Test
    public void testRemoveElement() {
        myArrayList.add(42);
        boolean removed = myArrayList.remove(42);
        assertTrue(removed);
        assertEquals(0, myArrayList.size());
    }

    @Test
    public void testSize() {
        assertEquals(0, myArrayList.size());

        myArrayList.add(42);
        assertEquals(1, myArrayList.size());

        myArrayList.add(88);
        assertEquals(2, myArrayList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(myArrayList.isEmpty());

        myArrayList.add(42);
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testContainsElement() {
        myArrayList.add(42);
        myArrayList.add(88);

        assertTrue(myArrayList.contains(42));
        assertTrue(myArrayList.contains(88));
        assertFalse(myArrayList.contains(100));
    }

    @Test
    public void testClear() {
        myArrayList.add(42);
        myArrayList.add(88);

        myArrayList.clear();

        assertEquals(0, myArrayList.size());
        assertTrue(myArrayList.isEmpty());
    }

}
