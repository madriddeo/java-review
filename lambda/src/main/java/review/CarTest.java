package review;

public class CarTest {

    public static void main(String[] args) {

//        Car car = Car.builder().make("Toyota").topSpeed(150).year(2020).build();

//        Car car = new Car("Toyota", 150);

        Car car = Car.builder().make("Toyota").build();
        System.out.println(car);

    }

}
