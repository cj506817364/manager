package com.ppj.backend.manager.common.base.entity;

/**
* @ClassName: DescriptionId 
* @Description: TODO(枚举数据基础接口) 
* @author Vision Ho
* @date 2018年1月7日 上午12:15:43 
* @param <T>
 */
public interface DescriptionId {
    
    /**
     * 获取枚举描述
     * @return
     */
    public String getDescription();

    /**
     * 获取枚举id
     * @return
     */
    public int getIndex();
    
}
