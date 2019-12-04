package com.Wopanda.多态_方法的重载;

/**
 * @program: 基础算法 方法的重载
 * @description: polymorphic生物多态的
 *  *      多态的本质：一个程序中同名的不同方法
 *  *            例1：通过子类对父类方法的覆盖实现多态
 *  *            例2：通过一个类中方法的重载实现多态       √
 *  *            例3; 将子类的对象作为父类的对象实现多态
 *      result =
 *       int_sum(3,5)=8
 *       int_sum(3,5,6)=14
 *       double_sum(3.1,5.6)=8.7
 * @author: jiangzq
 * @create: 2019-12-04 09:29
 **/
public class Test_dataType {
    public static void main(String[] args) {
        int int_sum;
        double double_sum;
        int_sum = number_Add(3, 5);
        System.out.println("int_sum(3,5)="+int_sum);
        int_sum = number_Add(3, 5,6);
        System.out.println("int_sum(3,5,6)="+int_sum);
        double_sum = number_Add(3.1,5.6);
        System.out.println("double_sum(3.1,5.6)="+double_sum);
    }

    private static int number_Add(int x, int y) {
        return x + y;
    }

    private static int number_Add(int x, int y, int z) {
        return x + y + z;
    }
    private static double number_Add(double x, double y) {
        return x + y;
    }
}
