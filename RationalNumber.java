public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
    }
  }

  public double getValue() {
    return (double)numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal() {
    RationalNumber x = new RationalNumber(this.denominator, this.numerator);
    return x;
  }

  public boolean equals(RationalNumber other) {
    return this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator();
  }

  public String toString() {
    return this.getNumerator() + "/" + this.getDenominator();
  }

  private static int gcd(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    } else if (a < b) {
      int temp = a;
      a = b;
      b = temp;
    }
    int remainder = a%b;
    int dividend = a;
    int divisor = b;
    while (remainder != 0) {
      dividend = divisor;
      divisor = remainder;
      remainder = divisor % remainder;
    }
    return divisor;
  }
}
