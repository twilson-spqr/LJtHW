import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, attempt;

    pin = 12345; // Yay! Spaceballs!
    password = "Yggdr@sil!";

    System.out.println( "WELCOME TO THE BANK OF JAVA." );
    System.out.print("ENTER YOUR PASSWORD: ");
    attempt = keyboard.nextLine();

    while ( ! attempt.equals(password) ) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      attempt = keyboard.nextLine();
    }

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANGE IS $426.17.");
  }
}
