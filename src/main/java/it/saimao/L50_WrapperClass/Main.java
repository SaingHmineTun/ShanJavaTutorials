package it.saimao.L50_WrapperClass;

/*
byte    (Byte)
short   (Short)
int     (Integer)
long    (Long)
float   (Float)
double  (Double)
char    (Character)
boolean (Boolean)
 */
public class Main {
    public static void main(String[] args) {
        Boolean b = true;
        boolean bb = b; // Wrapper to primitive is Unboxing
        Boolean bbb = bb; // primitive to wrapper is Autoboxing!

        char ch = 'a';
        a(ch);

    }


    private static void a(Object obj) {
        System.out.println(obj);
    }

}
