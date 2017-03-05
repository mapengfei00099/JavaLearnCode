package com.batraining.javabase.course03;

/*注意初始化的顺序
 */
public class Phone {
   private String broad;

    public Phone() {
        System.out.println("1");
        call();
    }

    public Phone(String broad) {
        System.out.println("2");
        this.broad = broad;
        call();
    }

    public void call(){
        System.out.println(this.broad + "   phone call.....");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("342");

    }
}
