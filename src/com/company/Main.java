package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // City деген класс тузунуз. (code, name, ...)
        //Эгерде code так сан болсо TreeSetke салыныз.
        //Аларды чонунан кичинесине караган тартипте чыгарыныз.

        List<City> list = new ArrayList<>();
        list.add(new City("Bishkek", 8));
        list.add(new City("New York", 22));
        list.add(new City("Munich", 37));
        list.add(new City("London", 78));

        Set<City> treeSet = new TreeSet<>(list);
        Set<City> treeSetTak = new TreeSet<>(list);

        for (City city : treeSet) {
            if (city.getCode() % 2 != 0) {
                treeSet.add(city);
                System.out.println("cities with don`t even code: ");
                System.out.println(city);
            }
        }
        System.out.println("* * * * * * * * * * *");
        System.out.println("cities with even code: ");
        for (City city : treeSetTak) {
            if (city.getCode() % 2 != 1) {
                treeSetTak.add(city);
                System.out.println(city);
            }
        }


//        System.out.println("All cities: ");
//        //list.forEach(System.out::println);
//        printCity(list);
//
//        TreeSet<City> set = new TreeSet<>(list);
//        for (City city : list) {
//            if (city.getCode() % 2 == 0) {
//                set.add(city);
//                System.out.println("cities with even code: ");
//                //set.forEach(System.out::println);
//                printCity(set);
//            }else {
//                System.err.println("it is not even numbers");
//            }
//            break;
//        }
//    }
//
//
//
//    private static void printCity(Collection<City> coll) {
//        for (City city : coll) {
//            System.out.println(city.getName() + " " + city.getCode());
//        }
//    }
    }
}
