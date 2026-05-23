class Bicycle {

    // field
    int gear = 5;
    void applyBrake() {
        System.out.println("Applying Brake");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {

        // create multiple objects of a single class
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // access field using both objects
        System.out.println(bike1.gear);
        System.out.println(bike2.gear);

        // change value of gear
        bike1.gear = 6;
        bike2.gear = 4;
        System.out.println(bike1.gear);
        System.out.println(bike2.gear);

        // access methods
        bike1.applyBrake();
        bike2.applyBrake();
    }
}
