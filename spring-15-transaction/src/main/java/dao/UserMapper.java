package dao;

import pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> SelectUser();

    //添加一个用户
    int addUser(User user);

    //根据id删除用户
    int deleteUser(int id);

}
