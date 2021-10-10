package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
House house1= new House ("Smanbekova 29");
        Mommy Sasha = new Mommy(122, "Reading",Activities.EMPLOYER, house1,32, "Sasha", 29000);
        System.out.println(Sasha.getInfo());
        Sasha.Salary("EURO", 29000);
        System.out.println("=============");
    Daughter daughter1 =  new Daughter(142, "Skiing", Activities.STUDENT , house1,17, "Olya" , 0, 12);
    Daughter daughter2 = new Daughter(122, "Piano" ,  Activities.STUDENT, house1,12 , "Lilya", 0 , 23);
        System.out.println(daughter1.getInfo());
        daughter1.Salary("SOM", 233);
        System.out.println("========================");

        System.out.println(daughter2.getInfo());
    }

}
