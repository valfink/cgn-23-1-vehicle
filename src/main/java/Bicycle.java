public class Bicycle extends Vehicle {
    @Override
    public int accelerate(int kmh) {
        System.out.println("Current velocity is: " + getVelocity());
        if (kmh < 35) {
            System.out.println("Hold tight to your handlebar! Accelerating to: " + kmh);
            setVelocity(kmh);
            System.out.println("New velocity is: " + getVelocity());
        } else {
            System.out.println("Sorry, but this velocity is too much for a bicycle. Try using a motorbike instead!");
            System.out.println("I will stick to my current velocity.");
        }
            return getVelocity();
    }

    @Override
    public int brake() {
        setVelocity(0);
        return getVelocity();
    }
}
