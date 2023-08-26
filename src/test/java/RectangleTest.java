import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @DisplayName("getBase Test 1")
    @Test
    void getBase_Test01() {
        Rectangle rect = new Rectangle(10, 5);
        int received = rect.getBase();
        assertEquals(10, received);
    }

    @DisplayName("getBase Test 2")
    @Test
    void getBase_Test02() {
        Rectangle rect = new Rectangle(20, 10);
        int received = rect.getBase();
        assertEquals(20, received);
    }

    @DisplayName("getBase Test 3")
    @Test
    void getBase_Test03() {
        Rectangle rect = new Rectangle(7, 13);
        int received = rect.getBase();
        assertEquals(7, received);
    }

    @DisplayName("getHeight Test 1")
    @Test
    void getHeight_Test01() {
        Rectangle rect = new Rectangle(7, 13);
        int received = rect.getHeight();
        assertEquals(13, received);
    }

    @DisplayName("getHeight Test 2")
    @Test
    void getHeight_Test02() {
        Rectangle rect = new Rectangle(5, 10);
        int received = rect.getHeight();
        assertEquals(10, received);
    }

    @DisplayName("getHeight Test 3")
    @Test
    void getHeight_Test03() {
        Rectangle rect = new Rectangle(20, 5);
        int received = rect.getHeight();
        assertEquals(5, received);
    }

    @DisplayName("setBase Test 1")
    @Test
    void setBase_Test01() {
        Rectangle rect = new Rectangle();
        rect.setBase(5);
        int received = rect.getBase();
        assertEquals(5, received);
    }

    @DisplayName("setBase Test 2")
    @Test
    void setBase_Test02() {
        Rectangle rect = new Rectangle();
        rect.setBase(41);
        int received = rect.getBase();
        assertEquals(41, received);
    }

    @DisplayName("setBase Test 3")
    @Test
    void setBase_Test03() {
        Rectangle rect = new Rectangle();
        rect.setBase(17);
        int received = rect.getBase();
        assertEquals(17, received);
    }

    @DisplayName("setHeight Test 1")
    @Test
    void setHeight_Test01() {
        Rectangle rect = new Rectangle();
        rect.setHeight(7);
        int received = rect.getHeight();
        assertEquals(7, received);
    }

    @DisplayName("setHeight Test 2")
    @Test
    void setHeight_Test02() {
        Rectangle rect = new Rectangle();
        rect.setHeight(18);
        int received = rect.getHeight();
        assertEquals(18, received);
    }

    @DisplayName("setHeight Test 3")
    @Test
    void setHeight_Test03() {
        Rectangle rect = new Rectangle();
        rect.setHeight(14);
        int received = rect.getHeight();
        assertEquals(14, received);
    }

    @DisplayName("getArea Test 1")
    @Test
    void getArea_Test01() {
        Rectangle rect = new Rectangle(4, 7);
        int received = rect.getArea();
        assertEquals(4*7, received);
    }

    @DisplayName("getArea Test 2")
    @Test
    void getArea_Test02() {
        Rectangle rect = new Rectangle(30, 9);
        int received = rect.getArea();
        assertEquals(30*9, received);
    }

    @DisplayName("getArea Test 3")
    @Test
    void getArea_Test03() {
        Rectangle rect = new Rectangle(11, 5);
        int received = rect.getArea();
        assertEquals(11*5, received);
    }
}
