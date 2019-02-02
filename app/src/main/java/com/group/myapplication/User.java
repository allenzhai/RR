package com.group.myapplication;

public class User
{
    private String name;
    private int phoneNum;

    User()
    {
    }

    User(String name, int phoneNum)
    {
        this.name = name;
        this.phoneNum = phoneNum;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPhoneNum()
    {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum)
    {
        this.phoneNum = phoneNum;
    }

}
