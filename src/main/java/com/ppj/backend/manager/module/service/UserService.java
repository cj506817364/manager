package com.ppj.backend.manager.module.service;


import com.ppj.backend.manager.common.base.service.BaseService;
import com.ppj.backend.manager.module.dto.UserDto;

import java.util.List;

/**
 * 会员服务接口
* @ClassName: MemberService 
* @Description: TODO 
* @author Vision Ho
* @date 2018年1月7日 上午10:33:54
 */
public interface UserService extends BaseService<UserDto> {

    List<UserDto> findAll();
}
