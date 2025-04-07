public class Main {

    public static void main(String[] args) {
        Car muscleCar = new Car.CarBuilder().setMake("Ford").
                setModel("Muscle").
                setYear(2020).
                setEngine("V8").
                setHorsePower(453).build();

        System.out.println(muscleCar+"\n\n");

        Car superCar = new Car.CarBuilder().setMake("Ferrari").
                setModel("SF90").
                setYear(2023).
                setEngine("V12 + Electric engine").
                setHorsePower(870).build();

        System.out.println(superCar+"\n\n");
    }
}
