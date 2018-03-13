package com.ppj.backend.manager.module.controller;

import com.ppj.backend.manager.common.base.entity.ResponseEntity;
import com.ppj.backend.manager.module.dto.UserDto;
import com.ppj.backend.manager.module.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String toHello(){
        return "Hello PPJ";
    }

    @RequestMapping("/findAll")
    public List<UserDto> doFindAll(){
        return userService.findAll();
    }
    /**
     * RESTful-API  根据ID查询订单
     * @param id 主键
     * @return ResponseEntity
     */
    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable("id") Long id) {
        return ResponseEntity.ok("SUCCESS",  userService.getById(id));
    }

    /**
     * RESTful-API  更新订单
     * @param userDto user对象
     * @return ResponseEntity
     */
    @PutMapping()
    public ResponseEntity<Object> putMember(UserDto userDto) {
        int result = userService.update(userDto);
        if (result > 0) {
            return ResponseEntity.ok();
        }
        return ResponseEntity.fail();
    }

    /**
     * RESTful-API  新增订单
     * @param userDto user对象
     * @return ResponseEntity
     */
    @PostMapping("/{id}")
    public ResponseEntity<Object> postMember(UserDto userDto) {
        int result = userService.add(userDto);
        if (result > 0) {
            return ResponseEntity.ok();
        }
        return ResponseEntity.fail();

    }
    /**
     * RESTful-API  根据ID删除订单
     * @param id 主键
     * @return ResponseEntity
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleateMember(@PathVariable("id") Long id) {
        int result = userService.deleteById(id);
        if (result > 0) {
            return ResponseEntity.ok();
        }
        return ResponseEntity.fail();
    }

}
