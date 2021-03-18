package com.cywri.main;
import java.util.Random;

/**
 *  <p>static和final的区别：static指的是全局只有一份，当类加载的时候才会初始化，JVM只会为它分配一次内存，而final指的是不能改变值，即常量。
 *  使用static修饰的对象或者方法，位于元空间中，每个类只有一份；使用final修饰的对象或者方法，保存在JVM的堆中，
 *  引用于栈中，和普通的变量没有太大的区别，都是随着实例而产生和死亡
 *
 * <p></p>
 */
class Value {
    //Package access
    int i;
    public Value(int i){
        this.i = i;
    }
}

public class Final {
    private static Random random = new Random(47);
    private String id;
    public Final(String id) {
        this.id = id;
    }
    //
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    public static final int VALUE_THREE = 39;
}
