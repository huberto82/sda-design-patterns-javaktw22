package command;
import java.io.PrintStream;

public class PrintStarsFromInput implements Command {
    private PrintStream output;
    private InputInt number;

    public PrintStarsFromInput(PrintStream output, InputInt number) {
        this.output = output;
        this.number = number;
    }

    @Override
    public void execute() {
        for(int i=0; i < number.getNumber(); i++)
            output.print("*");
        output.println();
    }
}
