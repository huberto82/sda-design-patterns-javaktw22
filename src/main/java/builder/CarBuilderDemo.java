package builder;

import java.util.Collection;

public class CarBuilderDemo {
    public static void main(String[] args) {
        //Poprawne wykorzystanie buildera wbudowanegow klasę Car
        Car maluch = Car.builder().brand("FSM").horsePower(20).build();

        Car kaszlak = new Car.Builder().brand("FSO").model("AAA").build();
        Car.Builder builder = new Car.Builder().brand("DAEWOO");
        Car tico = builder.model("TICO").horsePower(30).build();
        Car matiz =builder.brand("MATIZ").regestrationNumber("TK784488").build();

        //Prezentacja klasy CarBuilder
        Car auto = CarBuilder.builder().brand("FIAT").model("FIAT 125P").horsePower(30).build();

    }
}
