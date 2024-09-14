package it.saimao.L74_Generic;

public class UserGeneric<T> {
    String name;
    T password;

    public <S> S print(S s) {
        return s;
    }

    public void add(T t) {

    }

}
