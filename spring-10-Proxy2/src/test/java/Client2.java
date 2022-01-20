import Service.UserServiceImpl;
import Service.UserServiceProxy;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 22:24
 * @Computer CJJ_IT
 */
public class Client2 {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.delete();
    }
}

