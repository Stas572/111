package Task1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите имя: ");
        String n = in.nextLine();

        System.out.println("ПРивет :" + n);
        in.close();
    }
}