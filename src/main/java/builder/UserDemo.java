package builder;

import java.time.LocalDate;

public class UserDemo {
    public static void main(String[] args) {
        User admin = User.builder()
                .email("ola@op.pl")
                .name("ola")
                .birthDate(LocalDate.of(2000,10,11))
                .build();
        System.out.println(admin);
    }
}
