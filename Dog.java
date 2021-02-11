package com.game;

public class Dog extends Animal
{
    double  Price;
    String  Name;
    String  Gender;
    int     Health;
    int Age;

    void set_data(String name, String gender)
    {
        Name = name;
        Gender = gender;
        if(gender.equals("Female") || gender.equals("female"))
        {
            Price = 4500;
            Age = 8;
        }
        else
        {
            Price = 5000;
            Age = 10;
        }
        Health = 100;
    }
    void set_price(double price)
    {
        Price = price;
    }
    void set_health(int health)
    {
        Health = health;
    }
    String get_name()
    {
        return Name;
    }
    double get_price()
    {
        return Price;
    }
    String get_gender()
    {
        return Gender;
    }
    int get_health()
    {
        return Health;
    }
    int get_Age()
    {
        return Age;
    }
    void setAge(int age)
    {
        Age = age;
    }
}
