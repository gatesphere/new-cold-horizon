package suschord.libjcsi.textcomponents;

import net.slashie.libjcsi.CSIColor;

public class BasicMenuItemCSI {

    private char menuchar;
    private CSIColor color;
    private String desc;

    public BasicMenuItemCSI(char menuchar, CSIColor color, String desc) {
        setMenuDescription(desc);
        this.menuchar = menuchar;
        this.color = color;
    }

    public String getMenuDescription() {
        return desc;
    }

    public void setMenuDescription(String data) {
        desc = data;
    }

    public void setMenuChar(char menuchar) {
        this.menuchar = menuchar;
    }

    public void setMenuColor(CSIColor color) {
        this.color = color;
    }

    public char getMenuChar() {
        return menuchar;
    }

    public CSIColor getMenuColor() {
        return color;
    }
}
