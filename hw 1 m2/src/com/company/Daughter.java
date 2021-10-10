package com.company;

/**
 * Created by User on 06.10.2021.
 */
public class Daughter extends Mommy {
    private int ammountOfFriends;

    public int getAmmountOfFriends() {
        return ammountOfFriends;
    }


    public Daughter(int IQ, String hobby, Activities activities1, House house, int age, String name, int salary, int ammountOfFriends) {
        super(IQ, hobby, activities1, house, age, name, salary);
        this.ammountOfFriends = ammountOfFriends;
    }

    @Override
    void Salary(String currency, int ammountofsalary) {
        super.Salary(currency, ammountofsalary);
    }

}
