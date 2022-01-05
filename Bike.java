public class Bike extends Vehicle {

  /**
  * The cadence of the bike.
  */
  private int cadence;

  /**
  * The constructor for the bike.
  *
  * @param cadance the cadence parameter.
  */
  public Bike(final int cadance) {
    cadence = cadance;
  }

  /**
  * The accelerate method.
  *
  * @return speed.
  */
  public int accelerate() {
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
  * the ringBell method.
  *
  * @return Ding!
  */
  public String ringBell() {
    return "Ding!";
  }

  /**
  * The getCadence method.
  *
  * @return cadence.
  */
  public int getCadence() {
    return cadence;
  }

  /**
  * The getWheels method.
  *
  * @return wheels.
  */
  public int getWheels() {
    int result = super.getWheels();
    result = result / 2;
    return result;
  }
}
