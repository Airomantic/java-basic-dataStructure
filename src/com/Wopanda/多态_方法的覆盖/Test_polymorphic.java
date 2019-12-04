package com.Wopanda.多态_方法的覆盖;

/**
 * @program: 基础算法 方法的覆盖
 *   方法名称相同，但却在不同的场合做不同的事
 * @description: polymorphic生物多态的
 *      多态的本质：一个程序中同名的不同方法
 *            例1：通过子类对父类方法的覆盖实现多态    √
 *            例2：通过一个类中方法的重载实现多态
 *            例3; 将子类的对象作为父类的对象实现多态
 *      result =
 *         覆盖的方法1
 *         方法2
 * @author: jiangzq
 * @create: 2019-12-04 09:08
 **/
public class Test_polymorphic {

    public static void main(String[] args) {
        Person person = new Student();//这样就表示Student自动继承了Person
        person.fun_1();
        person.fun_2();
    }
}
