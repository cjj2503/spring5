package service;

import dao.UserDao;
import dao.UserDaoImpl;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 17:28
 * @Computer CJJ_IT
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    public void getUser() {
        userDao.getUser();
    }
}

