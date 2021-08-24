package ru.roon.cinema;

public class Statistic {

    private int purchasedTickets;
    private int totalTickets;
    private int currentIncome;
    private int totalIncome;

    public void printStatistic() {
        double percentage = (double)purchasedTickets / (double)totalTickets * 100;
        String str = String.format("Number of purchased tickets: %d \n" +
            "Percentage: %.2f%%\n" +
            "Current income: $%d\n" +
            "Total income: $%d\n", purchasedTickets, percentage, currentIncome, totalIncome);
        System.out.println(str);
    }

    public void addPurchasedTickets(int number) {
        this.purchasedTickets += number;
    }

    public void setTotalTickets(int number) {
        this.totalTickets = number;
    }

    public void addCurrentIncome(int number) {
        this.currentIncome += number;
    }

    public void setTotalIncome(int number) {
        this.totalIncome = number;
    }
}
