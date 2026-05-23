class Data {
    public String name = "John";  // public
    int id = 5;  //default
    private int salary = 100000;  // private

}

/*
| access modifier |          maximum range        |
|-----------------|-------------------------------|
|     private     |           same class only     |
|     protected   |     same package + subclass   |
|     default     |          same package only    |
|     public      |    any package (everywhere)   |
*/



public class AccessModifier {
    public static void main(String[] args) {
        Data emp1 = new Data();
        System.out.println("name: " + emp1.name);
        System.out.println("id: " + emp1.id);
        // System.out.println("salary: " + emp1.salary);  --> error, as salary is a private attribute
        
    }
}
