// An enum (enumeration) is a special type in Java used to store a fixed set of constants. Example: Days of week, months, directions, status values

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY
}

enum Laptop {
    HP(50000),
    DELL(60000),
    ASUS(55000);

    private int price;
    Laptop(int price) {
        this.price = price;
    }

    int showPrice() {
        return this.price;
    }
}

public class Enum {

    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println(today); // MONDAY

        switch (today) {
            case MONDAY:
                System.out.println("Start of week");
                break;
            case TUESDAY:
                System.out.println("Second day");
                break;
            case WEDNESDAY:
                System.out.println("Midweek");
                break;
        }


        Laptop l = Laptop.DELL;
        System.out.println(l.showPrice());


        // values() - Returns all enum constants
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // ordinal() - Returns position number
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.TUESDAY.ordinal());

        // valueOf() - Converts string to enum
        Day d = Day.valueOf("MONDAY");
        System.out.println(d);
    }
}
