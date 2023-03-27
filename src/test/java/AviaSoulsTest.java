import org.example.AviaSouls;
import org.example.Ticket;
import org.example.TicketTimeComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class AviaSoulsTest {
    Ticket ticket_1 = new Ticket("Аэропорт_1", "Аэропорт_2", 100, 10, 12);
    Ticket ticket_2 = new Ticket("Аэропорт_1", "Аэропорт_3", 200, 10, 14);
    Ticket ticket_3 = new Ticket("Аэропорт_1", "Аэропорт_4", 300, 10, 16);
    Ticket ticket_4 = new Ticket("Аэропорт_1", "Аэропорт_5", 600, 10, 18);
    Ticket ticket_5 = new Ticket("Аэропорт_1", "Аэропорт_6", 500, 10, 20);
    Ticket ticket_6 = new Ticket("Аэропорт_1", "Аэропорт_7", 400, 10, 22);

    @Test
    public void shouldCompareTo() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        Ticket[] tickets = { ticket_4, ticket_6 };
        Arrays.sort(tickets);

        Ticket[] expected = { ticket_6, ticket_4 };

        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void shouldSearch() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        Ticket[] tickets = { ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6 };
        Arrays.sort(tickets);

        Ticket[] expected = { ticket_1, ticket_2, ticket_3, ticket_6, ticket_5, ticket_4 };

        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void shouldCompareTime() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = { ticket_1, ticket_6 };
        Arrays.sort(tickets, timeComparator);

        Ticket[] expected = { ticket_1, ticket_6 };


        Assertions.assertArrayEquals(expected, tickets);
    }

    @Test
    public void shouldSearchAndSortByTimeFlight() {
        AviaSouls souls = new AviaSouls();
        souls.add(ticket_1);
        souls.add(ticket_2);
        souls.add(ticket_3);
        souls.add(ticket_4);
        souls.add(ticket_5);
        souls.add(ticket_6);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = { ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6 };
        Arrays.sort(tickets, timeComparator);

        Ticket[] expected = { ticket_1, ticket_2, ticket_3, ticket_4, ticket_5, ticket_6 };

        Assertions.assertArrayEquals(expected, tickets);
    }
}
