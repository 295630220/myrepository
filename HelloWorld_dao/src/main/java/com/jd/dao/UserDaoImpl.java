package com.jd.dao;

import com.jd.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/2/4.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private SqlSession sqlSession;

    @Override
    public User login(User user) {
        User existUser = sqlSession.selectOne("UserMapper.login", user);
        return existUser;
    }
}
