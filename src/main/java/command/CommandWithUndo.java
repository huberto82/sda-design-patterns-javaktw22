package command;

public interface CommandWithUndo {
    void execute();
    void undo();
}
