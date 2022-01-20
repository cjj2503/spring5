package dao;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;

import java.util.List;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 19:13
 * @Computer CJJ_IT
 */

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    public List<User> SelectUser(){
        return getSqlSession().getMapper(UserMapper.class).SelectUser();
    }
}
