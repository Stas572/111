package Task10;

import java.io.*;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String inputFilePath = args.length > 0 ? args[0] : "input.txt";
        String outputFilePath = args.length > 1 ? args[1] : "output.txt";

        StringBuilder content = new StringBuilder();

        // Чтение файла
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        // Удаление комментариев
        String result = removeComments(content.toString());

        // Запись результата в выходной файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write(result);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    public static String removeComments(String code) {
        // Убираем однострочные комментарии
        String singleLineCommentPattern = "//.*?$";
        // Убираем многострочные комментарии
        String multiLineCommentPattern = "/\\*[\\s\\S]*?\\*/";

        return code.replaceAll(singleLineCommentPattern, "")
                .replaceAll(multiLineCommentPattern, "")
                .replaceAll("[\\r\\n]+", System.lineSeparator()); // Удаляем пустые строки
    }
}
