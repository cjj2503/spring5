package dao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;
import java.util.List;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 19:13
 * @Computer CJJ_IT
 */

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    //增加一些操作
    public List<User> SelectUser() {
        User user = new User("DDDL", 23, "185161");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(5);

        return mapper.SelectUser();
    }

    //新增
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    //删除
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}

