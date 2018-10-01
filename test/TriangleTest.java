import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    void testSides(){
        Triangle triangle = new Triangle();

        int sides;

        triangle.getSides();

        sides = triangle.getSides();

        assertEquals(5, sides);
    }
}
