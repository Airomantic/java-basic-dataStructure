package com.Wopanda.多态_方法的覆盖.详解;

/**
 * @program: 基础算法
 * @description:
 *    result =
 *      车子的颜色：sliver
 *      车子的最高时速:200
 * @author: jiangzq
 * @create: 2019-12-04 10:09
 **/
public class Car extends Vehicle {
    public static void main(String[] args) {
        String color = "sliver";
        int maxSpeed = 200;
        Car c = new Car();
        System.out.println("车子的颜色："+color);
        System.out.println("车子的最高时速:"+maxSpeed);
    }
}
class Vehicle{
    String color = "red";
    int maxSpeed = 100;

    public void start() {
        System.out.println("车子被启动了");
    }
}