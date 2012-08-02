package suschord.libjcsi.textcomponents;

import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.*;

/**
 *Allows easy creation of a self-sizing box to display information which needs
 * answering input from the user.
 * @author Eben Howard
 */
public class DialogBox extends TextBox {

    /**
     * Creates the box
     * @param si the ConsoleSystemInterface to be attached to
     * @param lines the number of desired lines for the output portion of the box
     * @param args the text to be displayed as output in the box
     */
    public DialogBox(ConsoleSystemInterface si, int lines, String args) {

        super(si);

        int maxLineLength = 0, lineLength = 0, tempLineLength, nextIndex;

        lineLength = args.length();

        for (int i = 1; i < lines; i++) {
            tempLineLength = (lineLength * i) / lines;
            nextIndex = args.indexOf(" ", tempLineLength);
            if (nextIndex == -1) {
                nextIndex = tempLineLength / i;
            }
            maxLineLength = Math.max(maxLineLength, nextIndex);
        }

        if (maxLineLength == 0) {
            maxLineLength = lineLength;
        }

        setWidth(maxLineLength + 3);//this leaves space for the borders and punctuation
        setHeight(lines + 3);//this leaves space for the borders and an input area
        setBorder(true);
        setText(args);
    }
    
    public String getInput(int maxLength) {
      int x = inPosition.x;
      int y = inPosition.y + inHeight;
      si.print(x, y, "_");
      si.refresh();
      StringBuffer sb = new StringBuffer("");
      CharKey key = new CharKey(CharKey.NONE);
      while (true) {
        key = si.inkey();
        if((key.isAlphaNumeric() || key.code == CharKey.SPACE) && x != inPosition.x + maxLength) {
          sb.append(key.toString());
          si.print(x, y, key.toString() + "_");
          si.refresh();
          x++;
        }
        if(key.code == CharKey.ENTER) {
          break;
        }
        if(key.code == CharKey.BACKSPACE && x != inPosition.x) {
          x--;
          si.print(x, y, "_ ");
          si.refresh();
          sb.deleteCharAt(sb.length() - 1);
        }
      }
      si.print(x, y, " ");
      si.refresh();
      return sb.toString();
    }
}