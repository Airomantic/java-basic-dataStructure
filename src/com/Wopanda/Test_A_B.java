package com.Wopanda;

/**
 * @program: 基础算法
 * @description:
 *        result =
 *            name_A
 *            name_B
 * @author: jiangzq
 * @create: 2019-11-28 15:46
 **/
public class Test_A_B {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.str);//光看颜色变化就知道了，打印出name_A
        a.show();//虽然这里写上show()会对A父类的show()有颜色变化，但是之后会被B的show()覆盖，打印出name_B
    }
}
class A{
    String str = "name_A";
    public void show() {
        System.out.println("name_A");
    }
}

class B extends A {
    String str = "name_B";

    public void show() {
        System.out.println("name_B");
    }
}
