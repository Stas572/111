package Task7;
import java.util.function.Predicate;

public class Task17 {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        Predicate<Double[]> isTriangle = sides ->
                (sides[0] + sides[1] > sides[2]) &&
                        (sides[0] + sides[2] > sides[1]) &&
                        (sides[1] + sides[2] > sides[0]);

        // Проверка
        if (isTriangle.test(new Double[]{a, b, c})) {
            System.out.println("Можно образовать треугольник.");
        } else {
            System.out.println("Нельзя образовать треугольник.");
        }
    }
}
