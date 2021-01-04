package com.codecool.industrialrobots.robots;

public abstract class Robots {
    private String name;
    protected int power;
    protected int maxPower;
    protected int weight;
    protected int maxWeight;

    public Robots(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void recharge(int power){
        this.power += power;
        if(this.power>this.maxPower){
            this.power=this.maxPower;
        }
    }

    public void ship(int item){
    }

    public int howMutchItem(){
        return 0;
    }

}
