public class Driver {
  public static void main(String[] args) {
    RealNumber a = new RealNumber(1.0);
    RealNumber b = new RealNumber(1.0);
    RealNumber c = new RealNumber(1.0000234254);
    RealNumber d = new RealNumber(-42);
    RealNumber e = new RealNumber(2);
    RealNumber f = new RealNumber(3);
    RealNumber g = new RealNumber(5);

    System.out.println(a);
    System.out.println(a.getValue());

    System.out.println(a.equals(b)); // Should return true
    System.out.println(a.equals(c)); // Should return false

    System.out.println();
    System.out.println(a.add(b));
    System.out.println(a.add(c));

    System.out.println();
    System.out.println(a.multiply(b));
    System.out.println(d.multiply(e));

    System.out.println();
    System.out.println(a.divide(b));
    System.out.println(d.divide(e));
    System.out.println(d.divide(f));
    System.out.println(d.divide(g));

    System.out.println();
    System.out.println(c.subtract(a));
    System.out.println(g.subtract(f));
    System.out.println(d.subtract(f));
    System.out.println(f.subtract(d));

    // RationalNumber ====================================
    System.out.println();
    System.out.println("Rational Number Tests");
    System.out.println();
    RationalNumber n1 = new RationalNumber(4, 2);
    RationalNumber n2 = new RationalNumber(1, 2);
    RationalNumber n3 = n1.reciprocal();
    RationalNumber n4 = new RationalNumber(2, 1);
    RationalNumber n5 = n4.reciprocal();

    System.out.println();
    System.out.println(n1);
    System.out.println(n2);

    System.out.println();
    System.out.println(n1.getNumerator());
    System.out.println(n1.getDenominator());

    System.out.println();
    System.out.println(n2.getNumerator());
    System.out.println(n2.getDenominator());

    System.out.println();
    System.out.println(n3.getNumerator());
    System.out.println(n3.getDenominator());

    System.out.println();
    System.out.println(n2.equals(n3));
    System.out.println(n2.equals(n5));
    System.out.println(n2.equals(n4));

    System.out.println();
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    System.out.println(n4);
    System.out.println(n5);

    // System.out.println();
    // System.out.println("2: " + RationalNumber.gcd(4, 2));
    // System.out.println("1: " + RationalNumber.gcd(4, 3));
    // System.out.println("20: " + RationalNumber.gcd(20, 40));
    // System.out.println("5: " + RationalNumber.gcd(10, 15));
    // System.out.println("0: " + RationalNumber.gcd(0, 2));
    // System.out.println("1: " + RationalNumber.gcd(1, 2));

    RationalNumber n6 = new RationalNumber(1, -2);
    System.out.println();
    System.out.println("Should be 2/1: "  + n1);
    System.out.println("Should be -1/2: " + n6);
    System.out.println("Should be -2/1: " + n6.reciprocal());

    RationalNumber n7 = new RationalNumber(-3, 2);
    System.out.println("-3/2: "+ n7);

    RationalNumber n8 = new RationalNumber(6, -4);
    System.out.println("-3/2: "+ n8);

    RationalNumber n9 = new RationalNumber(-6, -4);
    System.out.println("3/2: "+ n9);

    RationalNumber n10 = new RationalNumber(-1200, -600);
    System.out.println("2/1: "+ n10);

    RationalNumber n11 = new RationalNumber(-42, -94);
    System.out.println("21/47: "+ n11);

    RationalNumber n12 = new RationalNumber(42, -94);
    System.out.println("-21/47: "+ n12);

    System.out.println("Division tests: ");
    RationalNumber n13 = new RationalNumber(2, 0);
    System.out.println("3/1: " + n7.divide(n6));
    System.out.println("-14/47: " + n11.divide(n7));
    System.out.println("0/1: " + n11.divide(n13));

    System.out.println("Multiplication tests: ");
    System.out.println("3/4: " + n7.multiply(n6));
    System.out.println("1/4: " + n6.multiply(n6));

    System.out.println(n13);
    System.out.println("0/1: " + n13.multiply(n6));

    System.out.println("Addition tests: ");
    System.out.println("-1/1: " + n6.add(n6)); // -1/2 + (-1/2)
    System.out.println("3/2: " + n6.add(n10)); // -1/2 + (2/1)

    System.out.println("Subtraction tests: ");
    System.out.println("0/1: " + n6.subtract(n6)); // -1/2 - (-1/2)
    System.out.println("-5/2: " + n6.subtract(n10)); // -1/2 - (2/1)

    // ABSTRACT TESTING
    RealNumber num = new RealNumber(0.0);
    RealNumber num2 = new RealNumber(1.0);
    RealNumber num3 = new RealNumber(0.000);
    RealNumber num4 = new RealNumber(1.1);
    RealNumber num5 = new RealNumber(-1.0);
    RealNumber num6 = new RealNumber(1.0);
    RealNumber num7 = new RealNumber(-2.0);
    System.out.println(num3);
    System.out.println("Should be false: " + num.equals(num2));
    System.out.println("Should be true: " + num.equals(num3));
    System.out.println("Should be false: " + num2.equals(num3));
    System.out.println("Should be false: " + num2.equals(num4));
    System.out.println("Should be false: " + num2.equals(num5));
    System.out.println();
    // COMPARE TO
    System.out.println("-1: " + num.compareTo(num2));
    System.out.println("1: " + num2.compareTo(num));
    System.out.println("-1: " + num5.compareTo(num));
    System.out.println("0: " + num.compareTo(num3));
    System.out.println("0: " + num2.compareTo(num6));
    System.out.println("-1: " + num7.compareTo(num5));
  }
}
