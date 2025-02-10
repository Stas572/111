import java.util.Scanner;
/*
Написать код программы, которая бы переводила числа одной любой системы счисления в любую другую.
 */

class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number; // вводимое число
        int ns; // номер системы счисления
        int nsnumb; // номер системы в которой число
        System.out.println("В какой системе счисления число?");
        nsnumb =
                Integer.parseInt(sc.nextLine());
        System.out.println("Введите число: ");
        number = Long.parseLong(sc.nextLine(), nsnumb);
        System.out.println("Введите систему счисления: ");
        ns = sc.nextInt();
        System.out.println("Полученое число" + Long.toString(number, ns));
    }
}