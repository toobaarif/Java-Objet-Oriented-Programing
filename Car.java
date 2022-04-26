public class Car {
    String brandName;
    double priceNew;
    String color;
    double odometer;

    public double getPriceAfter() {
        return (priceNew * (1 -( odometer/6000)));
    }

    public double updateMileage(double travelDistance) {
          return  odometer+=travelDistance;
    }

    public void outputDetail() {
        System.out.println("Brand of car is: " + brandName);
        System.out.println("Price of new car: " + priceNew);
        System.out.println("Price of used car: " + getPriceAfter());
        System.out.println("Color of car is: " + color);
        System.out.println("Odometer of car is: " + odometer);
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.brandName="Civic";
        obj.priceNew=1000000;
        obj.color="Black";
        obj.odometer=50;
            obj.outputDetail();
        System.out.println("After get price is: "+obj.getPriceAfter());
        System.out.println("Updated mileage is: "+obj.updateMileage(1500));

    }
}