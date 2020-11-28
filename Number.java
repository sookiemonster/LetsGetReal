public abstract class Number {
  public abstract double getValue();

  public boolean equals(Number other) {
    if (this.getValue() == 0.0 && other.getValue() == 0.0) {
      return true;
    }
    double diff = percentDifference(this.getValue(), other.getValue());
    return diff < 0.001;
    }

  public static double percentDifference(double a, double b) {
    return (Math.abs(a - b) / (( a + b ) / 2)) * 100;
  }
}
