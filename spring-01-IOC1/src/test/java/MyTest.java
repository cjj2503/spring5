import service.UserService;
import service.UserServiceImpl;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 17:30
 * @Computer CJJ_IT
 */
public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层，dao层他们不需要接触！
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}

