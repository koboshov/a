package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

//        City деген класс тузунуз. (code, name, ...)
//        Эгерде code так сан болсо TreeSetke салыныз.
//                Аларды чонунан кичинесине караган тартипте чыгарыныз.
//


        Set<City> cities = new TreeSet<>();
        cities.add(new City(2, "America"));
        cities.add(new City(4, "japan"));
        cities.add(new City(1, "Brazil"));
        cities.add(new City(3, "China"));
        cities.add(new City(7, "Dubai"));
        for (City s : cities) {
            System.out.println(s);
        }
        System.out.println("Сорттолгону");
        for (City c : cities) {
            if (c.getCode() % 2 == 1) {
                Set<City> cities1 = new TreeSet<>();
                cities1.add(c);
                System.out.println(c);


            }
        }
    }
}