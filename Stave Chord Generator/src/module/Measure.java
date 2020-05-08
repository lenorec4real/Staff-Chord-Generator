package module;

import module.line.Line;
import module.note.Note;
import module.rest.Rest;

import java.util.List;

// this class represents a measure in a sequence

public class Measure {

    private List<Line> lines;
    private List<Note> notes;
    private List<Rest> rests;
    private int time;
    // the default note is quarter note per beat


    public void renderMeasure() {

    }

    public void addNote(Note note) {

    }
}
