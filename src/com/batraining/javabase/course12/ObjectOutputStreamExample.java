package com.batraining.javabase.course12;

import java.io.*;

/**
 * Created by pengfei on 2017/4/23.
 */
public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       exampleObjectOutputStream();
       exampleObjectInputStream();


    }
 private static  void exampleObjectInputStream() throws IOException, ClassNotFoundException {
     FileInputStream fileInputStream = new FileInputStream("objectStream.data");
     //ObjectInputStream与ObjectOutputStream相反，它是将流数据转为对应的对象
     ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
     long number = objectInputStream.readLong();
     boolean readBoolean = objectInputStream.readBoolean();
     //反序列化成一个对象
     //1、类名一致（包含包名) 2、属性不能缺少，属性类型不能变 3序列化版本号一致
     Employee employee = (Employee)objectInputStream.readObject();
     System.out.println(number);
     System.out.println(readBoolean);
     System.out.println(employee.getName());
     objectInputStream.close();
     fileInputStream.close();

 }

    private static void exampleObjectOutputStream() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("objectStream.data");
        //ObjectOutoutStream包装了outputStream，使其拥有直接writeObject的方法
        //功能：把Object对象转为输出流，但是要求对象完成序列化；
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeLong(32423L);//4个字节
        objectOutputStream.writeBoolean(false);//一个字节
        //objectOutputStream.writeObject(new Object());//抛出序列化异常
        //序列化一个对象
        Employee employee = new Employee("张三", "男", 123);
        employee.setObject(new Object());
        objectOutputStream.writeObject(employee);

        objectOutputStream.flush();
        outputStream.flush();
        objectOutputStream.close();
        outputStream.close();
        //objectOutputStream.writeObject(new Object());
    }
}
