package com.atguigu.admin.service.impl;

import com.atguigu.admin.bean.User;
import com.atguigu.admin.mapper.UserMapper;
import com.atguigu.admin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/21 15:30
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
