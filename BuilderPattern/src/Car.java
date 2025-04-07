import java.net.http.WebSocket;

public class Car {
    private String make;
    private String model;
    private int year;
    private String engine;
    private int horsePower;


    private Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.engine = builder.engine;
        this.horsePower = builder.horsePower;
    }

    @Override
    public String toString() {
        return "Make - "+make+"\nModel - "+model+"\nYear - "+year+"\nEngine - "+engine+"\nHorse Power - "+horsePower;
    }

    public static class CarBuilder {
        private String make;
        private String model;
        private int year;
        private String engine;
        private int horsePower;

        public CarBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }
        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }
        public Car build() {
            return new Car(this);
        }

    }
}
