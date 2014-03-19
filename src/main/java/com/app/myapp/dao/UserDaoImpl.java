package com.app.myapp.dao;

import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	
	
	@Override
	public int getLoginResult(Map<String, String> map) {
		// TODO Auto-generated method stub
        return (Integer) getSqlSession().selectOne("userDao.getLoginResult",map); // userDao는 xml매퍼파일의 네임스페이스, getLoginResult         
	}

}
