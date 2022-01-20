package Service;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 22:23
 * @Computer CJJ_IT
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("[Debug] 使用了一个"+msg+"方法");
    }
}

