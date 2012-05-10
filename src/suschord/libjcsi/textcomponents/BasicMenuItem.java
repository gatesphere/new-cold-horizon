package suschord.libjcsi.textcomponents;

public class BasicMenuItem implements MenuItem {

    private char menuchar;
    private int color;
    private String desc;

    public BasicMenuItem(char menuchar, int color, String desc) {
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

    public void setMenuColor(int color) {
        this.color = color;
    }

    public char getMenuChar() {
        return menuchar;
    }

    public int getMenuColor() {
        return color;
    }
}
