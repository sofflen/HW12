import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {


    @Test
    void getSize() {
        Collection testColl = new Collection();
        assertEquals(0, testColl.getSize());
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        testColl.add("D");
        testColl.add("E");
        testColl.add("F");
        testColl.add("G");
        testColl.add("H");
        testColl.add("I");
        testColl.add("G");
        assertEquals(10, testColl.getSize());
        testColl.add("K");
        testColl.add("L");
        assertEquals(12, testColl.getSize());

    }

    @Test
    void add() {
        Collection testColl = new Collection();
        assertTrue(testColl.add("boom"));
    }

    @Test
    void contains() {
        Collection testColl = new Collection();
        testColl.add("aram");
        assertTrue(testColl.contains("aram"));
        assertFalse(testColl.contains("ARAM"));

    }

    @Test
    void deleteByIndex() {
        Collection testColl = new Collection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        testColl.add("D");
        assertTrue(testColl.delete(2));
        assertFalse(testColl.delete(4));
        assertFalse(testColl.contains("C"));

    }

    @Test
    void deleteByContent() {
        Collection testColl = new Collection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        testColl.add("D");
        assertTrue(testColl.delete("C"));
        assertFalse(testColl.delete("C"));
        assertFalse(testColl.contains("C"));
    }

    @Test
    void getByIndex() {
        Collection testColl = new Collection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        testColl.add("D");
        assertNull(testColl.getByIndex(4));
        assertEquals("D", testColl.getByIndex(3));
    }

    @Test
    void equals() {
        Collection testColl1 = new Collection();
        Collection testColl2 = new Collection();
        Collection testColl3 = new Collection();
        testColl1.add("A");
        testColl1.add("B");
        testColl1.add("C");
        testColl2.add("C");
        testColl2.add("B");
        testColl2.add("A");
        testColl3.add("A");
        testColl3.add("B");
        assertTrue(testColl1.equals(testColl2));
        assertFalse(testColl1.equals(testColl3));
    }

    @Test
    void indexOf() {
        Collection testColl = new Collection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        assertEquals(2,testColl.indexOf("C"));
        assertEquals(-1,testColl.indexOf("D"));

    }

    @Test
    void clear() {
        Collection testColl = new Collection();
        testColl.add("A");
        testColl.add("B");
        testColl.add("C");
        testColl.clear();
        assertEquals(0, testColl.getSize());
    }
}