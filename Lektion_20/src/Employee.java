/**
 * Created by Mahmud Al Hakim
 * Nackademin - Stockholm - Sweden
 * Project: OOP_HT19
 * Date: 2019-12-04 14:02
 * Copyright: MIT
 */

public class Employee {

    private String name;
    private double payRate;
    private final int EMPLOYEE_ID;

    private static int nextID = 1000;

    public static final double STARTING_PAY_RATE = 7.75;

    public Employee(String name) {
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;
    }

    public Employee(String name, double startingPay) {
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = startingPay;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return EMPLOYEE_ID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void changePayRate(double newRate) {
        payRate = newRate;
    }


    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", payRate=" + payRate +
                ", EMPLOYEE_ID=" + EMPLOYEE_ID +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Mahmud");
        Employee e2 = new Employee("James", 100);
        Employee e3 = new Employee("Kalle", 5);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
