package Task9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class FloatNumberProcessor {
    public static void main(String[] args) {
        String filename = "numbers.txt"; // Укажите путь к файлу
        List<Double> numbers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    try {
                        double num = Double.parseDouble(part.trim());
                        if (num < Double.MIN_VALUE || num > Double.MAX_VALUE) {
                            throw new CustomException("Недопустимое значение: " + num);
                        }
                        numbers.add(num);
                    } catch (NumberFormatException e) {
                        throw new CustomException("Некорректное число: " + part);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка: файл не найден.");
        } catch (CustomException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        if (!numbers.isEmpty()) {
            double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();
            double average = sum / numbers.size();
            System.out.println("Сумма: " + sum);
            System.out.println("Среднее: " + average);
        } else {
            System.out.println("Список чисел пуст.");
        }
    }
}
