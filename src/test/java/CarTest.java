import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void testAccelerate() {
        // GIVEN
        Car c = new Car();
        c.setVelocity(30);
        int expectedFinalVelocity = 50;

        // WHEN
        int result = c.accelerate(50);

        // THEN
        assertEquals(expectedFinalVelocity, result);
    }
}