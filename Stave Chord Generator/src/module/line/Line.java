package module.line;

import java.awt.*;

public abstract class Line {

    protected int length;

    protected String direction;

    public Line(int length) {
        this.length = length;

    }

    public void renderLine(Graphics g, int x, int y) {
        Color savedColor = g.getColor();
        if (direction == "horizontal") {
            g.drawLine(x,y,x+length,y);
        }
        if (direction == "vertical") {
            g.drawLine(x,y,x,y + length);
        }
        g.setColor(savedColor);
    }

}
