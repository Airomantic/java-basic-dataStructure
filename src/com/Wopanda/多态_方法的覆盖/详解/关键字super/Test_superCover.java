package com.Wopanda.多态_方法的覆盖.详解.关键字super;


/**
 * @program: 基础算法
 * @description: static方法，final方法和final类中的方法都不能被子类覆盖
 *   result=
 *     我在北京上学
 * @author: jiangzq
 * @create: 2019-12-04 10:22
 **/
public class Test_superCover {
    public static void main(String[] args) {
        Student_2 student_2 = new Student_2("老蒋", 23, "北京");
        System.out.println(student_2.talk());
    }
}
/**
  *
  * Student_2类
  **/
class Student_2 extends Person_2{
    String place;

    //来自Person_2
    public Student_2(String name, int age, String place) {
        super.name = name;
        super.age = age;
        this.place = place;
    }

    public String talk() {
        return "我在" + this.place + "上学";//覆盖了Person_2中talk()的方法
    }
}
/**
  *
  * Person_2类
  **/
class Person_2{
    String name;
    int age;

    public String talk() {
        return "我是：" + this.name + "，今年：" + this.age + "岁";
    }
}