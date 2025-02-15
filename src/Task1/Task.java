package Task1;
/*
Ввести с консоли n чисел. На консоль вывести:
Элементы, котрые равны полусумме соседних элементов.
 */

import java.util.Scanner;

class Task11B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество элементов n: ");
        int n = input.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print((i+1) +"-й элемент: ");
            a[i] = input.nextDouble();
        }

        System.out.println("Числа, равные полусумме двух соседних: ");
        for (int i = 1; i < a.length - 1; i++) {
            if (isHalfSum(a[i - 1], a[i], a[i + 1])) {
                System.out.print(a[i] + "");
            }
        }

    }
    public static boolean isHalfSum(double valueLeft, double value, double valueRight) {
        return value == (valueLeft + valueRight) / 2;
    }
}

