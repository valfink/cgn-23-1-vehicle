public class Car extends Vehicle{
    @Override
    public int accelerate(int kmh) {
        System.out.println("Current velocity is: " + getVelocity());
        System.out.println("Fasten your seatbelts! Accelerating to: " + kmh);
        setVelocity(kmh);
        System.out.println("New velocity is: " + getVelocity());
        return getVelocity();
    }
}
