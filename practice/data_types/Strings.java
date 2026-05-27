public class Strings {
    public static void main(String[] args) {
        // Strings are immutable in Java, once created cannot be changed
        // Creating a string
        String city = "Delhi";
        String state = new String("Rajasthan");

        // length() - Returns number of characters
        System.out.println(state.length()); // output- 9

        // charAt() - Gets character at a position
        System.out.println(city.charAt(2)); // output- l (Postion start from zero) (There is no negative indexing)
        
        // indexOf() - Finds the position of a character or word [returns -1 if not found]
        System.out.println(city.indexOf('l')); // output- 2
        System.out.println(state.indexOf("sthan")); // output- 4

        // toUpperCase() and toLowerCase()
        System.out.println(city.toLowerCase()); // output- delhi
        System.out.println(state.toUpperCase()); // output- RAJASTHAN

        // equals() - compares strings
        System.out.println(city.equals(state)); // output- false (do NOT use == for checking string content)

        // contains()
        System.out.println(state.contains("than")); // output- true

        // substring()
        System.out.println(city.substring(0,3)); // output- Del

        // replace()
        System.out.println(state.replace("sthan","")); // output- Raja

        // String concatenation
        System.out.println(city + " " + state);
        System.out.println(city.concat(state)); //output- DelhiRajasthan

        // trim() - Removes spaces from beginning and end.
        String text = "    Hello Java     ";
        System.out.println(text.trim()); // output- Hello Java

        // split() - Breaks a string into parts
        String fruits = "apple,mango,banana";
        String[] arr = fruits.split(",");
        for (String f : arr) {
            System.out.println(f);
        }

        // startsWith() - Checks beginning text
        System.out.println(city.startsWith("Del")); // output- true

        // endsWith() - Checks ending text
        System.out.println(state.endsWith("sthan")); // output- true

        // isEmpty() - checks if string length is zero
        String s = "";
        System.out.println(s.isEmpty()); // output- true

        // isBlank() - checks if string contains only spaces
        String str = "   ";
        System.out.println(str.isBlank()); // output- true
        System.out.println(str.isEmpty()); // output- false


        // If you modify text many times, use StringBuilder
        // append() - adds text at the end
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb); // output- Java Programming

        // insert() - adds text at a specific index
        StringBuilder sb2 = new StringBuilder("Jva");
        sb2.insert(1,"a");
        System.out.println(sb2); // output- Java

        // delete() - delete characters
        sb.delete(4, 16);
        System.out.println(sb); // output- Java

        // reverse() - reverses the string
        sb.reverse();
        System.out.println(sb); // output- avaJ

        // replace() - Replaces part of the text
        StringBuilder sb3 = new StringBuilder("I like dogs");
        sb3.replace(7, 11, "cat");
        System.out.println(sb3); // output- I like cat

        // capacity() - Shows current capacity [How many characters a StringBuilder can store before increasing memory automaticaly][default capacity is 16]
        // capacity = 16 + string length [if initialized with a string]
        System.out.println(sb.capacity()); // output- 20
        sb.append(" Programming");
        System.out.println(sb.capacity()); // output- 20
        // Expansion only happens when string exceeds current capacity. Then Java automatically doubles it + 2.
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity()); // output- 16
        // setting custom capacity
        StringBuilder sb5 = new StringBuilder(20);
        System.out.println(sb5.capacity()); // output- 20
    }
}
