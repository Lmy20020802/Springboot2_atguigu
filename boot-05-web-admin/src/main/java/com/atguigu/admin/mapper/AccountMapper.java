package com.atguigu.admin.mapper;

import com.atguigu.admin.bean.Account;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName AccountMapper
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/21 11:26
 **/
//@Mapper
public interface AccountMapper {

    public Account getAcct(Long id);
}
