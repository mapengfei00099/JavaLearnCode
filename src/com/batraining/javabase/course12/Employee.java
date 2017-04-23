package com.batraining.javabase.course12;

/**
 *序列化： 1 必须继承java.io.Serializable
 *        2 通常还会写序列化版本号serialVersionUID，其对应的值尽量的随机并且唯一
 *        3 如果不写serialVersionUID，那么在运行时会生成一个序列化版本号，但是不推荐
 *        4 值不为null的属性要序列化，那么对应的属性类型必须序列化
 *        5 transient数据不能被序列化
 */
public class Employee implements java.io.Serializable {
    private static final long serialVersionUID = -43243242344325234L;
    private String name;
    private String sex;
    private int sales;
    private int age;
    private transient  Object object;

    public Employee() {
    }

    public Employee(String name, String sex, int sales) {
        this.name = name;
        this.sex = sex;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
