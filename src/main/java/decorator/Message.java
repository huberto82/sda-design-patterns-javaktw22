package decorator;

import java.util.Objects;

public class Message extends AbstractMessage {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message1 = (Message) o;
        return Objects.equals(getMessage(), message1.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage());
    }
}
