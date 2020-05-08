package module.note;

import java.awt.*;

public abstract class Note {

//    private Image img;
    private char name;
    private final int HEIGHT = 4;
    private final int WIDTH = 5;


    // render the note with given x,y coordinates
    public void renderNote(Graphics g,int x, int y) {
        Color saveColor = g.getColor();
        g.setColor(Color.BLACK);
        g.drawOval(x,y,WIDTH,HEIGHT);
        g.setColor(saveColor);
    }


}
