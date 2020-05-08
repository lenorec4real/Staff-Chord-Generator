package ui;

import module.note.Note;
import module.note.WholeNote;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class ControlPanel extends JPanel {

    private List<JButton> keyButtons;
    private JButton addNoteButton;
    private String key;
    private String type;
    private Note currentNote;

    public ControlPanel() {
        String[] keyNames = {"C", "D", "E", "F", "G", "A", "B"};
        createKeyButtons(keyNames);
        createNoteTypes();
        addNoteButton = new JButton("add the note");
        addNoteButton.addActionListener(e -> addNote());
    }

    // construct a new note and add it to the chart
    private void addNote() {
        switch (type) {
            case "whole note":
                currentNote = new WholeNote();
                break;
                case

        }

    }

    private void createNoteTypes() {
        String[] noteTypes = {"whole note", "half note", "quarter note", "eighth note", "sixteenth note"};
        for (String noteType : noteTypes) {
            JButton btn = new JButton(noteType);
            btn.setActionCommand(noteType);
            btn.addActionListener(e -> setType(e));
        }
    }



    private void createKeyButtons(String[] keyNames) {
        keyButtons = new ArrayList<>();
        for (String c : keyNames) {
            JButton btn = new JButton(String.valueOf(c));
            btn.setActionCommand(c);
            btn.addActionListener(e -> setKey(e));
            keyButtons.add(btn);
        }
    }

    // sets the key of the note
    private void setKey(ActionEvent e) {
        key = e.getActionCommand();
    }

    //sets the length of the note
    private void setType(ActionEvent e) {
        type = e.getActionCommand();
    }
}
