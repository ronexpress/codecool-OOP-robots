package com.codecool.industrialrobots;

import com.codecool.industrialrobots.robots.Robots;

import java.util.LinkedList;
import java.util.List;

public class Work {

    List<Robots> robots = new LinkedList<Robots>();
    private int itemsWaiting;
    public Work() {
        itemsWaiting =0;
    }


    public void addRobot(Robots robot){
        robots.add( robot );
    }

    public void rechargeAndGetItems(int power, int items){
        itemsWaiting += items;
        System.out.println("--- PowerUp: "+power+" ItemArrived: "+items+"->"+itemsWaiting+"---");
        for(Robots robot: robots){
            robot.recharge(power);
            int maxItems = robot.howMutchItem();
            System.out.print(robot.getName()+"  power:"+robot.getPower()+" items:");
            if(itemsWaiting > maxItems){
                System.out.print(itemsWaiting+"-"+maxItems);
                robot.ship(maxItems);
                itemsWaiting-=maxItems;
            }else{
                System.out.print(itemsWaiting+"-"+itemsWaiting);
                robot.ship(itemsWaiting);
                itemsWaiting=0;
            }
            System.out.println("  power:"+robot.getPower());
        }
        System.out.println(itemsWaiting+" items waiting");
    }

    public void printStatus(){
        for(Robots robot: robots){
            System.out.println(robot.getName()+" power: "+robot.getPower());
        }
        System.out.println();
    }

}
