package com.batraining.javabase.course06;

/**
 * Created by pengfei on 2017/3/5.
 */
public class User {
    private int id;
    private String userName;
    private String password;
    private String name;
    private int sex;

    public User(int id, String userName, String password, String name, int sex) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        //注意下面instanceof 和强制类型的转换
        if (!(o instanceof  User)){
            return  false;
        }
        User temp = (User) o;
        if(!this.userName.equals(temp.userName)){
            return false;
        }
        if(!this.name.equals(temp.name)){
            return false;
        }
        if(!this.password.equals(temp.password)){
            return false;
        }
        if(this.id!=temp.id){
            return false;
        }
        if(this.sex!=temp.sex){
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User(1,"zhangsan","111111","zhangsan",0);
        User user2 = new User(1,"zhangsan","111111","zhangsan",0);
        System.out.println(user1.equals(user2));
        System.out.println(user1.toString());


    }
}

