public class Fitbyte {
  private int age;
  private int rHeartRate;

  public Fitbyte(int age, int rHeartRate) {
    this.age = age;
    this.rHeartRate = rHeartRate;
  }

  public double targetHeartRate(double percentageOfMaximum) {
    double maxHeartRate = 206.3 - (0.711 * age);
    return (maxHeartRate - rHeartRate) * percentageOfMaximum + rHeartRate;

  }

  @Override
  public String toString() {
    return "" + this;
  }

}
