package com.example.recyclerview.Model;

public class UserModel
{
     String crepe,mac,pizza,food;
     int Crepe,Mac,Pizza,Food;

    public UserModel()
    {

    }

    public UserModel(String crepe, String mac, String pizza, String food, int crepe1, int mac1, int pizza1, int food1)
    {
        this.crepe = crepe;
        this.mac = mac;
        this.pizza = pizza;
        this.food = food;
        Crepe = crepe1;
        Mac = mac1;
        Pizza = pizza1;
        Food = food1;
    }

    public String getCrepe() {
        return crepe;
    }

    public void setCrepe(int crepe) {
        Crepe = crepe;
    }

    public void setCrepe(String crepe) {
        this.crepe = crepe;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(int mac) {
        Mac = mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(int pizza) {
        Pizza = pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getFood() {
        return food;
    }

    public void setFood(int food) {
        Food = food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
