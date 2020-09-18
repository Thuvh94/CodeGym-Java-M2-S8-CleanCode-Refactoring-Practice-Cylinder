import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    @DisplayName("Testing getBaseArea(0)")
    void testGetBaseArea0() {
        int radius = 0;
        double expected = 0;

        double result = Cylinder.getBaseArea(radius);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getBaseArea(3)")
    void testGetBaseArea3() {
        int radius = 3;
        double expected = 28.274333882308138;

        double result = Cylinder.getBaseArea(radius);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getPerimeter(10)")
    void testGetPerimeter10() {
        int radius = 10;
        double expected = 62.83185307179586;

        double result = Cylinder.getPerimeter(radius);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
