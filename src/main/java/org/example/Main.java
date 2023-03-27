package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Ticket ticket_1 = new Ticket(
                "Аэропорт_1",
                "Аэропорт_2",
                100,
                10,
                12
        );
        Ticket ticket_2 = new Ticket(
                "Аэропорт_1",
                "Аэропорт_3",
                200,
                10,
                14
        );

        TicketTimeComparator timeComparator = new TicketTimeComparator();
        Ticket[] tickets = {ticket_1, ticket_2};
        Arrays.sort(tickets, timeComparator);

    }
}