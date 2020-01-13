package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Command> history = new ArrayList<>();
        int count = 3;
        while(count-- > 0){
            System.out.println("Podaj ile gwiazdek:");
            InputInt input = new InputInt(System.in);
            input.execute();
            PrintStarsFromInput comm = new PrintStarsFromInput(System.out, input);
            comm.execute();
            history.add(input);
            history.add(comm);
        }
        System.out.println("Historia działań użytkowanika");
        for(Command com:history){
            com.execute();
        }


    }
}
