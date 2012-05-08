import net.slashie.libjcsi.*;
import net.slashie.libjcsi.wswing.*;

public class SwingTest {
  static int x = 8;
  static int y = 8;
  
  public static void main(String[] args) {
    ConsoleSystemInterface csi = null;
    try {
      csi = new WSwingConsoleInterface("SwingTest.java", false);
    } catch (Exception ex) {ex.printStackTrace();}
    do {
      csi.cls();
      csi.print(x, y, "@", ConsoleSystemInterface.RED);
      csi.refresh();
      CharKey key = csi.inkey();
      System.out.println(key);
      if(key.isUpArrow()) y--;
      if(key.isDownArrow()) y++;
      if(key.isLeftArrow()) x--;
      if(key.isRightArrow()) x++;
      if(key.code == CharKey.ESC) System.exit(0);
      System.out.println(x);
      System.out.println(y);
    } while(true);
  }
}