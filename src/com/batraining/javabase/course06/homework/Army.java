package com.batraining.javabase.course06.homework;

/**
 * Created by pengfei on 2017/3/11.
 */
public class Army {
    private Weapon[] w;
   // private int addWeaponNum;

    public Army(int num){
        w =new Weapon[num];
    }

    public void addWeapon(Weapon weapon){
      // w[addWeaponNum]  =weapon;
       //addWeaponNum ++;


        for (int i = 0; i < w.length; i++) {
            if(w[i] == null){
                w[i] = weapon;
                break;
            }
        }

    }

    public void attackAll(){
        for (Weapon weapon : w) {
            if(weapon!= null){
                weapon.attack();
            }

        }

    }

    public void moveAll(){
        for (Weapon weapon : w) {
            if(weapon!= null){
                weapon.move();
            }
        }

    }

    public static void main(String[] args) {
        Weapon weapon1 = new Tank();
        Weapon weapon2 = new Flighter();
        Weapon weapon3 = new WarShip();
        Army army = new Army(5);
        army.addWeapon(weapon1);
        army.addWeapon(weapon2);
        army.addWeapon(weapon3);
        army.attackAll();
        army.moveAll();
    }

}
