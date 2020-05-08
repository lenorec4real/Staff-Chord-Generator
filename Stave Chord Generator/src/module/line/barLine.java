package module.line;

public class barLine extends Line {

    private final String dir = "vertical";

    public barLine(int length) {
        super(length);
        direction = dir;
    }
}
