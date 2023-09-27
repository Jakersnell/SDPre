public class Objective4Lab1 {
  public static void main(String[] args) {
    String fname;
    String lname;
    String favoriteAnimal;
    String favoriteFood;
    String favoriteSong;

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("What is your first name?");
    fname = scanner.nextLine();
    System.out.println("What is your last name?");
    lname = scanner.nextLine();
    System.out.println("What is your favorite animal?");
    favoriteAnimal = scanner.nextLine();
    System.out.println("What is your favorite food?");
    favoriteFood = scanner.nextLine();
    System.out.println("What is your favorite song?");
    favoriteSong = scanner.nextLine();
    
    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");
    scanner.close();
  }
}
