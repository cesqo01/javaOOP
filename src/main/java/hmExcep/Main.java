package hmExcep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные пользователя (разделенные пробелом):");
        String userData = scanner.nextLine();

        UserDataParser.parseAndSaveUserData(userData);

        scanner.close();
    }
}
