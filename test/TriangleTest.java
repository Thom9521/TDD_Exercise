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

        double area = triangle.area(3);

        assertEquals(3.8971143170299736, area);
    }

    @Test
    void testAreaAgain(){
        Triangle triangle = new Triangle();

        double area = triangle.area(5);

        assertEquals(10.825317547305483, area);
    }

    @Test
    void testVolume(){

        Triangle triangle = new Triangle();

        double volume = triangle.volume(5);

        assertEquals(10, volume);
    }
}
