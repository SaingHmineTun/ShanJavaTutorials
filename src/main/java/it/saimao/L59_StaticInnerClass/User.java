package it.saimao.L59_StaticInnerClass;

import java.time.LocalDate;

public class User {

    private String name;
    private int age;
    private boolean active;
    private LocalDate birthday;

    public User(String name, int age, boolean active, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.birthday = birthday;
    }

    public User() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static class Builder {

        private String name;
        private int age;
        private boolean active;
        private LocalDate birthday;

        // Intermediate method
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Builder setBirthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        // Terminate method
        public User build() {
            return new User(name, age, active, birthday);
        }


    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                ", birthday=" + birthday +
                '}';
    }
}
