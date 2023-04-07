import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        int result = PhoneBook.add("Masha", "89261111111") +
                PhoneBook.add("Olya", "89261111112");
        assertEquals(result, 3);
    }

    @Test
    public void testAddName() {
        int result = PhoneBook.add("Masha", "89261111111") +
                PhoneBook.add("Olya", "89261111112") + PhoneBook.add("Olya", "89261111112");
        assertEquals(result, 5);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook.add("Masha", "89261111111");
        assertEquals("Masha", PhoneBook.findByNumber("89261111111"));
    }

    @Test
    public void testFindByNumberNotFind() {
        PhoneBook.add("Masha", "89261111111");
        assertEquals("No name", PhoneBook.findByNumber("89261111112"));
    }
}
