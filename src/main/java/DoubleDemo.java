import builder.OptionalCarParameters;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Optional;
import java.util.Scanner;

public class DoubleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.next();
        System.out.println(parseLocalDate(dateStr));
    }

    static Optional<LocalDate> parseLocalDate(String date){
        try{
            return Optional.ofNullable(LocalDate.parse(date));
        } catch (DateTimeParseException e){
            return Optional.empty();
        }
    }
}
