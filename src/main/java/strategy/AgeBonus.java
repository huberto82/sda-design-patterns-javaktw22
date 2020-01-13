package strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class AgeBonus implements Bonus{
    private LocalDate now;
    private  LocalDate birth;

    public AgeBonus(LocalDate now, LocalDate birth) {
        this.now = now;
        this.birth = birth;
    }

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(new BigDecimal(100-getAge())).divide(new BigDecimal(100));
    }

    private int getAge(){
        //alternatywna metoda do obliczenia pełnych lat
        Period period = Period.between(birth, now);
        return now.getYear() - birth.getYear();
    }
}
