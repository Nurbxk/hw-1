package com.company;

/**
 * Created by User on 06.10.2021.
 */
public class Grandma {
    private int IQ;
    private String  hobby;
    private Activities activities1;
    private House house;


    public Grandma(int IQ, String hobby, Activities activities1, House house) {
        this.IQ = IQ;
        this.hobby = hobby;
        this.activities1 = activities1;
        this.house = house;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Activities getActivities1() {
        return activities1;
    }

    public void setActivities1(Activities activities1) {
        this.activities1 = activities1;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getInfo(){
        return "Hobby "  +   hobby +
                "\nIQ " + IQ +
                        "\nActive "  + activities1  +
                 "\nAdress "  + house.getAddress() ;}
    }

