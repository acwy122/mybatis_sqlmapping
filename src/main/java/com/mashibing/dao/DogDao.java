package com.mashibing.dao;

import com.mashibing.bean.Dog;

public interface DogDao {

    public Dog selectById(Integer id);

    public Integer save(Dog dog);

}
