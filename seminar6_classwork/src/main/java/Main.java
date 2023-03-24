import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль какой хатите установить: ");
        String pass = scanner.nextLine();
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            view.setController(new Controller(view, new Model(pass)));
        });
    }
}
