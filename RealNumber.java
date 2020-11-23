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
    double diff = percentDifference(this.getValue(), other.getValue());
    return diff < 0.001;
    }

  public static double percentDifference(double a, double b) {
    return (Math.abs(a - b) / (( a + b ) / 2)) * 100;
  }

  public RealNumber add(RealNumber other) {
    RealNumber x = new RealNumber(this.getValue() + other.getValue());
    return x;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber x = new RealNumber(this.getValue() * other.getValue());
    return x;
  }
}
