package decorator;

abstract public class AbstractMessageDecorator extends AbstractMessage{
    AbstractMessage message;

    public AbstractMessageDecorator(AbstractMessage message) {
        this.message = message;
    }

    public abstract String getMessage();
}
