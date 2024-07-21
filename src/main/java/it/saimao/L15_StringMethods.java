package it.saimao;

public class L15_StringMethods {
    public static void main(String[] args) {

        // Lower & Upper
        String name = "Sai Mao";
        String lower;
        lower = name.toLowerCase();
        System.out.println(lower);
        String upper = name.toUpperCase();
        System.out.println(upper);

        // Empty & Blank
        String password = " ";
        boolean isEmpty = password.isEmpty();
        System.out.println(isEmpty);
        System.out.println(password.isBlank());

        // Equals, StartsWith, EndsWith, Contains
        String first = new String("Sai"); // Fake address - #1234
        String last = new String("Sai"); // Fake address - #1235
        boolean isEqual = first.equals(last);
        System.out.println(isEqual);
        System.out.println(first.startsWith("Sa"));
        System.out.println(first.endsWith("a"));
        System.out.println(first.contains("a"));

        // Concatenation
        String one = "One";
        String two = "Two";
        String three = one.concat(two);
        String four = one.concat(two.concat(three));
        String five = one + two + three + four;
        String six = one + 2 + 3 + 4 + 5;
        System.out.println(six);

    }
}
