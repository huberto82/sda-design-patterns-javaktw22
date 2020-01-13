package decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class DecoratorDemo {
    public static void main(String[] args) throws FileNotFoundException {
        AbstractMessage message = new Message("Hello World!");
        System.out.println(message.getMessage());
        AbstractMessage decoratedMessage = new StarsDecorator(message);
        System.out.println(decoratedMessage.getMessage());
        System.out.println(new StarsDecorator(message).getMessage());
        System.out.println(new CenterDecorator(message, 80).getMessage());

        System.out.println(new BracketDecorator(new BracketDecorator(message, "|"),"#").getMessage());
    }
}
