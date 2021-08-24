package ru.roon.cinema;

import java.util.Scanner;

public class BuyTicketItem extends ItemMenu{

    private CinemaHall cinemaHall;
    private Scanner scanner;

    public BuyTicketItem(int number, String description, CinemaHall cinemaHall, Scanner scanner) {
        super(number, description);
        this.cinemaHall = cinemaHall;
        this.scanner = scanner;
    }

    @Override
    public void doSomething() {
        int row;
        int seat;
        do {
            System.out.println("Enter a row number:");
            row = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            seat = scanner.nextInt();
        } while (!cinemaHall.buyTicket(row, seat));
    }
}
