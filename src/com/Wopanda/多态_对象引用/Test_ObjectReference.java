package com.Wopanda.多态_对象引用;

/**
 * @program: 基础算法
 * @description: 对象的引用型变量可以指向不同形式的对象，即：子类对象可以作为父类对象来使用
 *        polymorphic生物多态的
 *  *      多态的本质：一个程序中同名的不同方法
 *  *            例1：通过子类对父类方法的覆盖实现多态
 *  *            例2：通过一个类中方法的重载实现多态
 *  *            例3; 将子类的对象作为父类的对象实现多态     √
 *    result =
 *      职工姓名：老蒋年龄:23工资:5500.0
 *      职工姓名：老蒋年龄:23工资:10000.0
 * @author: jiangzq
 * @create: 2019-12-04 09:45
 **/
public class Test_ObjectReference {
    public static void main(String[] args) {
        Employee employee = new Employee("老蒋", 23, 5500);
        System.out.println(employee.getInfo());
        Employee employee_2 = new Manager("老蒋", 23, 10000f, 500f);
        System.out.println(employee_2.getInfo());
    }
}
/**
  *  Employee类
  *
  **/
class Employee {
    String name;
    int age;
    float salary;

     Employee() {
    }

     Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getInfo() {
        return "职工姓名：" + name + "年龄:" + age + "工资:" + salary;
    }
}
/**
  *
  * Manager类
  **/
class Manager extends Employee {
    float allowance;

    Manager(String name, int age, float salary, float aaa) {
        this.name = name; //左边的this后的参数是来自父类，右边来自自己的参数
        this.age = age;
        this.salary = salary;
        allowance = aaa;//都来自自己
    }
}