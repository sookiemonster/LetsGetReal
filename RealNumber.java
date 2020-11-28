public class RealNumber extends Number {
  private double value;

  public RealNumber(double v) {
    super();
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return "" + getValue();
  }

  public RealNumber add(RealNumber other) {
    RealNumber x = new RealNumber(this.getValue() + other.getValue());
    return x;
  }

  public RealNumber multiply(RealNumber other) {
    RealNumber x = new RealNumber(this.getValue() * other.getValue());
    return x;
  }

  public RealNumber divide(RealNumber other) {
    RealNumber x = new RealNumber(this.getValue() / other.getValue());
    return x;
  }

  public RealNumber subtract(RealNumber other) {
    RealNumber x = new RealNumber(this.getValue() - other.getValue());
    return x;
  }
}
