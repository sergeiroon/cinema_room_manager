package ru.roon.cinema;

public class ShowSeatsItem extends ItemMenu{

    private CinemaHall cinemaHall;

    public ShowSeatsItem(int number, String description, CinemaHall cinemaHall) {
        super(number, description);
        this.cinemaHall = cinemaHall;
    }

    @Override
    public void doSomething() {
        cinemaHall.printSchema();
    }
}
