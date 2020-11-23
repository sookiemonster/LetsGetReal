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
    System.out.println(RealNumber.percentDifference(5,7));
    System.out.println(RealNumber.percentDifference(2,2.2422425252));

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
  }
}
