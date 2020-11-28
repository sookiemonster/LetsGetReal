public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(0.0);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else if (nume == 0){
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
      reduce();
      swapNegative();
    }
  }

  private void swapNegative() {
    if (this.getNumerator() < 0 && this.getDenominator() < 0) {
      numerator = Math.abs(this.getNumerator());
      denominator = Math.abs(this.getDenominator());
    } else if (this.getDenominator() < 0) {
      numerator = this.getNumerator() * -1;
      denominator = Math.abs(this.getDenominator());
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
    if (this.getNumerator() == 0) {
      return "0";
    } else if (this.getDenominator() == 1) {
      return "" + this.getNumerator();
    }
    return this.getNumerator() + "/" + this.getDenominator();
  }

  private static int gcd(int a, int b) {
    if (a == 0 || b == 0) {
      return 1;
    } else if (Math.abs(a) < Math.abs(b)) {
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
      remainder = dividend % remainder;
    }
    return divisor;
  }

  private void reduce() {
    int temp = gcd(this.getNumerator(), this.getDenominator());
    numerator = this.getNumerator() / temp;
    denominator = this.getDenominator() / temp;
  }

  public RationalNumber multiply(RationalNumber other) {
    RationalNumber x = new RationalNumber(this.getNumerator() * other.getNumerator(),
                                          this.getDenominator() * other.getDenominator());
    return x;
  }

  public RationalNumber divide(RationalNumber other) {
    RationalNumber y = this.multiply(other.reciprocal());
    return y;
  }

  public RationalNumber add(RationalNumber other) {
    int commonDenominator = this.getDenominator() * other.getDenominator();
    int numeratorSum = (this.getNumerator() * other.getDenominator() ) +
                       (other.getNumerator() * this.getDenominator() );
    RationalNumber x = new RationalNumber (numeratorSum, commonDenominator);
    return x;
  }

  public RationalNumber subtract(RationalNumber other) {
    RationalNumber invert = new RationalNumber(-1, 1);
    RationalNumber y = this.add(other.multiply(invert));
    return y;
  }
}
