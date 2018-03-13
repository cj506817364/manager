package com.ppj.backend.manager.module.dao;

import com.ppj.backend.manager.common.base.dao.BaseDao;
import com.ppj.backend.manager.module.dto.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends BaseDao<UserDto> {

    List<UserDto> findAll();
}
