package command;

public class SumOf implements CommandWithUndo {
    private int sum;
    private int element;
    private int counter = 0;

    public SumOf(int sum, int element) {
        this.sum = sum;
        this.element = element;
    }

    @Override
    public void execute() {
        counter++;
        sum = sum + element;
    }

    @Override
    public void undo() {
        if (counter > 0) {
            sum -= element;
            counter--;
        }
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "SumOf{" +
                "sum=" + sum +
                ", element=" + element +
                ", counter=" + counter +
                '}';
    }
}
