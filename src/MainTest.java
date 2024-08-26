import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addElement() {
        // Arrange
        String[] todoList = {"a", "b", "c"};
        String newElement = "d";

        // Act
        String[] result = Main.addElement(todoList, newElement);

        // Assert
        assertEquals(todoList.length + 1, result.length, "Grösse trifft nicht zu");
        assertEquals(newElement, result[result.length - 1]);
        assertEquals("d", result[3]);
        assertEquals("b", result[1]);
    }
}