package Task5;
import java.util.ArrayList;
import java.util.List;

class Cinema {
    private List<MovieSession> sessions;

    public Cinema() {
        sessions = new ArrayList<>();
    }

    public void addSession(String address, String movie, String time) {
        sessions.add(new MovieSession(address, movie, time));
    }

    public void displaySessions() {
        for (MovieSession session : sessions) {
            System.out.println(session);
        }
    }

    // Внутренний класс
    private class MovieSession {
        private String address;
        private String movie;
        private String time;

        public MovieSession(String address, String movie, String time) {
            this.address = address;
            this.movie = movie;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Address: " + address + ", Movie: " + movie + ", Time: " + time;
        }
    }

    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addSession("ул. Ленина, 10", "Пробуждение", "14:00");
        cinema.addSession("ул. Победы, 15", "Приключения", "16:30");
        cinema.displaySessions();
    }
}
