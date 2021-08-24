package ru.roon.cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        Statistic statistic = new Statistic();
        CinemaHall cinema = new CinemaHall(rows, seats, statistic);
        Menu menu = new Menu(new ArrayList<>() {{
            add(new ShowSeatsItem(1, "Show the seats", cinema));
            add(new BuyTicketItem(2, "Buy a ticket", cinema, scanner));
            add(new StatisticItem(3, "Statistics", statistic));
            add(new ExitItem(0, "Exit"));
        }});
        while (!menu.exit()) {
            menu.printMenu();
            int itemMenu = scanner.nextInt();
            menu.selectItem(itemMenu);
        }
    }

}

