package suschord.libjcsi.textcomponents;

import java.util.*;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.CSIColor;

public class ListBoxCSI extends ListBox {
  
  public ListBoxCSI(ConsoleSystemInterface si) {
    super(si);
  }
  
  public void draw() {
        drawBorder();
        clearBox();
        int length = (itemsLista.size() < super.inHeight ? itemsLista.size() : super.inHeight);
        for (int i = 0; i < length; i++) {
            BasicListItemCSI item = (BasicListItemCSI) itemsLista.elementAt(i);
            si.print(inPosition.x, inPosition.y + i, item.getIndex(), item.getIndexColor());
            if (item.getRow().length() > inWidth) {
                si.print(inPosition.x + 2, inPosition.y + i, item.getRow().substring(0, inWidth), foreColor);
            } else {
                si.print(inPosition.x + 2, inPosition.y + i, item.getRow(), foreColor);
            }
        }
  }
  
  @SuppressWarnings("unchecked")
  public void addElement(BasicListItemCSI element) {
        itemsLista.add(element);
  }
  
}
