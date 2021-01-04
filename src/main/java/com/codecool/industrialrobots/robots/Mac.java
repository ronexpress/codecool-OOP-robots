package com.codecool.industrialrobots.robots;

public class Mac extends Robots{
    public Mac(String name, int power) {
        super(name,power);
        maxPower = 10;
        maxWeight = 10;
    }

    @Override
    public void ship(int item) {
        power-=item;
    }

    @Override
    public int howMutchItem() {
        return power>maxWeight ? maxWeight : power;
    }
}
