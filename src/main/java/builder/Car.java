package builder;

public class Car {
    private String model;
    private String registrationNumber;
    private String brand;
    private int horsePower;

    public Car(String model, String registrationNumber, String brand, int horsePower) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String model;
        private String registrationNumber;
        private String brand;
        private int horsePower;

        public Builder() {
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }

        public Builder regestrationNumber(String number){
            this.registrationNumber = number;
            return this;
        }

        public Builder brand(String brand){
            this.brand = brand;
            return this;
        }

        public Builder horsePower(int power){
            this.horsePower = power;
            return this;
        }

        public Car build(){
            return new Car(model, registrationNumber, brand, horsePower);
        }
    }
}
