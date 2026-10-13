import java.util.PriorityQueue;
import java.util.Comparator;

class Ticket {
    String name;
    int urgency;

    Ticket(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class TicketTriage {
    public static void main(String[] args) {

        // Create a priority queue
        PriorityQueue<Ticket> tickets =
            new PriorityQueue<>(
                Comparator.comparingInt(t -> t.urgency)
            );

        // Insert the tickets
        tickets.offer(new Ticket("Printer", 3));
        tickets.offer(new Ticket("Network", 1));
        tickets.offer(new Ticket("Login", 2));

        // Display tickets in priority order
        System.out.println("Ticket processing order:");

        while (!tickets.isEmpty()) {
            System.out.println(tickets.poll());
        }
    }
}