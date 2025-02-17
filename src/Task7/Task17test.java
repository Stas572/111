package Task7;

import java.util.Arrays;
import java.util.List;

public class Task17test {
    public static void main(String[] args) {
        // Лямбда-выражение для проверки существования треугольника
        TriangularCondition isTriangle = (a, b, c) -> (a + b > c) && (a + c > b) && (b + c > a);

        // Тестовые случаи
        List<int[]> tests = Arrays.asList(
                new int[]{3, 4, 5},  // Треугольник
                new int[]{1, 2, 3},  // Не треугольник
                new int[]{5, 7, 10}  // Треугольник
        );

        // Проверка
        for (int[] sides : tests) {
            System.out.printf("Можно ли из сторон %d, %d, %d образовать треугольник? %s%n",
                    sides[0], sides[1], sides[2], isTriangle.check(sides[0], sides[1], sides[2]) ? "Да" : "Нет");
        }
    }

    @FunctionalInterface
    interface TriangularCondition {
        boolean check(int a, int b, int c);
    }
}
