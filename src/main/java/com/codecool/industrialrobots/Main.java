package com.codecool.industrialrobots;

import com.codecool.industrialrobots.robots.Eco;
import com.codecool.industrialrobots.robots.Mac;
import com.codecool.industrialrobots.robots.Pro;

public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        createRobots(work);

        work.rechargeAndGetItems(3,20);
        work.rechargeAndGetItems(2,32);
        work.rechargeAndGetItems(5,20);
        work.rechargeAndGetItems(3,16);

    }

    public static void createRobots(Work work){
        Mac mac = new Mac("R2:MAC",4);
        work.addRobot(mac);
        Eco eco1 = new Eco("3CPO:ECO",3);
        work.addRobot(eco1);
        Pro pro = new Pro("BB8:PRO",10);
        work.addRobot(pro);
        Eco eco2 = new Eco("E12:ECO",4);
        work.addRobot(eco2);
    }
}
