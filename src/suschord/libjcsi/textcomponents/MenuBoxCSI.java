package suschord.libjcsi.textcomponents;

import java.util.*;

import net.slashie.libjcsi.CharKey;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.util.*;
import net.slashie.libjcsi.CSIColor;

public class MenuBoxCSI extends MenuBox {

  public MenuBoxCSI(ConsoleSystemInterface si) {
    super(si);
  }
  
  public void draw() {
    drawBorder();
    pages = (int) (Math.floor((items.size() - 1) / (inHeight - promptSize)) + 1);
    clearBox();
    drawBorder();
    if (hasBorder()) {
        si.print(position.x + 2, position.y, title);
    }
    //System.out.println("Drawing promptBox...");
    promptBox.draw();

    int pageElements = inHeight - promptSize + 1;
    Vector shownItems = Util.page(items, pageElements, currentPage);

    int i = 0;
    for (; i < shownItems.size(); i++) {
        BasicMenuItemCSI item = (BasicMenuItemCSI) shownItems.elementAt(i);
        //System.out.println("Item position: " + inPosition.x + ", " + (inPosition.y + i + promptSize));
        si.print(inPosition.x, inPosition.y + i + promptSize, ((char) (97 + i)) + ".");
        si.print(inPosition.x + 2, inPosition.y + i + promptSize, item.getMenuChar(), item.getMenuColor());
        String description = item.getMenuDescription();
        if (description.length() > getWidth() - 5) {
            description = description.substring(0, getWidth() - 6);
        }
        si.print(inPosition.x + 4, inPosition.y + i + promptSize, description);
    }
    si.refresh();
  }
}
