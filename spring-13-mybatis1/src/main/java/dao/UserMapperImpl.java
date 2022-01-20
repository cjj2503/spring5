package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import pojo.User;

import java.util.List;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 19:13
 * @Computer CJJ_IT
 */

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> SelectUser(){
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.SelectUser();
    }
}
