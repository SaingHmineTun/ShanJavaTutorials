package it.saimao.L63_Singleton;

/*
1) Prohibit creating object using new keyword
2) Create static variable of current class
3) Allow creating object via static method
 */
public class User {

    private static User user;
    public static User getInstance(String name) {
        if (user == null) user = new User(name);
        return user;
    }

    private User() {
    }

    private String name;

    private User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
