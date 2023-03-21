package hw_5.model;

import java.util.ArrayList;
import java.util.List;

public class Zoo<E extends Animal> {
    private String name;
    private Integer numbersOfSeats;

    List<E> allAnimals= new ArrayList<>();

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", numbersOfSeats=" + numbersOfSeats +
                ", allAnimals=" + allAnimals +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Zoo(String name, Integer numbersOfSeats, List<E> allAnimals) {
        this.name = name;
        this.numbersOfSeats = numbersOfSeats;
        this.allAnimals = allAnimals;
    }
}
