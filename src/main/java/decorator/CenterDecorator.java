package decorator;

public class CenterDecorator extends AbstractMessageDecorator {
    private int width;

    public CenterDecorator(AbstractMessage message, int width) {
        super(message);
        this.width = width;
    }

    @Override
    public String getMessage() {
        int pad = (width - message.getMessage().length())/2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pad; i++){
            sb.append(" ");
        }
        sb.append(message.getMessage());
        return sb.toString();
    }
}
