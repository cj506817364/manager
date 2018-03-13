package com.ppj.backend.manager.common.enums;

import com.ppj.backend.manager.common.base.entity.DescriptionId;
import com.ppj.backend.manager.common.utils.EnumUtil;

public enum ErrorCode implements DescriptionId {
    
    //默认值
    DEMO_ERR(0000001, "Demo异常");
    
    protected int index;
    protected String description;
    
    private ErrorCode(int index, String description) {
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
    
    public static ErrorCode findByIndex(int index){
        return EnumUtil.getEnum(ErrorCode.class, index);
    }
}
