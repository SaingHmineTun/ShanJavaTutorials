package it.saimao.L58_NormalInnerClass;

public class Computer {

    private String brand;

    public Computer(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // 1. Normal Inner Class
    public class Ram {
        private String model;
        private int capacity;

        public Ram(String model, int capacity) {
            this.model = model;
            this.capacity = capacity;
        }

        public void printInfo() {
            System.out.println("Lenovo Brand - " + brand);
            System.out.println("Ram Model - " + model);
            System.out.println("Ram capacity - " + capacity);
        }


        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }


}
