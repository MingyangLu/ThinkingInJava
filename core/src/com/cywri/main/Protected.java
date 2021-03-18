package com.cywri.main;
import static com.cywri.utils.Print.*;

/**
 * Protected权限访问
 *
 */

public class Protected extends Villian{
    private int orcNumber;
    public Protected(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        //在这里可以直接调用set方法，因为TestProtected是Villian的子类
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args){
        Protected testProtected = new Protected("Limburger", 12);
        print(testProtected);
        testProtected.change("Bob", 19);
        print(testProtected);
        /*输出结果
            Orc 12: I'm Villian and my name is Limburger
            Orc 19: I'm Villian and my name is Bob
         */
    }
}
class Villian {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villian(String name) {
        this.name = name;
    }
    public String toString() {
        return "I'm Villian and my name is " + name;
    }
}
