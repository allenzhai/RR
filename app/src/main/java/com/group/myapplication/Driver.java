package com.group.myapplication;

public class Driver extends User
{
    private int seats;

    Driver()
    {
        super();
        seats = 5;
    }

    Driver(String name, int phoneNum, int seats)
    {
        super(name, phoneNum);
        this.seats = seats;
    }

    public int getSeats()
    {
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }
}
