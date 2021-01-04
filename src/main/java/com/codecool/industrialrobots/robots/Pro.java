package com.codecool.industrialrobots.robots;

public class Pro extends Robots{
    public Pro(String name, int power) {
        super(name,power);
        maxPower = 12;
        maxWeight = 8;
    }

    @Override
    public void ship(int item) {
        power-=item;
        if(item>5)power-=item-5;
    }

    @Override
    public int howMutchItem() {
        int max = power>5 ? 5+(int)((power-4)/2) : power;
        return power>maxPower ? maxPower : power;
    }
}
