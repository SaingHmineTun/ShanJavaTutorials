package it.saimao.L64_Enumeration;

public enum Month {

    JAN("January"), FEB("February"), MAR("March"),
    APR("April"), MAY("May"), JUN("June");


    private String name;

    Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
