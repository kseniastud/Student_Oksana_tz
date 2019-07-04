import java.util.Scanner;

/**
 * Created by Ксю on 03.07.2019.
 */
public class tz_2 {
    public static void main(String[] args) {
        String Name = "Вячеслав";
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals(Name)){
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }

    }
}
