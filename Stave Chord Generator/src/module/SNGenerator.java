package module;

import module.note.Note;

import java.util.ArrayList;
import java.util.List;

public class SNGenerator {

    private final int INTERVAL_LINE = 4;
    private final int time = 4;
    private int currentTime;
    private List<Staff> staffs;
    private Staff currentStaff;
    private List<Measure> measures;
    private Measure currentMeasure;
    private int x; // x coordinate

    public SNGenerator() {
        initialize();
    }

    private void initialize() {
        staffs = new ArrayList<>();
        addStaff();
        measures = new ArrayList<>();
        currentMeasure = new Measure();
    }

    private void addNote(Note note) {
        currentMeasure.addNote(note);
        checkMeasureComplete();
    }

    // adds a new line of staff
    private void addStaff() {
        staffs.add(new Staff());

    }

    private void checkMeasureComplete() {
        if (measureComplete()) {
            addBarLine();
        }
    }

    private void addBarLine() {
        currentStaff.addBarLine(x);
    }

    private boolean measureComplete() {
        return (currentTime == time);
    }

//    private void checkNotesComplete() {
//        if (notesComplete())
//    }



}
