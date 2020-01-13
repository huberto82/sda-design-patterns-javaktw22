package builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class User {
    private String name;
    private String email;
    private LocalDate birthDate;
}
