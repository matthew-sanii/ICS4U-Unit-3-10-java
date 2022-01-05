public class Truck extends Vehicle {

  /**
  * The plate number string.
  */
  private String plateNumber;

  /**
  * The truck color.
  */
  private String truckColor = "green";

  /**
  * The truck constructor.
  *
  * @param platInfo the plate info.
  * @param colour the truck color.
  */
  public Truck(final String platInfo,
  final String colour) {
    truckColor = colour;
    plateNumber = platInfo;
  }

  /**
  * The accelerate method.
  *
  * @return speed.
  */
  public int accelerate() {
    super.accelerate();
    return super.accelerate();
  }

  /**
  * The brake method.
  *
  * @return speed.
  */
  public int brake() {
    return super.brake();
  }

  /**
  * The provideAir method.
  *
  * @return Honk Honk!
  */
  public String provideAir() {
    return "Honk Honk!";
  }

  /**
  * The getPlate method.
  *
  * @return plateNumber.
  */
  public String getInfo() {
    final String info = plateNumber + " and is " + truckColor;
    return info;
  }

  /**
  * The getWheels method.
  *
  * @return wheels.
  */
  public int getWheels() {
    int result = super.getWheels();
    return result;
  }
}
