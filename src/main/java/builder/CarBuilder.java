package builder;

public class CarBuilder implements ModelRequired, BrandRequired, OptionalCarParameters{
    private String model;
    private String registrationNumber;
    private String brand;
    private int horsePower;

    private CarBuilder() {
    }

    public static BrandRequired builder(){
        return new CarBuilder();
    }

    @Override
    public ModelRequired brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder registrationNumber(String number){
        this.registrationNumber = number;
        return this;
    }

    public CarBuilder horsePower(int power){
        this.horsePower = power;
        return this;
    }

    public Car build(){
        return new Car(model, registrationNumber, brand, horsePower);
    }
}
