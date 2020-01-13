package strategy;
import java.math.BigDecimal;

public interface Bonus {
    BigDecimal calculate(BigDecimal price);
}
