import net.slashie.libjcsi.*;
import net.slashie.util.*;
import net.slashie.libjcsi.wswing.*;
import net.slashie.libjcsi.textcomponents.*;
import java.util.*;

class MyMenuItem implements MenuItem {
  char mchar;
  int color;
  String desc;
  
  public MyMenuItem(char c, int co, String d) {
    this.mchar = c;
    this.color = co;
    this.desc = d;
  }
  
  public char getMenuChar() {return mchar;}
  public int getMenuColor() {return color;}
  public String getMenuDescription() {return desc;}
}

public class SwingTest {
  static Position pos = new Position(2,2);
  
  public static void main(String[] args) {
    //ConsoleSystemInterface csi = null;
    WSwingConsoleInterface csi = null;
    try {
      csi = new WSwingConsoleInterface("SwingTest.java", false);
    } catch (Exception ex) {ex.printStackTrace();}
    
    /*
    DialogBox db = new DialogBox(csi, 1, "What is your name?");
    csi.cls();
    db.draw();
    csi.refresh();
    */
    
    /*
    ListBox lb = new ListBox(csi);
    lb.setPosition(pos.x, pos.y);
    lb.setBorder(true);
    lb.addElement(new BasicListItem('a', ConsoleSystemInterface.RED, "An example item."));
    lb.addElement(new BasicListItem('b', ConsoleSystemInterface.GREEN, "Another example item."));
    System.out.println("CSIColor.RED.getColor(): " + CSIColor.RED.getColor());
    System.out.println("ConsoleSystemInterface.RED: " + ConsoleSystemInterface.RED);
    lb.setWidth(40);
    lb.setHeight(4);
    
    //csi.cls();
    lb.draw();
    csi.refresh();
    
    while(true) {
      csi.waitKey(CharKey.ENTER);
      csi.cls();
      lb.draw();
      lb.drawBorder();
      csi.refresh();
    }
    */
    
    /*
    TextBox tb = new TextBox(csi);
    tb.setPosition(pos.x, pos.y);
    tb.setHeight(4);
    tb.setWidth(22);
    tb.setBorder(true);
    tb.setTitle("Tutorial");
    tb.setText("Welcome to the game.");
    
    tb.draw();
    tb.drawBorder();
    csi.refresh();
    
    while(true);
    */
    
    /*
    TextInformBox tib = new TextInformBox(csi);
    tib.setPosition(pos.x, pos.y);
    tib.setHeight(4);
    tib.setWidth(22);
    tib.setBorder(true);
    tib.setText("Welcome to the game.");
    
    while(true) {
      tib.draw();
      //tib.drawBorder();
      csi.refresh();
      csi.waitKey(CharKey.ENTER);
      tib.addText("Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. Lorem ipsum dolar sit amet. ");
    }
    */
    
    /*
    // menubox is pretty broken...
    MenuBox mb = new MenuBox(csi);
    Vector<MyMenuItem> m_items = new Vector<MyMenuItem>();
    m_items.add(new MyMenuItem('a', ConsoleSystemInterface.RED, "An item."));
    m_items.add(new MyMenuItem('b', ConsoleSystemInterface.GREEN, "An item."));
    m_items.add(new MyMenuItem('c', ConsoleSystemInterface.YELLOW, "An item."));
    m_items.add(new MyMenuItem('d', ConsoleSystemInterface.WHITE, "An item."));
    m_items.add(new MyMenuItem('e', ConsoleSystemInterface.BLUE, "An item."));
    m_items.add(new MyMenuItem('f', ConsoleSystemInterface.BROWN, "An item."));
    m_items.add(new MyMenuItem('g', ConsoleSystemInterface.CYAN, "An item."));
    m_items.add(new MyMenuItem('h', ConsoleSystemInterface.LEMON, "An item."));
    m_items.add(new MyMenuItem('i', ConsoleSystemInterface.MAGENTA, "An item."));
    m_items.add(new MyMenuItem('j', ConsoleSystemInterface.TEAL, "An item."));
    mb.setMenuItems(m_items);
    mb.setPosition(pos.x, pos.y);
    mb.setPrompt("Select something.");
    mb.setPromptSize(9);
    mb.setHeight(10);
    mb.setWidth(22);
    //mb.setBorder(true);
    //mb.setTitle("A menu.");
    
    csi.cls();
    mb.draw();
    //mb.drawBorder();
    csi.refresh();
    
    csi.waitKey(CharKey.ENTER);
    while(true) {
      System.out.println(((MyMenuItem)mb.getSelection()).getMenuDescription());
    }
    */
    
    
    
    do {
      csi.cls();
      csi.print(pos.x, pos.y, "@", ConsoleSystemInterface.RED);
      csi.refresh();
      CharKey key = csi.inkey();
      //System.out.println(key);
      if(key.isUpArrow()) pos.y--;
      if(key.isDownArrow()) pos.y++;
      if(key.isLeftArrow()) pos.x--;
      if(key.isRightArrow()) pos.x++;
      if(key.code == CharKey.ESC) System.exit(0);
      //System.out.println(x);
      //System.out.println(y);
    } while(true);
    
  }
}