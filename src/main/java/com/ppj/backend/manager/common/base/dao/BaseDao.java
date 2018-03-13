package com.ppj.backend.manager.common.base.dao;

import com.ppj.backend.manager.common.base.entity.BaseEntity;
import org.apache.ibatis.annotations.Param;

/**
* @ClassName: BaseDao 
* @Description: TODO(通用dao-提供基本的crud方法) 
* @author Vision Ho
* @date 2018年1月7日 上午12:23:48 
* @param <T>
 */
public interface BaseDao<T extends BaseEntity> {

    public T getById(@Param("id") Long id);

    public int add(T obj);

    public int update(T obj);

    public int deleteById(@Param("id") Long id);
}
