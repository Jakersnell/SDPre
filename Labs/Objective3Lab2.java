public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1 = 3.455;
    double side2 = 5.4334;
    double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
    System.out.println(String.format("The hypotenuse of a triangle with sides %f and %f is %f", side1, side2, hypotenuse));
  }
}
