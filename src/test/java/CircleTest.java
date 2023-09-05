import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @DisplayName("getRadius Test 1")
    @Test
    void getRadius_Test01() {
        Circle circ = new Circle(5);
        int received = circ.getRadius();
        assertEquals(5, received);
    }

    @DisplayName("getRadius Test 2")
    @Test
    void getRadius_Test02() {
        Circle circ = new Circle(15);
        int received = circ.getRadius();
        assertEquals(15, received);
    }

    @DisplayName("getRadius Test 3")
    @Test
    void getRadius_Test03() {
        Circle circ = new Circle(34);
        int received = circ.getRadius();
        assertEquals(34, received);
    }

    @DisplayName("setRadius Test 1")
    @Test
    void setRadius_Test01() {
        Circle circ = new Circle();
        circ.setRadius(10);
        int received = circ.getRadius();
        assertEquals(10, received);
    }

    @DisplayName("setRadius Test 2")
    @Test
    void setRadius_Test02() {
        Circle circ = new Circle();
        circ.setRadius(44);
        int received = circ.getRadius();
        assertEquals(44, received);
    }

    @DisplayName("setRadius Test 3")
    @Test
    void setRadius_Test03() {
        Circle circ = new Circle();
        circ.setRadius(75);
        int received = circ.getRadius();
        assertEquals(75, received);
    }

    @DisplayName("getCircumference Test 1")
    @Test
    void getCircumference_Test01() {
        Circle circ = new Circle(50);
        double expected = Math.round((2 * Math.PI * 50)*100)/100;
        double received = Math.round(circ.getCircumference()*100)/100;
        assertEquals(expected, received);
    }

    @DisplayName("getCircumference Test 2")
    @Test
    void getCircumference_Test02() {
        Circle circ = new Circle(241);
        double expected = Math.round((2 * Math.PI * 241)*100)/100;
        double received = Math.round(circ.getCircumference()*100)/100;
        assertEquals(expected, received);
    }

    @DisplayName("getCircumference Test 3")
    @Test
    void getCircumference_Test03() {
        Circle circ = new Circle(378);
        double expected = Math.round((2 * Math.PI * 378)*100)/100;
        double received = Math.round(circ.getCircumference()*100)/100;
        assertEquals(expected, received);
    }

    @DisplayName("getArea Test 1")
    @Test
    void getArea_Test01() {
        Circle circ = new Circle(50);
        double expected = Math.round((Math.PI * Math.pow(50, 2))*100)/100;
        double received = Math.round(circ.getArea()*100)/100;
        assertEquals(expected, received);
    }

    @DisplayName("getArea Test 2")
    @Test
    void getArea_Test02() {
        Circle circ = new Circle(245);
        double expected = Math.round((Math.PI * Math.pow(245, 2))*100)/100;
        double received = Math.round(circ.getArea()*100)/100;
        assertEquals(expected, received);
    }

    @DisplayName("getArea Test 3")
    @Test
    void getArea_Test03() {
        Circle circ = new Circle(876);
        double expected = Math.round((Math.PI * Math.pow(876, 2))*100)/100;
        double received = Math.round(circ.getArea()*100)/100;
        assertEquals(expected, received);
    }
}
