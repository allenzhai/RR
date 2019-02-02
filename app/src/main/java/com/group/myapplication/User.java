package com.group.myapplication;

public class User
{
    private static int uid = 0;

    private String name;
    private int phoneNum;
    private int userId;

    User(String name, int phoneNum)
    {
        userId = uid++;
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public int getUserId()
    {
        return userId;
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
