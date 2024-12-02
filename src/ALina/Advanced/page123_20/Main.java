package ALina.Advanced.page123_20;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main implements TheLongestFlight {
    public static void main(String[] args) {
        Flight[] flights = {
                new Flight(1, LocalDateTime.of(2023, 11, 25, 14, 30, 0),
                        LocalDateTime.of(2023, 11, 25, 15, 30, 0), "London", "Boying", 600),
                new Flight(2, LocalDateTime.of(2023, 11, 26, 10, 0, 0),
                        LocalDateTime.of(2023, 11, 26, 12, 30, 0), "New York", "Airbus", 1200),
                new Flight(3, LocalDateTime.of(2023, 11, 27, 8, 15, 0),
                        LocalDateTime.of(2023, 11, 27, 11, 0, 0), "Paris", "Boying", 800),
                new Flight(4, LocalDateTime.of(2023, 11, 28, 17, 45, 0),
                        LocalDateTime.of(2023, 11, 28, 20, 30, 0), "Berlin", "Airbus", 700),
                new Flight(5, LocalDateTime.of(2023, 11, 29, 13, 0, 0),
                        LocalDateTime.of(2023, 11, 29, 15, 30, 0), "Rome", "Boying", 650),
                new Flight(6, LocalDateTime.of(2023, 11, 30, 9, 30, 0),
                        LocalDateTime.of(2023, 11, 30, 12, 0, 0), "Tokyo", "Airbus", 1400)
        };

        Main main = new Main();
        Flight longestFlight = main.longFlight(flights);
    System.out.println("Рейс с максимальной длительностью: " + longestFlight);

    }

    @Override
    public Flight longFlight(Flight[] flights) {
        Flight longestFlight = null;
        long maxDuration = 0;

        for (int i = 0; i < flights.length; i++) {
            Duration duration = Duration.between(flights[i].getDepartureTime(), flights[i].getArrivalTime());
            long flightDurationMinutes = duration.toMinutes();

            if (flightDurationMinutes > maxDuration) {
                maxDuration = flightDurationMinutes;
                longestFlight = flights[i];
            }
        }

        return longestFlight;
    }
}
