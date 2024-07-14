package it.saimao;

/*
AND (&&) [ both true then true ]
true && true = true
false && true = false
true && false = false
false && false = false

OR (||) [ either true then true ]
true || true = true
true || false = true
false || true = true
false || false = false

NOT (!)
 */
public class L12_LogicalOperators {
    public static void main(String[] args) {

        boolean first = true;
        boolean second = false;
        boolean and = first && second;
        System.out.println(and);

        int name = 123;
        int password = 456;
        boolean or = name >= 123 || password != 456;
        System.out.println(or);

        boolean not = !(name % 2 == 1);
        System.out.println(not);

    }
}
