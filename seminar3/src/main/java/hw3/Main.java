package hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("Барсик"), new Cat("Мурзик"), new Cat("Василий")));
        ListOfDogs dogs = new ListOfDogs();
        dogs.setDogList(List.of(new Dog("Азор", 5, "Боксер"), new Dog("Шарик", 3, "ЧиХуаХуа"), new Dog("Батон", 7, "Такса"),new Dog("Мопс", 11, "Мопс"),new Dog("Азор", 10, "Пудель")));

        System.out.println("До сортировки");
        System.out.println("--------------------");
        Iterator<Dog> dogitr = dogs.iterator();
        while(dogitr.hasNext()){
            System.out.println(dogitr.next().toString());
        }

        System.out.println("--------------------");

        System.out.println("После сортировки");
        System.out.println("--------------------");
        /**
         * Реализуем сортировку по имени а в случае равенства имен по возрасту используя интерфейс Comparable
         */
        List<Dog> allDogs = new ArrayList<>(dogs.getDogList());
        Collections.sort(allDogs);
        for (Dog dog:allDogs
             ) {
            System.out.println(dog);
        }


//        Iterator<Cat> itr = cats.iterator();

//
//        while (itr.hasNext()){
//            System.out.println(itr.next().getName());
//
//        }


    }
}
