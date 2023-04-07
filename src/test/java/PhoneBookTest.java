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


}
