package Task1;

public class Main {
    public static void main(String[] args){
        Driver driver1 = new Driver("Simone",21);
        Car car1 = new Car("Chevrolet Corvette","C5",2002,"2-door coupé");
        Car car2 = new Car("Audi","A5",2023,"2-door coupé");
        car1.setDriver(driver1);
        car2.setDriver(driver1);
        System.out.println(car1);
        System.out.println(car2);
    }
}
