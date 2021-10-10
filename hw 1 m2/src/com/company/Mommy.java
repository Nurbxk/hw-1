package com.company;

/**
 * Created by User on 06.10.2021.
 */
public class Mommy extends Grandma{
    private int age;
    private String name;
    private int salary;

    public Mommy(int IQ, String hobby, Activities activities1, House house, int age, String name, int salary) {
        super(IQ, hobby, activities1, house);
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    void Salary (String currency, int ammountofsalary){
        System.out.println(currency + " " + ammountofsalary);
    }
    final void Salary(int ammountofsalary){
        System.out.println(ammountofsalary);
    }
}
