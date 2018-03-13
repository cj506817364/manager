package com.ppj.backend.manager.common.base.entity;

import com.ppj.backend.manager.common.enums.DataStatus;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* @ClassName: BaseEntity 
* @Description: TODO(抽象实体类，实现通用字段的getter/setter方法) 
* @author Vision Ho
* @date 2018年1月7日 上午12:22:09
 */
public abstract class BaseEntity implements Serializable {
    
	private static final long serialVersionUID = 1L;
	/**
	 * 自增主键
	 */
	protected long id;
	/**
	 * 数据状态
	 */
    protected DataStatus dataStatus;
    /**
     * 创建时间
     */
    protected LocalDateTime createTime;
    /**
     * 最后更新时间
     */
    protected LocalDateTime lastUpdateTime;


    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DataStatus getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(DataStatus dataStatus) {
        this.dataStatus = dataStatus;
    }

    public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BaseEntity other = (BaseEntity) obj;
        if (getId() == null) {
            if (other.getId() != null)
                return false;
        } else if (!getId().equals(other.getId()))
            return false;
        return true;
    }



    /** 由需要的编码字段的实体去覆盖 */
    protected StringBuilder getOrigendFiled() {
        return null;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
