public class RealNumber {
  private double value;

  public RealNumber(double v) {
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return "" + getValue();
  }

  public boolean equals(RealNumber other) {
    double diff = 0;
    return true;
  }

  public static double percentDifference(double a, double b) {
    return (Math.abs(a - b) / (( a + b ) / 2)) * 100;
  }
}
