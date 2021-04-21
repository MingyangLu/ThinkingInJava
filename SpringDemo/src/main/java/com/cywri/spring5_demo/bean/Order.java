package com.cywri.spring5_demo.bean;

public class Order {
    private String oname;

    public Order(){
        System.out.println("通过构造器创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("为bean的属性设置值和其他bean引用（调用set方法）");
    }

    public void initMethod(){
        System.out.println("调用bean的初始化方法（需要进行配置）");
    }

    public void destroyMethod(){
        System.out.println("（5）当容器关闭时候，调用bean的销毁方法（需要进行配置销毁方法）");
    }
}
