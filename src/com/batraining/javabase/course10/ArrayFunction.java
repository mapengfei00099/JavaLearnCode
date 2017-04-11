package com.batraining.javabase.course10;

import java.util.Arrays;

/**
 * Created by pengfei on 2017/4/9.
 */
public class ArrayFunction {
    private Object[] objects = new Object[20];
    int count=0;//数组中元素的个数
    /**向数组增加元素
     *
     * @param object
     */
    public void add(Object object){
        //确定index 的值，然后进行赋值
        int index = count;
        objects[index] =object;
        count++;

    }

    /**
     * 删除数据中的元素
     * @param object
     */
    public void remove(Object object){

    }

    /**
     * 更新数据中的元素
     * @param index
     * @param object
     */
    public  void update(int index,Object object){

    }

    /**
     * 查询数组的是否存在某个对象
     * @param object
     * @return
     */
    public boolean query(Object object){

        return false;
    }

    public String toString(){
        return  Arrays.toString(this.objects);
    }
    public static void main(String[] args) {
        ArrayFunction arrayFunction = new ArrayFunction();
        arrayFunction.add(1);
        arrayFunction.add(2);
        arrayFunction.add(1);
        arrayFunction.add(2);

        arrayFunction.add(1);
        arrayFunction.add(2);
        arrayFunction.add(1);
        arrayFunction.add(2);
        arrayFunction.add(1);
        arrayFunction.add(1);
        arrayFunction.add(2);
        arrayFunction.add(1);
        arrayFunction.add(2);
        arrayFunction.add(1);
        arrayFunction.add(2);
        arrayFunction.add(2);
        arrayFunction.add(1);
        arrayFunction.add(2);
        arrayFunction.add(1);
        arrayFunction.add(2);



        arrayFunction.add(1);
        arrayFunction.add(2);



        System.out.println(arrayFunction.toString());
    }

}
