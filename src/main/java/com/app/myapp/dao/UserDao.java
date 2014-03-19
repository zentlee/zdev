package com.app.myapp.dao;

import java.util.Map;

public interface UserDao {
    public int getLoginResult(Map<String, String> map); // 파라미터를 맵으로 받을 것이다. @Param 어노테이션을 사용한 결과 패키지 명을 
}