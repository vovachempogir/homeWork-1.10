import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(" ФИО сотрудника - " + lastName + " " + firstName + " " + middleName);
        System.out.println(" Задача 2 ");
        fullName = fullName.toUpperCase(Locale.forLanguageTag("IVANOV IVAN IVANOVICH"));
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "  + fullName);
        System.out.println(" Задача 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника —" + " " + fullName1);


    }
}