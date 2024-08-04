package it.saimao.L42_LocalVsGlobal;
/*
Scope
1. Global scope
2. Local scope (method, constructor)
3. Block scope
 */
public class Person {
    int age; // state or global variable
    void printAge() {
        int x = 25; // local variable
        System.out.println(age);

        if (true) {
            char ch = 'a';
            System.out.println(x);
        }

    }
    Person(int age) {
        int y = 25; // local variable
        this.age = age;
    }
}
