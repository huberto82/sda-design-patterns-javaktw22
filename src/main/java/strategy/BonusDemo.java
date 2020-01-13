package strategy;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BonusDemo {
    public static void main(String[] args) {
        RegularBonus regular = new RegularBonus();
        AgeBonus ageBonus = new AgeBonus(LocalDate.now(), LocalDate.of(2000,10,10));
        List<Bonus> bonuses = Arrays.asList(regular, ageBonus);
        BigDecimal glasses = new BigDecimal("10000");
        for(Bonus b: bonuses){
            glasses = b.calculate(glasses);
        }
        System.out.println(glasses);
    }
}
