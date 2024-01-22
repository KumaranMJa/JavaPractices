abstract class Vehicle{
    String model;
    int year;
    abstract void displayDetails();
}
interface rentalCost{
    abstract int calculateRentalCost(int dur,int ty);
}
class Car extends Vehicle implements rentalCost{
    public void displayDetails(){
        System.out.println("Its Car(Four-Wheeler)");
    }
    public int calculateRentalCost(int dur,int ty){
        int cost=0;
        //calculations
        int duration=dur;
        int type=ty;
        cost = duration * type;
        return cost;
    }
}
class Bike extends Vehicle implements rentalCost{
    int year = 2010;
    public void displayDetails(){
        System.out.println("Its Bike(Two-Wheeler)");
    }
    public int calculateRentalCost(int dur,int ty){
        //calculation
        int cost =0;
        int duration=dur;
        int type=ty;
        cost = duration * type;
        return cost;
    }
}
class HeavyVehicle extends Vehicle implements rentalCost{
    public void displayDetails(){
        System.out.println("Its Truck");
    }
    public int calculateRentalCost(int dur,int ty){
        int cost =dur;
        //calcultion
        int duration=0;
        int type=ty;
        cost = duration * type;
        return cost;
    }
}

public class classexercise02 {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.displayDetails();
        System.out.println(obj.year);
        System.out.println(obj.calculateRentalCost(3,50));
    }
}
