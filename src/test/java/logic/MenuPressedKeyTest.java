package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuPressedKeyTest {

  @Test
  void checkPressedKey() {
    int numberTestExit = 0;
    int numberTestNotInRange = 10;
    int numberTestInRange = 2;
    var menuPressedKey = new MenuPressedKey();
    assertFalse(menuPressedKey.checkPressedKey(numberTestExit));
    assertTrue(menuPressedKey.checkPressedKey(numberTestNotInRange));
    assertTrue(menuPressedKey.checkPressedKey(numberTestInRange));
  }
}