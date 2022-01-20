package Service;

import org.springframework.stereotype.Component;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 22:23
 * @Computer CJJ_IT
 */
//真实角色
@Component("userService")
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("增加了一个用户！");
    }

    public void delete() {
        System.out.println("删除了一个用户！");
    }

    public void update() {
        System.out.println("修改了一个用户！");
    }

    public void query() {
        System.out.println("查询了一个用户！");
    }
}

