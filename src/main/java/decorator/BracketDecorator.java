package decorator;

public class BracketDecorator extends AbstractMessageDecorator {
    private String bracket;

    public BracketDecorator(AbstractMessage message, String bracket) {
        super(message);
        this.bracket = bracket;
    }

    @Override
    public String getMessage() {
        return bracket + message.getMessage() + bracket;
    }
}
