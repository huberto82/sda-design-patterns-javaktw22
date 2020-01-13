package strategy;

import java.math.BigDecimal;

public class RegularBonus implements Bonus {
    private static final int PERCENT = 10;
    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(new BigDecimal(100-PERCENT)).divide(new BigDecimal("100"));
    }
}
