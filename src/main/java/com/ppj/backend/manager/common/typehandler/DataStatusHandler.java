package com.ppj.backend.manager.common.typehandler;

import com.ppj.backend.manager.common.enums.DataStatus;
import org.apache.ibatis.type.MappedTypes;
import com.ppj.backend.manager.common.base.typehandler.EnumTypeHandler;

@MappedTypes(DataStatus.class)
public class DataStatusHandler extends EnumTypeHandler {

}
