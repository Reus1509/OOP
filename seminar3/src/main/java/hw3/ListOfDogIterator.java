package hw3;

import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog> {
    private final List<Dog> dogListIteartor;
    private int counter;
    public ListOfDogIterator(List<Dog> dogList){
        dogListIteartor = dogList;
        counter = 0;

    }
    @Override
    public boolean hasNext() {
        return counter < dogListIteartor.size();
    }

    @Override
    public Dog next() {
        if(!hasNext()){
            return null;
        }
        counter++;
        return dogListIteartor.get(counter-1);
    }
}
