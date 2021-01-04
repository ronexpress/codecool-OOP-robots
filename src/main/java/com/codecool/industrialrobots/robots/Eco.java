package com.codecool.industrialrobots.robots;

public class Eco extends Robots{
    public Eco(String name, int power) {
        super(name,power);
        maxPower = 4;
        maxWeight = 6;
    }

    @Override
    public void ship(int item) {
        power = power - (int)((item+1)/2);
    }

    @Override
    public int howMutchItem() {
        int max = power*2;
        return max > maxWeight ? maxWeight : max;
    }
}
