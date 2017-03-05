package com.batraining.javabase.course06;

/**
 * DAO：数据访问对象 Data Access Object
 */
public interface UserDao {
    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    User queryByUserName(String userName);
    /**
     * 新增用户
     */
    void addUser(User user);

    /**
     * 删除用户
     * @param id
     */
    void deleteUser(int id);

}
