package module;

import module.line.Line;
import module.line.StaffLine;

import java.util.ArrayList;
import java.util.List;

// this class represents a staff that include 5 staff lines.
public class Staff {

    private List<Line> staffLines;
    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;
    private Line line5;
    private final int length = 10;

    public Staff() {
        staffLines = new ArrayList<>();
        for (int i=0; i < 5; i++) {
            staffLines.add(new StaffLine(length));
        }
    }


    public void addBarLine(int x) {
    }
}
