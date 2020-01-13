package decorator;

public class StarsDecorator extends AbstractMessageDecorator {

    public StarsDecorator(AbstractMessage message) {
        super(message);
    }

    @Override
    public String getMessage() {
        int count = message.getMessage().length() + 2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++){
            sb.append("*");
        }
        sb.append("\n");
        sb.append("*"+message.getMessage()+"*");
        sb.append("\n");
        for(int i = 0; i < count; i++){
            sb.append("*");
        }
        sb.append("\n");
        return sb.toString();
    }
}
