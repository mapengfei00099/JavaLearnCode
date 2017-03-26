package com.batraining.javabase.course08;

/**
 * Created by pengfei on 2017/3/26.
 */
public class ActionController {
    private int x;

    public void execute(BaseAction baseAction) {
        baseAction.doAction();
        System.out.println("do" + baseAction.getName() + "finish!");
    }

    public void control() {

        Object object = new Object();
        //匿名内部类,是一种特殊的内部类，他没有类名
        BaseAction left = new BaseAction() {
            //匿名内部类没有显式的构造，但是会调用父类的构造
            //匿名内部类除了继承类，还可以实现接口
            //匿名内部类和局部内部类一样可以访问外部类的属性和方法
            //匿名内部类和局部内部类一样可以访问方法的final变量和参数；
            @Override
            public void doAction() {
                System.out.println("左移");
                System.out.println(x);
            }
        };
        left.setName("左移");
        new ActionController().execute(left);
    }


}
