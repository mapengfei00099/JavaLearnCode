package com.batraining.javabase.course06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pengfei on 2017/3/5.
 */
public class UserDaoImpl implements UserDao {
    private List<User> userDB = new ArrayList<User>();
    {
        userDB.add(new User(1,"xiaozhang","111111","zhangxx",0));
        userDB.add(new User(2,"xiaoli","222222","lixx",0));
    }
    @Override
    public User queryByUserName(String userName) {
        for (User user : userDB) {
            if(user.getUserName().equals(userName)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void addUser(User user) {
        userDB.add(user);

    }

    @Override
    public void deleteUser(int id) {
        Iterator<User> iterator = userDB.iterator();
       while (iterator.hasNext()){
         User user =  iterator.next();
         if(user.getId()== id){
             iterator.remove();
         }
       }
    }
}
