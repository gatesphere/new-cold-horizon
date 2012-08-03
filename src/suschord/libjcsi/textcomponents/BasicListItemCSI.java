package suschord.libjcsi.textcomponents;

import net.slashie.libjcsi.CSIColor;

public class BasicListItemCSI {

    private String rowData;
    private char index;
    private CSIColor indexColor;

    public BasicListItemCSI(char index, CSIColor indexColor, String data) {
        setRow(data);
        this.index = index;
        this.indexColor = indexColor;
    }

    public String getRow() {
        return rowData;
    }

    public void setRow(String data) {
        rowData = data;
    }

    public void setIndex(char index) {
        this.index = index;
    }

    public void setIndexColor(CSIColor indexColor) {
        this.indexColor = indexColor;
    }

    public char getIndex() {
        return index;
    }

    public CSIColor getIndexColor() {
        return indexColor;
    }
}
