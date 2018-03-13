package com.ppj.backend.manager.module.service.impl;

import com.ppj.backend.manager.module.dao.UserDao;
import com.ppj.backend.manager.module.dto.UserDto;
import com.ppj.backend.manager.module.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户实现类
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    @Override
    public UserDto getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public int add(UserDto obj) {
        return userDao.add(obj);
    }

    @Override
    public int update(UserDto obj) {
        return userDao.update(obj);
    }

    @Override
    public int deleteById(Long id) {
        return userDao.deleteById(id);
    }

    @Override
    public List<UserDto> findAll() {
        return userDao.findAll();
    }
}
