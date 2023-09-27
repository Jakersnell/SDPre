import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    boolean running = true;
    while(running){

      printMenu();
      selection = scanner.nextInt();
      switch (selection) {
        case 1:
          sayHello();
          break;
        case 2:
          listFavFoods();
          break;
        case 3:
          System.out.println("Goodbye");
          running = false;
          break;
        default:
          System.out.println("Invalid selection.");
          break;
      }
      
    }

    scanner.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }

  public static void sayHello() {
    System.out.println("Hello Human");
  }
  public static void listFavFoods() {
    System.out.println("Apples, Bananas, Coconuts");
  }
}
