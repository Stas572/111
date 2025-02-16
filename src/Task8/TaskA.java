package Task8;
public class TaskA {
    private TaskA() {
    }

    public static void main(String[] args) {
        String text = "Пример123 !@# текста456 без@букв!";
        String longestSubstring = "";
        String currentSubstring = "";

        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch) || !Character.isLetter(ch)) {
                currentSubstring += ch;
            } else {
                if (currentSubstring.length() > longestSubstring.length()) {
                    longestSubstring = currentSubstring;
                }
                currentSubstring = "";
            }
        }

        // Последняя проверка после завершения цикла
        if (currentSubstring.length() > longestSubstring.length()) {
            longestSubstring = currentSubstring;
        }

        System.out.println("Первая подстрока максимальной длины без букв: " + longestSubstring);
    }

    public static TaskA createTaskA() {
        return new TaskA();
    }
}