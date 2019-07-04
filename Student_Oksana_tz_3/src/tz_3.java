import java.util.Scanner;
/**
 * Created by Ксю on 04.07.2019.
 */
public class tz_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите елементы массива");
        for (int i = 0; i < size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Елементы массива кратные 3:");
        for (int i = 0; i < size; i++){
            if (array[i] % 3 == 0){
                System.out.println(array[i]);
            }
        }
    }
}
