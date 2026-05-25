// The final keyword in Java is used to restrict modification.
// It can be used with - Variables, Methods and Classes


final class Vehicle {  // cannot be inherited, or no subclasses of this be created
    final int speed = 100;  // value cannot be changed. So value must be assigned along with the declaration of the variable.
    final void showSpeed() {  // cannot be overridden
        System.out.println(speed);
    }
}
public class Final {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        v.showSpeed();
    }
    
}