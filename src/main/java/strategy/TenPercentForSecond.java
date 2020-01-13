package strategy;

import java.math.BigDecimal;
import java.util.List;

public class TenPercentForSecond implements Bonus {
    private List<BigDecimal> order;

    public TenPercentForSecond(List<BigDecimal> order) {
        this.order = order;
    }

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(new BigDecimal("0.9"));
    }
}
