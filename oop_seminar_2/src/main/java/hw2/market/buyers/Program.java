package hw2.market.buyers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Human> allHuman = new ArrayList<>(Arrays.asList(new Human("Никита", true, false),
                new Human("Александр", false, false),
                new Human("Антон", true, true)));

        System.out.println(allHuman);
    }
}
