package com.ppj.backend.manager.common.enums;

import com.ppj.backend.manager.common.base.entity.DescriptionId;
import com.ppj.backend.manager.common.utils.EnumUtil;

/**
 * 数据状态
* @ClassName: DataStatus 
* @Description: TODO
* @author Vision Ho
* @date 2018年1月7日 上午12:18:29
 */
public enum DataStatus implements DescriptionId {
    
    DEFAULT(0, "default"),
    DELETE(1, "delete");
    protected int index;
    protected String description;
    
    private DataStatus(int index, String description) {
        this.index = index;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getIndex() {
        return index;
    }
    
    public static DataStatus findByIndex(int index){
        return EnumUtil.getEnum(DataStatus.class, index);
    }
}