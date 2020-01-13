package builder;

public interface OptionalCarParameters {
    OptionalCarParameters registrationNumber(String number);
    OptionalCarParameters horsePower(int power);
    Car build();
}
