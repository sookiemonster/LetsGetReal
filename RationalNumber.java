public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(nume/deno);
    numerator = nume;
    denominator = deno;
  }
}
