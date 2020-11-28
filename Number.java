public abstract class Number {
  public abstract double getValue();

  public boolean equals(Number other) {
    if (this.getValue() == 0.0 && other.getValue() == 0.0) {
      return true;
    }
    if ((this.getValue() < 0.0 && other.getValue() > 0.0) || (this.getValue() > 0.0 && other.getValue() < 0.0)) {
      return false;
    }
    double diff = percentDifference(Math.abs(this.getValue()), Math.abs(other.getValue()));
    return diff < 0.00001;
    }

  private static double percentDifference(double a, double b) {
    return (Math.abs(a - b) / (( a + b ) / 2)) * 100;
  }

  public int compareTo(Number other) {
    if (this.equals(other)) {
      return 0;
    } else if (this.getValue() < other.getValue()) {
      return -1;
    } else {
      return 1;
    }
  }
}
