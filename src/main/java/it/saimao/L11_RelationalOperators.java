package it.saimao;

/*
Relational operator
== (Equal)
!= (Not equal)
> (Greater than)
>= (Greater than or equal)
< (Less than)
<= (Less than or equal)
 */
public class L11_RelationalOperators {
    public static void main(String[] args) {
        int x = 20;
        int y = 20;
        boolean isEqual = x == y; // Equal operator
        System.out.println(isEqual);
        System.out.println(x != y); // Not equal operator
        System.out.println(x > y); // Greater than
        System.out.println(x >= y); // Greater than or equal
        System.out.println(x < y); // Less than
        System.out.println(x <= y); // Less than or equal
    }
}
