import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!");
        String input = "";
        while (!input.equals("q")) {
            System.out.println("Please choose if you want to use the [b]icycle or the [c]ar!");
            while (!input.equals("b") && !input.equals("c")) {
                input = scanner.next();
            }
            System.out.println("Great choice! I as well would have chosen the " + (input.equals("b") ? "bicycle" : "car"));
            Acceleratable acc = input.equals("b") ? bicycle : car;

            System.out.println("Would you like to [a]ccelerate or [b]reak?");
            input = "";
            while (!input.equals("a") && !input.equals("b")) {
                input = scanner.next();
            }
            if (input.equals("a")) {
                System.out.println("Off you go! What is your desired final velocity?");
                int intInput = scanner.nextInt();
//                scanner.next();
                acc.accelerate(intInput);
            } else {
                System.out.println("We will soon come to a halt!");
                acc.brake();
            }
            System.out.println("Do you want to [q]uit or [r]epeat?");
            input = scanner.next();
        }
    }
}