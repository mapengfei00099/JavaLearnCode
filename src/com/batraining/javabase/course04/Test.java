package com.batraining.javabase.course04;
public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        Person student = new Person();//多态

        //instanceof
        System.out.println(student instanceof  Student);
        System.out.println(student instanceof  Person );
        System.out.println(student instanceof Object);
        System.out.println(student instanceof  Teacher);
        //student.play();
        //强制类型转换
        float a=  3.1f;
        int b = (int)a;
        Student student2 = (Student)student;
        student2.play();
        printPersonInfo(student);




    }

    public static  void printPersonInfo(Person person){
       if(person instanceof Teacher){
           Teacher teacher = (Teacher) person;
           System.out.println(person.getName() +" is 老师");
       }
       if(person instanceof  Student){
           Student teacher = (Student) person;
           System.out.println(person.getName() +" is 学生");
       }
    }
}
