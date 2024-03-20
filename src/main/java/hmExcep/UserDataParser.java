package hmExcep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserDataParser {
    public static void parseAndSaveUserData(String userData) {
        String[] data = userData.split(" ");
        if (data.length < 6) {
            System.out.println("Ошибка: введено меньше данных");
            return;
        } else if (data.length > 6) {
            System.out.println("Ошибка: введено больше данных");
            return;
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String dateOfBirth = data[3];
        String phoneNumber = data[4];
        String gender = data[5];

        try {
            validateData(surname, name, patronymic, dateOfBirth, phoneNumber, gender);
            UserData user = new UserData(surname, name, patronymic, dateOfBirth, phoneNumber, gender);
            saveUserData(user);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void validateData(String surname, String name, String patronymic, String dateOfBirth, String phoneNumber, String gender) {
        if (!isValidDateFormat(dateOfBirth)) {
            throw new IllegalArgumentException("неверный формат даты рождения");
        }

        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("неверный формат номера телефона");
        }

        if (!isValidGender(gender)) {
            throw new IllegalArgumentException("неверное значение пола");
        }
    }

    private static boolean isValidDateFormat(String dateOfBirth) {
        String dateRegex = "\\d{2}\\.\\d{2}\\.\\d{4}";
        return dateOfBirth.matches(dateRegex);
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "\\d+";
        return phoneNumber.matches(phoneRegex);
    }

    private static boolean isValidGender(String gender) {
        return gender.equals("f") || gender.equals("m");
    }

    private static void saveUserData(UserData user) {
        try {
            String filename = user.getSurname() + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            String userData = user.getSurname() + " " + user.getName() + " " + user.getPatronymic()
                    + " " + user.getDateOfBirth() + " " + user.getPhoneNumber() + " " + user.getGender();
            writer.write(userData);
            writer.newLine();
            writer.close();
            System.out.println("Данные успешно записаны в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл.");
            e.printStackTrace();
        }
    }
}
