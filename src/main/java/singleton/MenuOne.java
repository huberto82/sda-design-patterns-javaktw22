package singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MenuOne {
    private static final MenuOne instance = new MenuOne();
    private Scanner scanner = new Scanner(System.in);
    private List<String> options = Arrays.asList(
            "1. Oblicz pole koła",
            "2. Oblicz pole kwadratu",
            "3. Oblicz pole trójkąta",
            "4. Koniec");

    private MenuOne(){
    }

    public static MenuOne getInstance(){
        return instance;
    }

    public void display(){
        for(String option: options){
            System.out.println(option);
        }
    }

    public String select(){
        System.out.println("Wybierz opcję:");
        int selected = scanner.nextInt();
        return options.get(selected - 1);
    }
}
