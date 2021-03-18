package com.cywri.main;
import static com.cywri.utils.Print.*;

/**
 * <p>测试构造函数在子类和父类中的调用顺序
 * <p>由上至下调用
 * <p>注意，慎用继承，除非你明确需要从新类到基类进行向上转型，所以通常使用组合即可
 */
public class Extends extends Father {

    Extends(){
        print("TestExtends constructor");
    }

    /**
     *  <p>输出结果：
     *      Grandfather constructor
     *      Father constructor
     *      TestExtends constructor
     */
    public static void main(String[] args){
        Extends testExtends = new Extends();


    }
}

class Grandfather{
    Grandfather(){
        print("Grandfather constructor");
    }
}

class Father extends Grandfather{
    Father(){
        print("Father constructor");
    }
}