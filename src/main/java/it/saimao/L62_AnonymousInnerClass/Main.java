package it.saimao.L62_AnonymousInnerClass;

public class Main {
    public static void main(String[] args) {
        MyButton myButton = new MyButton();

        // Anonymous class
        myButton.setOnClickListener(new OnItemClickListener() {
            @Override
            public void onClick(int a, int b) {
                System.out.println("Anonymous - " + a + b);
            }
        });

        // Lambda Expression
        myButton.setOnClickListener((a, b) -> System.out.println("Lambda - " + a + b));
    }
}
