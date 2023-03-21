package hw_5.view;

import cw_5.model.User;
import hw_5.model.Animal;
import hw_5.model.Zoo;
import hw_5.model.Dog;
import hw_5.model.Cat;
import hw_5.service.ZooService;
import hw_5.service.ZooServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooView {

    public void mainMenu(){
        List<Animal> allAnimals = new ArrayList<>();
        Zoo zoo = new Zoo<>("Кошачий-собачий",15, allAnimals);
        System.out.println("Добрый день!/n Вас приветствует зоопарк, выберите действие которое хотите сделать:/n 1. Добавить животное в зоопарк/n 2. Убрать животное из зоопарка/n 3. Вывести перечень всех животных в зоопарке/n 4. Поиск животного");
        Integer choice = 0;
        Scanner scanner= new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case(1):
                System.out.println("Это собака - 1 или кошка - 2");
                Integer type = scanner.nextInt();
                if (type == 1){
                    Dog dog = new Dog("none", 20, 20.0F, 20.0F, true, true);
                    System.out.println("Введите имя собаки: ");
                    dog.setName(scanner.nextLine());
                    System.out.println("Введите возраст собаки: ");
                    dog.setAge(scanner.nextInt());
                    System.out.println("Введите вес собаки: ");
                    dog.setWeight(scanner.nextFloat());
                    System.out.println("Введите рост собаки: ");
                    dog.setHeight(scanner.nextFloat());
                    System.out.println("Введите стерилизована ли она(true/false): ");
                    dog.setSterilized(scanner.nextBoolean());
                    System.out.println("Введите породистая ли она(true/false): ");
                    dog.setThoroughbred(scanner.nextBoolean());
                    zooService.addAnimal(dog, allAnimals);
                }
                if (type == 2){
                    Cat cat = new Cat("none", 20, 20.0F, 20.0F, "бродячий", true);
                    System.out.println("Введите имя кошки: ");
                    cat.setName(scanner.nextLine());
                    System.out.println("Введите возраст кошки: ");
                    cat.setAge(scanner.nextInt());
                    System.out.println("Введите вес кошки: ");
                    cat.setWeight(scanner.nextFloat());
                    System.out.println("Введите рост кошки: ");
                    cat.setHeight(scanner.nextFloat());
                    System.out.println("Введите ее статус: ");
                    cat.setStatus(scanner.nextLine());
                    System.out.println("Введите удлены ли когти(true/false): ");
                    cat.setDeletedCrowns(scanner.nextBoolean());
                    zooService.addAnimal(cat, allAnimals);
                }
                break;
            case(2):
                System.out.println("В разработке");
                break;
            case(3):
                zooService.printAllAnimals(allAnimals);
                break;
            case(4):
                System.out.println("Введите имя животного:");
                String name = scanner.nextLine();
                zooService.searchAnimal(name, allAnimals);


        }
    }
    private ZooService zooService = new ZooServiceImpl();
    public void addAnimal(Animal animal, List allAnimals){
        zooService.addAnimal(animal, allAnimals);
    }
    public void deleteAnimal(Animal animal, List allAnimals){
        zooService.deleteAnimal(animal, allAnimals);
    }
    public void printZoo(List allAnimals){
        zooService.printAllAnimals(allAnimals);
    }
    void searchAnimal(String name, List allAnimals){
        zooService.searchAnimal(name,allAnimals);
    }


}
