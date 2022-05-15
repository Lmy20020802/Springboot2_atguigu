package com.atguigu.admin.service;

import com.atguigu.admin.bean.City;

/**
 * @ClassName CityService
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/21 15:50
 **/
public interface CityService {
    public City getById(Long id);

    public void saveCity(City city);
}
