package ru.roon.cinema;

public class CinemaHall {

    private int rows;
    private int column;
    private String[][] seats;
    private Statistic statistic;

    public CinemaHall(int rows, int column, Statistic statistic) {
        this.rows = rows;
        this.column = column;
        this.statistic = statistic;
        this.seats = new String[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                seats[i][j] = "S";
            }
        }
        statistic.setTotalTickets(rows * column);
        statistic.setTotalIncome(totalSum());
    }

    public int totalSum() {
        int totalSum = 0;
        int allSeats = rows * column;
        if (allSeats < 60) {
            totalSum = allSeats * 10;
        } else {
            int oneHalfSeats = rows / 2;
            int oneHalfSum = oneHalfSeats * column * 10;
            int secondHalfSum = (rows - oneHalfSeats) * column * 8;
            totalSum = oneHalfSum + secondHalfSum;
        }
        return totalSum;
    }

    public void printSchema() {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int i = 1; i <= column; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < column; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean buyTicket(int row, int seat) {

        if (row > rows || seat > column) {
            System.out.println("Wrong input!");
            return false;
        }
        if (seats[row - 1][seat - 1].equals("B")) {
            System.out.println("That ticket has already been purchased!");
            return false;
        }
        seats[row - 1][seat - 1] = "B";
        int price;
        int allSeats = rows * column;
        if (allSeats < 60) {
            price = 10;
        } else {
            price = row > rows / 2 ? 8 : 10;
        }
        statistic.addPurchasedTickets(1);
        statistic.addCurrentIncome(price);
        System.out.println(String.format("Ticket price: $%d", price));
        return true;
    }
}
