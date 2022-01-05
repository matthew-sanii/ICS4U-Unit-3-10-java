import java.util.Scanner;

final class Vehicles {

  /**
  * Prevent instantiation
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private Vehicles() {
    throw new IllegalStateException("Cannot be initated.");
  }

  /**
  * The starting main() function.
  *
  * @param args Name of file containing a
  string of numbers.
  */
  public static void main(final String[] args) {
    final Scanner userInput = new Scanner(System.in);
    System.out.println("Input the color of the truck: ");
    final String truckColor = userInput.nextLine();
    System.out.println("Input the truck plate info: ");
    final String truckPlate = userInput.nextLine();
    if (truckColor.length() == 0
    || truckPlate.length() == 0) {
      System.out.println("Can't input empty string.");
      System.exit(0);
    }
    try {
      final int checker = Integer.valueOf(truckColor);
    } catch (NumberFormatException errorCode) {
      System.out.println("Input cadence of bike: ");
      try {
        final String bikeCadence = userInput.nextLine();
        final int newCadence = Integer.valueOf(bikeCadence);
        Bike bike = new Bike(newCadence);
        System.out.println("Bike speed is now " + bike.accelerate());
        System.out.println("The bike's bell goes " + bike.ringBell());
        System.out.println("The cadence of the bike is " + bike.getCadence());
        System.out.println("Number of wheels on the bike is: "
      + bike.getWheels());
      } catch (NumberFormatException errorCOde) {
        System.out.println("Cadence must be a number");
        System.exit(0);
      }
      Truck truck = new Truck(truckPlate, truckColor);
      System.out.println("Truck speed is now " + truck.accelerate());
      System.out.println("The truck's horn goes " + truck.provideAir());
      System.out.println("The truck's plate number is "
      + truck.getInfo() + " in color");
      System.out.println("Number of wheels on the truck is: "
      + truck.getWheels());
      System.out.println("Attempting to create a instance with vehicle"
      + " class.");
      // Vehicle car = new Vehicle();
      System.out.println("\nDone");
      System.exit(0);
    }
    System.out.println("Truck color must be a string.");
  }
}
