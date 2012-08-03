package suschord.newcoldhorizon.tests;

import net.slashie.libjcsi.*;
import net.slashie.util.*;
import net.slashie.libjcsi.wswing.*;
import suschord.libjcsi.textcomponents.*;
import java.util.*;

public class SwingTest {
  static Position pos = new Position(2,2);
  
  public static void main(String[] args) {
    //ConsoleSystemInterface csi = null;
    WSwingConsoleInterface csi = null;
    try {
      csi = new WSwingConsoleInterface("SwingTest.java", false);
    } catch (Exception ex) {ex.printStackTrace();}
       
    
    DialogBox db = new DialogBox(csi, 1, "What is your name?");
    db.setPosition(pos.x, pos.y);
    csi.cls();
    db.draw();
    csi.refresh();
    System.out.println("recieved: " + db.getInput(15));
    csi.waitKey(CharKey.ENTER);
    csi.cls();
    
    ListBox lb = new ListBox(csi);
    lb.setPosition(pos.x, pos.y);
    lb.setBorder(true);
    lb.addElement(new BasicListItem('a', ConsoleSystemInterface.RED, "An example item."));
    lb.addElement(new BasicListItem('b', ConsoleSystemInterface.GREEN, "Another example item."));
    lb.setWidth(40);
    lb.setHeight(4);
    csi.cls();
    lb.draw();
    csi.refresh();
    csi.waitKey(CharKey.ENTER);
    csi.cls();
    
    ListBoxCSI lbc = new ListBoxCSI(csi);
    lbc.setPosition(pos.x, pos.y);
    lbc.setBorder(true);
    lbc.addElement(new BasicListItemCSI('a', CSIColor.ELECTRIC_INDIGO, "An example item (CSIColor)"));
    lbc.addElement(new BasicListItemCSI('b', CSIColor.PEACH_YELLOW, "Another example item (CSIColor)"));
    lbc.setWidth(40);
    lbc.setHeight(4);
    csi.cls();
    lbc.draw();
    csi.refresh();
    csi.waitKey(CharKey.ENTER);
    csi.cls();
    
    TextBox tb = new TextBox(csi);
    tb.setPosition(pos.x, pos.y);
    tb.setHeight(4);
    tb.setWidth(22);
    tb.setBorder(true);
    tb.setTitle("Tutorial");
    tb.setText("Welcome.");
    
    tb.draw();
    csi.refresh();
    csi.waitKey(CharKey.ENTER);
    csi.cls();
    
    TextInformBox tib = new TextInformBox(csi);
    tib.setPosition(pos.x, pos.y);
    tib.setHeight(4);
    tib.setWidth(22);
    tib.setBorder(true);
    
    tib.draw();
    csi.refresh();
    tib.addText("AAAA BBBBB CCCCC DDDDD EEEEE FFFFF GGGGG HHHHH IIIII JJJJJ KKKKK LLLLL MMMMM NNNNN OOOOO PPPPP QQQQQ RRRRR SSSSS TTTTT WWWWW XXXXX YYYYY ZZZZZ AAAA BBBBB CCCCC DDDDD EEEEE FFFFF GGGGG HHHHH IIIII JJJJJ KKKKK LLLLL MMMMM NNNNN OOOOO PPPPP QQQQQ RRRRR SSSSS TTTTT WWWWW XXXXX YYYYY ZZZZZ AAAA BBBBB CCCCC DDDDD EEEEE FFFFF GGGGG HHHHH IIIII JJJJJ KKKKK LLLLL MMMMM NNNNN OOO PPPPP QQQQQ RRRRR SSSSS TTTTT WWWWW XXXXX YYYYY ZZZZZ");
    csi.refresh();
    csi.waitKey(CharKey.ENTER);
    tib.clear();
    csi.refresh();
    csi.waitKey(CharKey.ENTER);
    csi.cls();
    
    MenuBox mb = new MenuBox(csi);
    Vector<BasicMenuItem> m_items = new Vector<BasicMenuItem>();
    m_items.add(new BasicMenuItem('a', ConsoleSystemInterface.RED, "An item."));
    m_items.add(new BasicMenuItem('b', ConsoleSystemInterface.GREEN, "An item."));
    m_items.add(new BasicMenuItem('c', ConsoleSystemInterface.YELLOW, "An item."));
    m_items.add(new BasicMenuItem('d', ConsoleSystemInterface.WHITE, "An item."));
    m_items.add(new BasicMenuItem('e', ConsoleSystemInterface.BLUE, "An item."));
    m_items.add(new BasicMenuItem('f', ConsoleSystemInterface.BROWN, "An item."));
    m_items.add(new BasicMenuItem('g', ConsoleSystemInterface.CYAN, "An item."));
    m_items.add(new BasicMenuItem('h', ConsoleSystemInterface.LEMON, "An item."));
    m_items.add(new BasicMenuItem('i', ConsoleSystemInterface.MAGENTA, "An item."));
    m_items.add(new BasicMenuItem('j', ConsoleSystemInterface.TEAL, "An item."));
    mb.setMenuItems(m_items);
    mb.setPosition(pos.x, pos.y);
    mb.setHeight(10);
    mb.setWidth(22);
    mb.setBorder(true);
    mb.setPromptSize(1);
    mb.setPrompt("Select something.");
    mb.setTitle("A menu.");
    
    csi.cls();
    mb.draw();
    csi.refresh();
    System.out.println(((BasicMenuItem)mb.getSelection()).getMenuDescription());
    
    
    MenuBoxCSI mbc = new MenuBoxCSI(csi);
    Vector<BasicMenuItemCSI> mc_items = new Vector<BasicMenuItemCSI>();
    mc_items.add(new BasicMenuItemCSI('a', CSIColor.PERSIAN_PINK, "An item."));
    mc_items.add(new BasicMenuItemCSI('b', CSIColor.PUMPKIN, "An item."));
    mc_items.add(new BasicMenuItemCSI('c', CSIColor.PUCE, "An item."));
    mc_items.add(new BasicMenuItemCSI('d', CSIColor.MAYA_BLUE, "An item."));
    mc_items.add(new BasicMenuItemCSI('e', CSIColor.MAGIC_MINT, "An item."));
    mc_items.add(new BasicMenuItemCSI('f', CSIColor.MISTY_ROSE, "An item."));
    mc_items.add(new BasicMenuItemCSI('g', CSIColor.VIRIDIAN, "An item."));
    mc_items.add(new BasicMenuItemCSI('h', CSIColor.TYRIAN_PURPLE, "An item."));
    mc_items.add(new BasicMenuItemCSI('i', CSIColor.TOMATO, "An item."));
    mc_items.add(new BasicMenuItemCSI('j', CSIColor.ECRU, "An item."));
    mbc.setMenuItems(mc_items);
    mbc.setPosition(pos.x, pos.y);
    mbc.setHeight(10);
    mbc.setWidth(22);
    mbc.setBorder(true);
    mbc.setPromptSize(1);
    mbc.setPrompt("Select something.");
    mbc.setTitle("A menu (CSIColor).");
    
    csi.cls();
    mbc.draw();
    csi.refresh();
    System.out.println(((BasicMenuItemCSI)mbc.getSelection()).getMenuDescription());
    
    System.exit(0);
  }
}
