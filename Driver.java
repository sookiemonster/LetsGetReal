public class Driver {
  public static void main(String[] args) {
    RealNumber a = new RealNumber(1.0);
    RealNumber b = new RealNumber(1.0);
    RealNumber c = new RealNumber(1.0000234254);

    System.out.println(a);
    System.out.println(a.getValue());
    System.out.println(RealNumber.percentDifference(5,7));
    System.out.println(RealNumber.percentDifference(2,2.2422425252));
    
    System.out.println(a.equals(b)); // Should return true
    System.out.println(a.equals(c)); // Should return false
  }
}
