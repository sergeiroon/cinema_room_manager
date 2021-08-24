package ru.roon.cinema;

public class StatisticItem extends ItemMenu {

    private Statistic statistic;

    public StatisticItem(int number, String description, Statistic statistic) {
        super(number, description);
        this.statistic = statistic;
    }

    @Override
    public void doSomething() {
        statistic.printStatistic();
    }
}
