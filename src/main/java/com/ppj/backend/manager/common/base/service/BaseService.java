package com.ppj.backend.manager.common.base.service;

import org.apache.ibatis.annotations.Param;

public interface BaseService<T> {
    
    public T getById(@Param("id") Long id);

    public int add(T obj);

    public int update(T obj);

    public int deleteById(@Param("id") Long id);
}
