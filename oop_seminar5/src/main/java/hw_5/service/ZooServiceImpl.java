package hw_5.service;

import hw_5.model.Animal;

import java.io.FileWriter;
import java.util.List;

public class ZooServiceImpl implements ZooService{
    @Override
    public void addAnimal(Animal animal, List allAnimals) {
        try{
           allAnimals.add(animal);
        } catch (Exception e){
            System.out.println("error during add user to List");
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAnimal(Animal animal, List allAnimals) {
        try{
            allAnimals.remove(animal);
        }catch (Exception e){
            System.out.println("error during add user to List");
            e.printStackTrace();
        }
    }

    @Override
    public void printAllAnimals(List allAnimals) {
        System.out.println(allAnimals.toString());
        try(FileWriter fileWriter = new FileWriter("zoo.txt")){
            fileWriter.write(allAnimals.toString());
        } catch (Exception e){
            System.out.println("error during saving user to file");
            e.printStackTrace();
        }
    }

    @Override
    public void searchAnimal(String name, List allAnimals) {
        if(allAnimals.equals(name)){
            System.out.println("Данное животное в этом зоопарке");
        }
        else{
            System.out.println("Данного животного нет в этом зоопарке");
        }
    }
}
