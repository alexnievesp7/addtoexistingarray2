import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    
    String[] roster1 = new String[10];
    
    String[] roster2 = new String [12];
    
    Scanner scan = new Scanner(System.in);
    
    for (int i = 0; i < 10; i++) {
      System.out.println("What is your name?");

      roster1[i] = scan.next();

      roster2[i] = roster1[i];
    
      System.out.println(roster2[i]);
    }
    roster2[10] = "Noah";

    roster2[11] = "Jack";
    
    System.out.println(roster2[10]);
    System.out.println(roster2[11]);

    }
  }
