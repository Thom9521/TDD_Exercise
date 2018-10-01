import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    void testSides(){
        Triangle triangle = new Triangle();

        int sides;

        triangle.setSides(6);

        sides = triangle.getSides();

        assertEquals(6, sides);
    }

    @Test
    void testArea(){
        Triangle triangle = new Triangle();

        int sides = 5;

        double area = triangle.area(5);

        assertEquals(10, area);
    }
}
