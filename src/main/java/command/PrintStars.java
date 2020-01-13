package command;
import java.io.PrintStream;

public class PrintStars implements Command {
    private PrintStream outputStream;
    private  int number;

    public PrintStars(PrintStream outputStream, int number) {
        this.outputStream = outputStream;
        this.number = number;
    }

    @Override
    public void execute() {
        for(int i=0; i < number; i++)
            outputStream.print("*");
        outputStream.println();
    }
}
