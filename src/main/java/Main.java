import consoleout.ConsoleOut;
import logic.MenuPressedKey;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean shouldContinue;
    ConsoleOut consoleOut = new ConsoleOut();
    MenuPressedKey menuPressedKey = new MenuPressedKey();
    Scanner scanner = new Scanner(System.in);
    do {
      consoleOut.showMenu();
      while (!scanner.hasNextInt()) {
        consoleOut.pressedOtherThanInt();
        scanner.nextLine();
      }
      shouldContinue = menuPressedKey.checkPressedKey(scanner.nextInt());
      scanner.nextLine();

    } while (shouldContinue);
  }
}
