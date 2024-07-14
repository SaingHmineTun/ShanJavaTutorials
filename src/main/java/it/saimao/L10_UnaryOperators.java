package it.saimao;

/*
Unary operators
- (Negative operator)
! (Not operator)
++ (Increment operator)
-- (Decrement operator)
 */
public class L10_UnaryOperators {
    public static void main(String[] args) {

        int neg = -10; // Negative operator
        boolean not = !true; // Not operator
        System.out.println(not);

        int inc = 10;
        // inc--; // inc = inc + 1 // ++ (increment operator), -- (decrement operator)
        int var = inc++; // postfix increment => take then increase
        System.out.println(var);
        // System.out.println(inc++);
        // System.out.println(++inc); // prefix increment => increase then take

    }
}
