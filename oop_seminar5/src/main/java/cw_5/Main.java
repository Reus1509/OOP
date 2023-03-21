package cw_5;

import cw_5.view.UserView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("enter age");
        Integer age = scanner.nextInt();
        System.out.println("enter salary");
        Float salary = scanner.nextFloat();
        UserView userView = new UserView();
        userView.saveUser(name, age, salary);
    }
}
