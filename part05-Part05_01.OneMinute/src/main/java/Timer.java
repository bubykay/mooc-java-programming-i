public class Timer {
  ClockHand seconds;
  ClockHand hundreds;

  public Timer() {
    this.hundreds = new ClockHand(100);
    this.seconds = new ClockHand(60);
  }

  public void advance() {
    this.hundreds.advance();
    if (hundreds.value() == 0) {
      this.seconds.advance();
    }
  }

  @Override
  public String toString() {
    return this.seconds + ":" + this.hundreds;
  }

}
