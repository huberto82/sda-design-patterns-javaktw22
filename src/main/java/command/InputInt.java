package command;

import java.io.InputStream;
import java.util.Scanner;

public class InputInt implements Command {

    private InputStream input;
    private int number;

    public InputInt(InputStream input) {
        this.input = input;
    }

    @Override
    public void execute() {
        number = new Scanner(input).nextInt();
    }

    public int getNumber() {
        return number;
    }
}
