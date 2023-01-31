import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BicycleTest {
    @Test
    void testAccelerate_lowSpeed() {
        // GIVEN
        Bicycle b = new Bicycle();
        b.setVelocity(10);
        int expectedFinalVelocity = 20;

        // WHEN
        int result = b.accelerate(20);

        // THEN
        assertEquals(expectedFinalVelocity, result);

    }
    @Test
    void testAccelerate_lowSpeed_withoutInitialSpeed() {
        // GIVEN
        Bicycle b = new Bicycle();
        int expectedFinalVelocity = 20;

        // WHEN
        int result = b.accelerate(20);

        // THEN
        assertEquals(expectedFinalVelocity, result);

    }
    @Test
    void testAccelerate_highSpeed() {
        // GIVEN
        Bicycle b = new Bicycle();
        b.setVelocity(10);
        int expectedFinalVelocity = 10;

        // WHEN
        int result = b.accelerate(40);

        // THEN
        assertEquals(expectedFinalVelocity, result);

    }
    @Test
    void testBrake() {
        // GIVEN
        Bicycle b = new Bicycle();
        b.setVelocity(10);
        int expectedFinalVelocity = 0;

        // WHEN
        int result = b.brake();

        // THEN
        assertEquals(expectedFinalVelocity, result);

    }
}
