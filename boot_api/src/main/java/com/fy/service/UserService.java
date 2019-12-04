package com.fy.service;

import com.fy.pojo.User;

/**
 * Created by Administrator on 2019/11/27 0027.
 */
public interface UserService {

    User selByWid(Integer wid);

    User selByEmail(String email);

    int updateByEmail(Integer wid, String email);

    int updateByPrimaryKey(User record);

    User selByopenid(String openid);

    User selListById(String id);

}
